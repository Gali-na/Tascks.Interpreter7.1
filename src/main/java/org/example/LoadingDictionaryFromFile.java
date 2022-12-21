package org.example;

import java.io.*;
import java.util.HashMap;

public class LoadingDictionaryFromFile {
    public static HashMap<String,String> downloadDictionary (File file) {
        HashMap<String,String> dictionaryFromFile= new HashMap<String, String>();
        String stringReader="";
        if(CheakFile.check(file)) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
                while ((stringReader=bufferedReader.readLine())!=null) {
                    String [] arryFromStringReader=stringReader.split("/");
                  String key=  arryFromStringReader[0];
                  String velue=arryFromStringReader[1];
                    dictionaryFromFile.put(key,velue);
                }
            }catch (IOException e){
                e.getMessage();
            }
        }
        return dictionaryFromFile;
    }
}