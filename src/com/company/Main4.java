package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(decode("ahoj"));
        System.out.println(encode("heud"));
    }

    public static String decode(String str) {
        String newStr = str;
        try {
            BufferedReader br = new BufferedReader(new FileReader("cypher.txt"));
            String nextLine = br.readLine();
            while(nextLine != null) {
                String[] a = nextLine.split(" ");
                char one = (char) Integer.parseInt(a[0], 2);
                char two = (char) Integer.parseInt(a[1], 2);
                String xx = ""+one;
                if(str.contains(xx)) {
                    int x = str.indexOf(one);
                    newStr = newStr.substring(0, x)+two+newStr.substring(x+1);
                }
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Nelze přečíst soubor");
        }
        return newStr;
    }

    public static String encode(String str) {
        String newStr = str;
        try {
            BufferedReader br = new BufferedReader(new FileReader("cypher.txt"));
            String nextLine = br.readLine();
            while(nextLine != null) {
                String[] a = nextLine.split(" ");
                char one = (char) Integer.parseInt(a[0], 2);
                char two = (char) Integer.parseInt(a[1], 2);
                String xx = ""+two;
                if(str.contains(xx)) {
                    int x = str.indexOf(two);
                    newStr = newStr.substring(0, x)+one+newStr.substring(x+1);
                }
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Nelze přečíst soubor");
        }
        return newStr;
    }
}
