package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        InputStream instr = url.openStream();
        Path tempFile = Files.createTempFile("temp-", ".tmp");
        Files.copy(instr, tempFile,StandardCopyOption.REPLACE_EXISTING);
        //String s1=downloadDirectory.toString()+Paths.get(url.getFile()).getFileName().toString();
        //Path p1 = Paths.get(s1);
        Path result = downloadDirectory.resolve(Paths.get(url.getFile()).getFileName());
        Files.move(tempFile,result);
        //Paths.get(url.getFile()).getFileName());
        return result;

    }
}
