package fr.hetic;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class CalculatorFromDB {
    public static void main(String[] args) throws IOException {
        ResultSet rs = DatabaseReader.readData();
        try {
            while (rs.next()) {
                OpLine line = new OpLine(rs);
                FileWriteToFile.writeLineToFile(line);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
