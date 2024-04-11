package fr.hetic;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import fr.hetic.calculatorfromfile;
import fr.hetic.folderExplorer;

public class calculatorfromFolder {
    public static void main(String[] args) throws IOException{
        File folder = new File(args[0]);
        File[] files = folderExplorer.listFilesForFolder(folder);
        Arrays.stream(files)
            .filter(file -> !file.isDirectory() && file.getName().endsWith(".op"))
            .forEach(file -> {
                System.out.println(file.getName());
                String[] path = {file.getPath()};
                try {
                    calculatorfromfile.main(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
    }
}
