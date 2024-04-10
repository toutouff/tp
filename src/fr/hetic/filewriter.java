package fr.hetic;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void FileWriter(String path, int[] resArray) {
        String[] filepath = path.split("\\.");
        String filename = filepath[0] + ".res";
        try {
            FileWriter myWriter = new FileWriter(filename);
            for (int i = 0; i < resArray.length; i++) {
                System.out.println(resArray[i]);
                myWriter.append(String.valueOf(resArray[i]) + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
    }
}
