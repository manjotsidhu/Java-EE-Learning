package jdbc.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConMSAccess {
    public static void main(String[] args) {
        String TAG = String.format("[ %s ]: ", DBConMSAccess.class.getName());

        try {
            //Step 1: Load the JDBC Driver class
            //Class.forName("com.sun.jdbc.odbc.JdbcOdbcDriver");

            String msAccessDBName = "libs/testdb.accdb";
            String dbURL = "jdbc:odbc:Driver="
                    + "{Microsoft Access Driver (*.mdb, *.accdb)};"
                    + "DBQ="
                    + msAccessDBName
                    + ";DriverID=22;READONLY=true";

            //Step 2: Create  the connection object
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://db\\testdb.accdb");

            //Step 3: Create the statement object
            Statement stmt = con.createStatement();

            //Step 4: Execute query
            ResultSet rs = stmt.executeQuery("select * from Users");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            //Step 5: Close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(TAG + e);
            e.printStackTrace();
        }

    }
}
