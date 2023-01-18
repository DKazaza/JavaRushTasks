package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(partOfName!=null && !file.getFileName().toString().contains(partOfName))
            return FileVisitResult.CONTINUE;
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        if((maxSize!=0 && content.length > maxSize) || (minSize!=0 && content.length<minSize))
            return FileVisitResult.CONTINUE;
        if(partOfContent!=null && !partOfContent.isEmpty()) {
            String contentStr = new String(content);
            if(!contentStr.contains(partOfContent))
                return FileVisitResult.CONTINUE;
        }

        foundFiles.add(file);
        return super.visitFile(file, attrs);
    }
    private String partOfName;
    private String  partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String name){
        this.partOfName = name;
    }
    public void setPartOfContent(String part) {
        this.partOfContent = part;
    }
    public void setMinSize(int min){
        this.minSize = min;
    }
    public void setMaxSize(int max){
        this.maxSize = max;
    }
    public List<Path> getFoundFiles(){
        return foundFiles;
    }

}
