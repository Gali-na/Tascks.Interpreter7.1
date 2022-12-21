package org.example;

import java.io.*;

public class WriteToFile {
    public static boolean overwriteInformationToFile (File file, String information){
         if(CheakFile.check(file)) {
             try (BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(file))) {
                  bufferedReader.write(information);
             }catch (IOException e) {
                 e.getMessage();
             }
        }
        return false;
    }

    public static boolean addInformationToFile (File file, String information){
        if(CheakFile.check(file)) {
            try (BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true))) {
               // bufferedReader.write("");
                bufferedReader.write("\n"+information);
            }catch (IOException e) {
                e.getMessage();
            }
        }
        return false;
    }
}
