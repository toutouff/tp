package fr.hetic;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OpLine {
    int param1;
    int param2;
    String operator;
    int position;
    String filename;
    String result;

    public OpLine(ResultSet rs) throws SQLException {
        param1 = rs.getInt("PARAM1");
        param2 = rs.getInt("PARAM2");
        operator = rs.getString("OPERATEUR");
        position = rs.getInt("POSITION");
        filename = rs.getString("NOM");
        result = calculator.Calculator(Op());
    }

    public String[] Op(){
        return new String[]{String.valueOf(param1), String.valueOf(param2),operator};
    }
}
