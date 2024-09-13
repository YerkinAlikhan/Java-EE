package Yerkin.Alikhan.com.Java.EE;

import java.nio.file.Paths;
import java.nio.file.Path;

public class FilePathExample {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Program Files/Java-EE/Alikhan.txt");
        System.out.println("Path: " + path);
    }
}
