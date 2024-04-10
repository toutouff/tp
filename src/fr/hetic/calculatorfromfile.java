package fr.hetic;
import java.nio.file.*;
import java.io.*;





/**
 * calculatorfromfile
 */
public class calculatorfromfile {
    public static void main(String[] args) throws IOException {
        String filepath = args[0];
        System.out.println(filepath);
        String[] file = filereader.FileReader(filepath);
        int[] resArray = new int[file.length];
        for (int i = 0; i < file.length; i++) {
            String temp = file[i];
            String[] line = temp.split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);
            String ope = line[2];
            int res = calculator.Calculator(num1, num2, ope);
            resArray[i] = res;
        }
        filewriter.FileWriter(filepath,resArray);
    }
}
