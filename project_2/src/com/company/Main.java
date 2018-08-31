package com.company;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String args[]) {
        String filePath = "D:\\STUDY\\Java_study\\homework.txt";
        HashMap<String, Integer> StringToHash = new HashMap<>();
        for (String word : ReadFilehomework(filePath).replaceAll("\\p{P}", "").toLowerCase().split("\\s+")) {
            Integer i = StringToHash.get(word);
            if (i == null) {
                StringToHash.put(word, 1);
            } else {
                StringToHash.put(word, i + 1);
            }
        }
        for (String name : StringToHash.keySet()) {
            System.out.println(name + " counter " + StringToHash.get(name));
        }
    }
        //Read file content from path
        public static String ReadFilehomework (String filePath)
        {
            String content = "";
            try {
                content = new String(Files.readAllBytes(Paths.get(filePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
        }
}

