package fr.hetic;

import java.io.File;
import java.io.IOException;
import fr.hetic.calculatorfromfile;
import fr.hetic.folderExplorer;

public class calculatorfromFolder {
    public static void main(String[] args) throws IOException{
        File folder = new File(args[0]);
        File[] files = folderExplorer.listFilesForFolder(folder);
        for (File file : files) {
            if (!file.isDirectory() && file.getName().endsWith(".op")) {
                System.out.println(file.getName());
                String[] path = {file.getPath()};
                calculatorfromfile.main(path);
            }
        }
    }
}
