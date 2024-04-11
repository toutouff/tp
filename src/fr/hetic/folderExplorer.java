package fr.hetic;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class folderExplorer {
    public static void main(String[] args) {
        System.out.println("hello world");
        File filename = new File(args[0]);
        listFilesForFolder(filename);
    }
    public static File[] listFilesForFolder(final File folder) {
        List<File> res = new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                res.addAll(Arrays.asList(listFilesForFolder(fileEntry)));
            } else {
                res.add(fileEntry);
            }
        }
        return res.toArray(new File[0]);
    }
}
