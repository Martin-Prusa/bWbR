package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {
        // write your code here
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));
            for(int i = 0; i<100; i++) {
                bw.write("Hello, world!");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Nelze zapsat do souboru.");
        }
    }
}
