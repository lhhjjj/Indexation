package normalisation;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.*;


public class Lexique {
    private HashMap<String, String> lemmes = new HashMap<>();

    public Lexique(BufferedReader br) {
        String line;
        try {
            String[] token = new String[2];
            while ((line=br.readLine())!=null) {
                token = line.split("\t");
                lemmes.put(token[0].trim(), token[1].trim());
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    /**
     * This method returns the Lemme of the given token
     * @param token
     * @return
     */
    public String get(String token)
    {
        return lemmes.getOrDefault(token, null);
    }

    public Set<String> getWithPrefixSearch(String token, Double threshold)
    {
        return this.getWithPrefixSearch(token, threshold, false);
    }

    /**
     * This method returns a list of best Lemmes for the given token
     * using a prefix search
     * @param token : token to search
     * @param threshold : threshold of the prefix search
     * @return
     */
    public Set<String> getWithPrefixSearch(String token, Double threshold, Boolean accentSensitive)
    {
        HashMap<Double, Set<String>> lemmesByCommonLetters = new HashMap<>();
        if (!accentSensitive) // remove accents from input if needed
            token = Normalizer.normalize(token, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");

        for(Map.Entry<String, String> entry : lemmes.entrySet()) {
            String word = entry.getKey();
            if (!accentSensitive) // remove accents from current word if needed
                word = Normalizer.normalize(word, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
            String lemme = entry.getValue();

            Integer nbCommons = 0;

            // count number of common prefix letters in both words
            int i = 0;
            while(i < word.length() && i < token.length() && word.charAt(i) == token.charAt(i)) {
                nbCommons++;
                i++;
            }
            double taux_common = (double)nbCommons/Math.max(word.length(), token.length());
            //stocker les lemmse candidats dans un set
            if (taux_common >= threshold) {
                if (lemmesByCommonLetters.containsKey(taux_common)) {         	
                    lemmesByCommonLetters.get(taux_common).add(lemme+":"+word);
                } else {
                    lemmesByCommonLetters.put(taux_common, new HashSet<String>(Arrays.asList(lemme+":"+word)));
                }
            }
        }

        //trouver et retouner les meilleurs lemmes candidats
        if(!lemmesByCommonLetters.isEmpty()) {
            Object[] key_arr=lemmesByCommonLetters.keySet().toArray();
            Arrays.sort(key_arr, Collections.reverseOrder());

            return lemmesByCommonLetters.get(key_arr[0]);
        } else {
            return Collections.emptySet();
        }
    }

    public Set<String> getWithLevenshtein(String token, Integer minDistance) {
        return this.getWithLevenshtein(token, minDistance, true);
    }

    /**
     * This method returns a list of best Lemmes for the given token
     * using the Levenshtein distance
     * @param token : token to search
     * @param minDistance : threshold for the minimum Levenshtein distance
     * @return
     */
    public Set<String> getWithLevenshtein(String token, Integer minDistance, Boolean improved)
    {
        HashMap<Integer, Set<String>> lemmesMinDistance = new HashMap<>();

        for(Map.Entry<String, String> entry : lemmes.entrySet()) {
            String word = entry.getKey();
            String lemme = entry.getValue();

            //obtenir la distance entre les deux mots
            Integer words_dist = this.computeLevenshteinDistance(token, word, improved);
            //stocker les lemmse candidats dans un set
            if(words_dist <= minDistance) {
                if (lemmesMinDistance.containsKey(words_dist)) {
                    lemmesMinDistance.get(words_dist).add(lemme+":"+word);
                } else {
                    lemmesMinDistance.put(words_dist, new HashSet<String>(Arrays.asList(lemme+":"+word)));
                }
            }
        }

        //trouver et retouner les meilleurs lemmes candidats
        if(!lemmesMinDistance.isEmpty()) {
            Object[] key_arr=lemmesMinDistance.keySet().toArray();
            Arrays.sort(key_arr);
            return lemmesMinDistance.get(key_arr[0]);
        }  else {
            return Collections.emptySet();
        }

    }

    public Integer computeLevenshteinDistance(String word1, String word2, Boolean improved)
    {
        // definir le tableau de distance
        int word_len=word2.length();
        int token_len=word1.length();
        int[][] distance=new int[token_len+1][word_len+1];

        //initialiser la premiere colonne et la premiere ligne de tableau Distance
        for(int i=0;i<=word1.length();i++)
            distance[i][0]=i;
        for(int j=0;j<=word2.length();j++)
            distance[0][j]=j;

        for(int i=1; i<=token_len; i++)  {
            char token_i=word1.charAt(i-1);
            for(int j=1; j<=word_len;j++) {
                char word_j=word2.charAt(j-1);
                int cost=token_i==word_j?0:1;
                if(cost==0) {
                    distance[i][j]=distance[i-1][j-1];
                } else{
                        distance[i][j]=Math.min(distance[i-1][j],Math.min(distance[i][j-1],distance[i-1][j-1]))+1;
                  }              
               if (i > 1 && j > 1 && word1.charAt(i-1) == word2.charAt(j-2) && word1.charAt(i-2) == word2.charAt(j-1)) {
                    distance[i][j] = Math.min(distance[i][j], distance[i-2][j-2] + cost);
             }
                }
            }
        //obtenir la distance entre les deux mots
        return distance[token_len][word_len];
    }
}


