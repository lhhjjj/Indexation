import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SqlFormatter {

	    public static String clearParenthesis(String input)
	    {
	        
	        return input.replaceAll("(\\( | \\))", " ").replaceAll("count  fichier","distinct fichier");
	    }

	    public static String handleConj(String input)
	    {
	       input=input.replaceAll("[ ]+"," ").replace("select distinct email from numero", "select distinct email from email");
	       return input;
	    }

	    public static String handleJoin(String input)
	    {
	        input=input.replaceAll("AND"," ) INTERSECT (").replaceAll("OR","UNION").replaceAll("NOT","EXCEPT");;
	        input="(" +input+ ")";
	        String pattern="([A-Za-z()]+) = \'([\\S\\p{IsLatin}]+)\'";
	        Pattern r=Pattern.compile(pattern);
	        Matcher m=r.matcher(input);
	        if(m.find()&&m.group(1).equals("LOWER(rubrique)"))
	          {
	        	input=input.replace(m.group(0), m.group(1)+" LIKE "+"\'%"+m.group(2)+"%\'");
	          }
	          while(m.find()) {
	        	 if(m.group(1).equals("LOWER(rubrique)")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from rubrique where "+m.group(1)+" LIKE "+"\'%"+m.group(2)+"%\'");
	        	 }	
	        	 else if(m.group(1).equals("email")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from email where "+m.group(0));
	        	 }
	        	 else if(m.group(1).equals("numero")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from numero where "+m.group(0));
	        	 }
	        	 else if(m.group(1).equals("mot")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from titretext where "+m.group(0));
	        	 }
	        	 else if(m.group(1).equals("mois")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from datemoisenlettres where "+m.group(0));
		        	 }	        	 
	        	 else if(m.group(1).equals("annee")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from datemoisenlettres where "+m.group(0));
		        	 }
	        	 else if(m.group(1).equals("jour")) {
	        		 input=input.replace(m.group(0),"select distinct fichier from datemoisenlettres where "+m.group(0));
		        	 }
		        	 
	          }
	
	        return input.replaceAll("[ ]+"," ");
	    }


	    public static String format(String input)
	    {
	        String par = SqlFormatter.clearParenthesis(input);
	        par=SqlFormatter.handleConj(par);
	        return SqlFormatter.handleJoin(par);
	    }
	}

