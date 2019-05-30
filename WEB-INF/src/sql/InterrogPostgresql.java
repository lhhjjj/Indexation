package sql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class InterrogPostgresql {

    private String username;
    private String password;
    private String url;


	public InterrogPostgresql(String username, String password, String url)
    {
        this.username = username;
        this.password = password;
        this.url = url;
		try {
			Class.forName("org.postgresql.Driver");
		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
    }

    public InterrogPostgresql()
    {
        this("lo17xxx", "dblo17", "jdbc:postgresql://tuxa.sme.utc/dblo17");
    }

    public ResultSet execRequete(String requete) throws SQLException {
		Connection con;
		Statement stmt;

		// Establish Connection to the database at URL with usename and password
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
		// Send the query and bind to the result set
		return stmt.executeQuery(requete);
	}

	public String formatResults(ResultSet rs) throws SQLException {
		String r = "";
		ResultSetMetaData metadata = rs.getMetaData();
		int columnCount = metadata.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.println(metadata.getColumnName(i) + " : "+ rs.getString(i));
			}
			System.out.println("-------------");
		}

		return r;
	}

	public static void main(String args[]) throws SQLException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("sql : ");
		String requete = br.readLine();
		InterrogPostgresql interrog = new InterrogPostgresql();

		// INSTALL/load the Driver (Vendor specific Code)

		try {
			ResultSet rs = interrog.execRequete(requete);
			System.out.println(interrog.formatResults(rs));
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
