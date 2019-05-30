import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.*;
import javax.servlet.http.*;


import normalisation.Lexique;
import normalisation.MotNormalizer;
import normalisation.Pair;




@SuppressWarnings("serial")
public class LanceChoix extends HttpServlet {
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	    response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance Choix!</title>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<link href=\"..//..//style.css\" rel=\"stylesheet\" type=\"text/css\" />");
        out.println("</head>");
        out.println("<body>");

	    String requete;
        requete = request.getParameter("requete");     
        if(requete!=null) {      
        System.out.println("1.Requete saisie :"+requete);
        requete=requete.replaceAll("[«»\"?]"," ");
        //lire le fichier lemmes.txt and creer une instance of Lexique
        BufferedReader br=null;
        br = new BufferedReader(new FileReader("..//..//..//lemmes.txt"));
        Lexique lexique = new Lexique(br);
       //lire le fichier stop.txt and creer une instance of StopList
        Scanner s = new Scanner(new File("..//..//..//stoplist_P16.txt"));
        ArrayList<String> stoplist = new ArrayList<String>();
        while (s.hasNext()){
            stoplist.add(s.next());
        }
        s.close();
        
        Pair result=new Pair();
        Set<String> candidat;
        String methode;
        
        StringTokenizer tokens = new StringTokenizer(requete, " \t\n\r\f'");
        MotNormalizer normalizer = new MotNormalizer(stoplist, lexique, false, true);
        String choix;
        out.println("<h4 style=\"text-indent:1em\">CHOISIS TON MOT</h4>");
        out.println("<hr class='style-two'/>");
        out.println("<form id=\"form\" name=\"form\" method=\"GET\" accept-charset='utf-8' action=\"LanceRequete\" target = \"result\" style=\"text-indent:1em\">" );
        while(tokens.hasMoreElements()){ 
        	String mot=tokens.nextToken();
            result=normalizer.normalize(mot.toLowerCase());
            candidat=result.getMots();
            methode=result.getMethode();
            if(candidat.size()>1) {
              java.util.Iterator<String> itr=candidat.iterator(); 
              out.println("<select name=\"mot\" id=\"mot\">");
              while(itr.hasNext()) { 
            	  choix=itr.next();
            	  String mot_original=choix.split(":")[1];
            	  String lemm=choix.split(":")[0];
            	  out.println("<option value="+lemm+" title='"+methode+": "+lemm+"'>"+mot_original+"</option>");
            	  out.println("<br>");
              }

               out.println("</select>"); 
            } else if(candidat.size()==1) {
            	String b=candidat.iterator().next();
          	    String lemm=b.split(":")[0];
          	    String mot_original=b.split(":")[1];
        	    out.print("<input name='mot' type='hidden' value='"+lemm+"'>");
            	out.print(" <span title='"+methode+": "+lemm+"'><u>"+mot_original+"</u></span> ");
            } 
            else {
            	out.print("<span title='"+methode+"'>"+mot+"</span> ");
            }
        }
        out.println("<input type=\"image\" name=\"submit\" value=\"valider\" src=\"..//..//valider.png\"  width=\"30px\" height=\"30px\" align=\"top\" />");
        out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		}
}
}
