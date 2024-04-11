package fr.hetic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader(args[0]);
    }
    public static String[] FileReader(String filepath) throws IOException {
        String fileName = filepath;
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String[] res = {};
        String line;
        while((line = br.readLine()) != null){
            res = arrayAppend(res, line);
        }
        return res;
    }
    public static String[] arrayAppend(String[] array,String appendedValueString){
        String[] resArray = new String[array.length+1];
        for (int i = 0; i < array.length; i++) {
            resArray[i] = array[i];
        }
        resArray[array.length] = appendedValueString;
        return resArray;

    }
}


