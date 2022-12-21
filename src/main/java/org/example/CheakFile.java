package org.example;

import java.io.File;

public class CheakFile {
    public static boolean check(File file) {
        if (file == null) {
            return false;
        }
        if (file.isFile() == false) {
            return false;
        }
        return true;
    }
}
