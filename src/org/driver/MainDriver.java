package org.driver;
import java.sql.*;
public class MainDriver {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "vishvapostgres";
        Connection con = DriverManager.getConnection(
                url,
                username,
                password
        );
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");
        System.out.println(
                "Register ID | Name | Location | Email | Age | CGPA"
        );
        while (rs.next()) {
            System.out.println(
                    rs.getInt("register_id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("location") + " | " +
                            rs.getString("email") + " | " +
                            rs.getInt("age") + " | " +
                            rs.getBigDecimal("cgpa")
            );
        }
        con.close();
    }
}
