package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        EnglishInterpreter interpreter = new EnglishInterpreter();
        String txtForTransleating = ReadTextFromFileForTranslate.readFile(new File("English.in"));
        System.out.println(interpreter.translateText(txtForTransleating));
        System.out.println(interpreter.addWorld("Ganna","Ганна"));
        System.out.println(interpreter.addWorld("Gan4j ","Ганна"));
    }
}
