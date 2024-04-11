package fr.hetic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void FileWriter(String path, String[] resArray) {
        File file = new File(path);
        String filename = file.getName().substring(0, file.getName().lastIndexOf('.')) + ".res";
        String fullpath = file.getParentFile().getAbsolutePath() + "/" + filename;
        try (FileWriter myWriter = new FileWriter(fullpath)) {
            for (String s : resArray) {
                System.out.println(s);
                myWriter.append(s).append("\n");
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
