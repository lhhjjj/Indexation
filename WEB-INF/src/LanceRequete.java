import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;



import grammaire.tal_sqlLexer;
import grammaire.tal_sqlParser;

import java.sql.*;

@SuppressWarnings("serial")
public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance requete!</title>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<link href=\"..//..//style.css\" rel=\"stylesheet\" type=\"text/css\" />");
        out.println("</head>");
        out.println("<body>");

	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
       //url = "jdbc:postgresql://tuxa/dblo17";
	// dans certaines configurations locales il faut d�finir l'url par :
	url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// ---- configure END
	    request.setCharacterEncoding("UTF-8");
	    String[] mots=request.getParameterValues("mot");
	    if(mots!=null) {
	    	
	    requete=String.join(" ",mots);    
	    System.out.println("2.Requete normalisee : "+requete);
	    
        tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRStringStream(requete));
        CommonTokenStream tokenss = new CommonTokenStream(lexer);
        tal_sqlParser parser = new tal_sqlParser(tokenss);
        
		String sql;
		try {
			sql = parser.listerequetes();
			 System.out.println("3.SQL original : "+sql);
			requete=SqlFormatter.format(sql);
		} catch (RecognitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        System.out.println("4. SQL formatte : "+requete);
        
	if (requete != null) {
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
	    		System.err.print("ClassNotFoundException: ");
	    		System.err.println(e.getMessage());
			}
		try {
			Connection con;
			Statement stmt;
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
		    ResultSetMetaData rsmd=rs.getMetaData();
		    
		    int count=0;
		    if(rsmd.getColumnName(1).equals("total")) {
		    	rs.next();
	            count=rs.getInt("total");
		    }
		    else {
		    	rs.last();
			    count=rs.getRow();
		    }
			rs.beforeFirst();	

			if(count<0)
				count=0;
	        out.println("<hr class='style-one'/ style=\"text-indent:2em\">");
			out.println("<h4 style=\"text-indent:1em\">Nombre de resultats : " +count+"</h4>");
			out.println("<hr class=\"style-two\" style=\"text-indent:1em\"/>");
			
					
			nbre=rsmd.getColumnCount();
			Boolean is=rs.next();
			if(!is) {
				out.print("<p>Aucun résultat</p>");
			}
			while (is) {
				for (int i=1; i<=nbre;i++){
				nom = rsmd.getColumnName(i);
				String s = rs.getString(nom);
				if(nom.equals("fichier"))
				{  
					out.print("<a href='http://www4.utc.fr/~lo17/TELECHARGE/BULLETINS_LO17/"+s+"' target ='right'><p style=\"text-indent:1em\">"+s+"</p></a>");	}
				else {
					out.print("<p >"+s+"</p>");}
				}
			out.print("<p>");
			is=rs.next();
			}

		out.println("</body>");
		out.println("</html>");
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
	    			}
			}
        	}
	}
}
}