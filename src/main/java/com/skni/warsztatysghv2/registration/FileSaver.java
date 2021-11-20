package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Component
public class FileSaver {


    public Student saveToFile(Student student){
        try {
            PrintWriter printWriter = new PrintWriter("test.txt");
                printWriter.write(student.toString());
                printWriter.flush();
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return student;
    }

}
