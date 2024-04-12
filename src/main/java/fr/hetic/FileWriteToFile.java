package fr.hetic;

import java.io.RandomAccessFile;
import java.io.IOException;

public class FileWriteToFile {
    public static void writeLineToFile(OpLine o) {
        int line = o.position;
        try {
            RandomAccessFile file = new RandomAccessFile(o.filename + ".res", "rw");
            for(int i = 0; i < line - 1; i++)
                file.readLine();
            file.writeBytes(o.result + System.lineSeparator());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
