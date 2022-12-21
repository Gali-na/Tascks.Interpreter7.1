package org.example;

import java.io.*;

public class  ReadTextFromFileForTranslate {

    public static String readFile(File file) {
         StringBuilder stringBuilder = new StringBuilder();
        if (CheakFile.check(file)) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String currentString = "";
                while ((currentString = bufferedReader.readLine()) != null) {
                    stringBuilder.append(currentString);
                    stringBuilder.append(" ");
                }
                if(stringBuilder.toString().endsWith(" ")){
                    stringBuilder.delete((stringBuilder.toString().length()-1),stringBuilder.toString().length());
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return stringBuilder.toString();
    }


}
