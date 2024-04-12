package fr.hetic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader {
    private static final String URL = "jdbc:postgresql://SG-hetic-mt4-java-5275-pgsql-master.servers.mongodirector.com:5432/TP";
    private static final String USER = "etudiant";
    private static final String PASSWORD = "MT4@hetic2324";

    public static ResultSet readData() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM FICHIER INNER JOIN LIGNE ON FICHIER.ID = LIGNE.FICHIER_ID WHERE FICHIER.TYPE = 'OP' ORDER BY FICHIER.ID,POSITION;\n";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
