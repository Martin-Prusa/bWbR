package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Zašifrování \n2)Odšífrování");
        int volba = Integer.parseInt(sc.nextLine());
        if(volba == 1) {
            System.out.println("Zadej slovo k zašifrování: ");
            System.out.println("Zašifrované slovo: "+code(sc.nextLine(), 'd'));
        } else {
            System.out.println("Zadej slovo k rozšifrování: ");
            System.out.println("Rozšifrované slovo: "+code(sc.nextLine(), 'e'));
        }
    }

    public static String code(String str, char ch) {
        String newStr = str;
        try {
            BufferedReader br = new BufferedReader(new FileReader("cypher.txt"));
            String nextLine = br.readLine();
            while(nextLine != null) {
                String[] a = nextLine.split(" ");
                char one = ch=='d'?(char) Integer.parseInt(a[0], 2) : (char) Integer.parseInt(a[1], 2);
                char two = ch=='e'?(char) Integer.parseInt(a[0], 2) : (char) Integer.parseInt(a[1], 2);
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
}
