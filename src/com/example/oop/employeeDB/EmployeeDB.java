package com.example.oop.employeeDB;
import java.sql.Connection;
import java.sql.DriverManager;


    public class EmployeeDB {
        static Connection con;
        static String driver = "com.mysql.jdbc.Driver";
        static String url = "jdbc:mysql://localhost/PayollSystem";
        static String uname = "debian-sys-maint";
        static String pass = "EQnMpflulwTyqzU8";


        public static Connection getConnection() throws Exception{
            if(con == null){
                Class.forName(driver);
                con = DriverManager.getConnection(url,uname, pass);
            }
            return con;
        }
}
