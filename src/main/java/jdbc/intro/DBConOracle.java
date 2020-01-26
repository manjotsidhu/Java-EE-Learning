package jdbc.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConOracle {
    public static void main(String[] args) {
        String TAG = String.format("[ %s ]: ", DBConOracle.class.getName());

        try {
            //Step1: Load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Step2: Create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XE", "system", "password");

            //Step3: Create the statement object
            Statement stmt = con.createStatement();

            //Step4: Execute query
            ResultSet rs = stmt.executeQuery("select * from employees");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            //Step5: Close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(TAG + e);
            e.printStackTrace();
        }

    }
}
