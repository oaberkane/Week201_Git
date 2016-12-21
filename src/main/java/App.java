
import java.sql.Connection;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class App {

	public static void main(String[] args) throws SQLException {
		System.out.println("___ App ___");
		
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:data.db");
		
		Connection conn = ds.getConnection();
		
		// TODO : select all users.
		// ...
		
		conn.close();
	}
}

/*
import java.sql.*;

public class App
{
  public static void main( String args[] )
  {
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:data.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}*/
