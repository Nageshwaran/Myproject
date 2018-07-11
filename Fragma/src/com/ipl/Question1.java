package com.ipl;

import java.io.File;
 
public class Question1 {
     
    public static void main(String a[]){
        File file = new File("D:\\lmresources");
        String k = new Str
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}