package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            int cislo = 0;
            String nextLine=br.readLine();
            while(nextLine!=null) {
                String[] a = nextLine.split(" ");
                if(a[0].equals("P")) {
                    cislo += Integer.parseInt(a[1]);
                } else {
                    cislo -= Integer.parseInt(a[1]);
                }
                nextLine = br.readLine();
            }
            System.out.println(cislo);
            br.close();

        } catch (IOException e) {
            System.out.println("Nelze přečíst soubor.");
        }
    }
}
