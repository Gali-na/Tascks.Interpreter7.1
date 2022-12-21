package org.example;

import java.io.File;
import java.util.HashMap;

public class EnglishInterpreter {
    private HashMap<String, String> dictionary;

    public EnglishInterpreter() {
        this.dictionary = LoadingDictionaryFromFile.downloadDictionary(new File("Dictionary.txt"));;
    }

    public String translateText(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String rezult = "An error occurred, unable to translate the contents of the file";
        if (string != "" && string != null) {
            String[] arryWorlds = string.split("[ \\n\\r]");
            for (String str : arryWorlds) {
                if(str.endsWith(".")||str.endsWith("?")||str.endsWith(",")||str.endsWith("-")){
                  char [] arrywords=  str.toCharArray();
                  StringBuilder wordCurent=new StringBuilder();
                  for (int i=0;i<arrywords.length-1;i++){
                      wordCurent.append(arrywords[i]);
                  }
                  if (dictionary.containsKey(wordCurent.toString())) {
                      stringBuilder.append(dictionary.get(wordCurent.toString()));
                  }
                    else {
                        stringBuilder.append(wordCurent  +" ");
                    }
                    stringBuilder.append(arrywords[arrywords.length-1]+" ");
                    continue;
                }
                if(dictionary.containsKey(str)){
                    stringBuilder.append(dictionary.get(str) +" ");
                }
                else {
                    stringBuilder.append(str +" ");
                }
            }
            WriteToFile.overwriteInformationToFile(new File("Ukrainian.out"), stringBuilder.toString());
            rezult = "The translation was made and recorded in the file Ukrainian.out";
        }
        return rezult;
    }

    public String addWorld(String key, String velue) {
        String rezult = "The word is already in the dictionary";
        if (this.dictionary.containsKey(key) != true) {
            this.dictionary.put(key, velue);
            WriteToFile.addInformationToFile(new File("Dictionary.txt"), key + "/" + velue);
            rezult = "word added to dictionary";
        }
        return rezult;
    }
}
