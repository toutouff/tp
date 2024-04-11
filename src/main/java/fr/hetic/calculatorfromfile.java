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
        String[] resArray = new String[file.length];
        for (int i = 0; i < file.length; i++) {
            String temp = file[i];
            String[] line = temp.split(" ");
            String res = calculator.Calculator(line);
            resArray[i] = res;
        }
        filewriter.FileWriter(filepath,resArray);
    }
}
