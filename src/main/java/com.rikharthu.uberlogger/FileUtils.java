package com.rikharthu.uberlogger;

import java.util.ArrayList;
import java.util.List;

public abstract class FileUtils {

    static public String readFile(String filePath) {
        return null;
    }

    static public List<String> readFileLines(String filePath) {
        return new ArrayList<>();
    }

    static public void writeFile(String filePath, String text) {
        // TODO
    }

    static public void writeFile(String filePath, List<String> lines) {

    }

    static public boolean deleteFile(String filePath) {
        return false;
    }
}
