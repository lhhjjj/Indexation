package normalisation;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MotNormalizer {
    private List<String> stoplist;
    private Lexique lexique;
    private Boolean accentSensitive;


    public MotNormalizer(List<String> stoplist, Lexique lexique, Boolean accentSensitive, Boolean input) {
        this.stoplist = stoplist;
        this.lexique = lexique;
        this.accentSensitive = accentSensitive;
    }

    public MotNormalizer(List<String> stoplist, Lexique lexique) {
        this(stoplist, lexique, false, true);
    }

    public Pair normalize(String word) throws IOException {
            word=word.toLowerCase();
            Set<String> result2=new HashSet<>();
            Pair res_final=new Pair();
            if (!stoplist.contains(word)) {
                String result = lexique.get(word); 
                if (result != null) {
                	result2.add(result+":"+word);
                	res_final.setMethode("OK");
                	res_final.setMots(result2);
                } else if (word.length() > 2 && !(result2 = lexique.getWithPrefixSearch(word, 0.8, accentSensitive)).isEmpty()) {
                	res_final.setMethode(new String("Préfixe"));
                	res_final.setMots(result2);
                }  else if (word.length() > 2 && !(result2 = lexique.getWithLevenshtein(word, 2)).isEmpty()) {
                	res_final.setMethode(new String("Levenshtein"));
                	res_final.setMots(result2);
                }              
               
                if(result2.isEmpty()) {
                	 Set<String> a=new HashSet<String>();
                	 a.add(word+":"+word);
                	 res_final.setMethode("NonCorrection");
                 	 res_final.setMots(a);    	
                }
            }
               return res_final;
   }

}

