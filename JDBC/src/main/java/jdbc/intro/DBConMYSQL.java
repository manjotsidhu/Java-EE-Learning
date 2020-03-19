package jdbc.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConMYSQL {
    public static void main(String[] args) {
        String TAG = String.format("[ %s ]: ", DBConOracle.class.getName());

        try {
            //Step 1: Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 2: Create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java", "root", "");

            //Step 3: Create the statement object
            Statement stmt = con.createStatement();

            //Step 4: Execute query
            ResultSet rs = stmt.executeQuery("select * from users");
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
