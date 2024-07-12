package com.pedkm.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd {
    public static void main(String[]args){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/mltest";
        String user = "pedkm";
        String password = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Erreur lors de la connexion : " + ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erreur lors de la fermeture de la connexion :" + ex.getMessage());
            }
        }
    }
}
