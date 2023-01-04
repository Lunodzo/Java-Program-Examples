package JavaDB;

import java.sql.*;

public class javaDB {
    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sample";

    //Submit DB Credentials
    static final String USER = "root";
    static final String PASS = " ";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement statement = null;

        //Register JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");

        //Open connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        //Excecute Query
        System.out.println("Creating statement...");
        statement = conn.createStatement();

        String sql = "SELECT * from user";
        ResultSet rs = statement.executeQuery(sql);

        //Extract Data
        while (rs.next()) {
            //Retrieve by column name
            int id = rs.getInt("id");
            int username = rs.getInt("username");
            String password = rs.getString("password");
            
            //Diplay the mojawapi
            System.out.print("ID: " + id);
            System.out.print("USERNAME: " + username);
            System.out.print("PASSWORD: " + password);
        }

        //STEP 6: Clean-up environment
        rs.close();
        statement.close();
        conn.close();
    }
}
