package com.bogdantara;

import java.nio.charset.Charset;
import java.util.*;

public class Week2Homework {
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //1. Given two strings, check if the strings are equal. After that, concatenate them into one single string
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //facem rost de 2 strings
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first string: ");
        String string1 = input.next();
        System.out.println("string1 is: " + string1);
        System.out.print("enter the second string: ");
        String string2 = input.next();
        System.out.println("string 2 is: " + string2);
        //comparam strings
        if (Objects.equals(string1, string2)) {
            System.out.println("string1: " + string1 + " is equal to string2: " + string2);
        } else {
            System.out.println("string1: " + string1 + " is NOT equal to string2: " + string2);
        }
        //concatenam strings
        String concatenated = string1 + "" + string2;
        System.out.println("the concatenated string is: " + concatenated);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //2. Given a one word string, return true if the string is a palindrome eg. mam, madam
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.print("enter a string to check its palindromness: ");
        String string3 = input.next();
        System.out.println("you entered: " + string3);
        StringBuilder invers = new StringBuilder();
        //String simplu = string3.replaceAll("\\s+", "").toLowerCase();
        char[] plain = string3.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            invers.append(plain[i]);
        }
        if (invers.toString().equals(string3)) {
            System.out.println(string3 + " is a palindrome.");
        } else {
            System.out.println(string3 + " is not a palindrome.");
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //3. Create an empty string, an empty array of strings, and a list of strings with random
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String emptystr = ""; // am facut stringul gol cu numele emptystr
        ArrayList<String> arrstr = new ArrayList<>(); // am facut arrayul arrstr
        //create a list of strings with random upper and lowercase letters
        List<String> listastr = new ArrayList<>();
        listastr.add("jdieaSRE");
        listastr.add("Xxissrfe");
        listastr.add("rewewPew");
        listastr.add("odsieHET");
        listastr.add("cearERtY");
        String urmatoarea; //initializam astea 2 mai jos, sa nu planga ca e null
        String precedenta;
        for (int x = 0; x < listastr.size() - 1; x++) {
            urmatoarea = listastr.get(x);
            if (urmatoarea.startsWith("a") || urmatoarea.startsWith("A") || urmatoarea.startsWith("e") ||
                    urmatoarea.startsWith("E") || urmatoarea.startsWith("i") || urmatoarea.startsWith("I") ||
                    urmatoarea.startsWith("o") || urmatoarea.startsWith("O") || urmatoarea.startsWith("u") ||
                    urmatoarea.startsWith("U")) {
                emptystr = emptystr + urmatoarea.toLowerCase();
            } else if (urmatoarea.length() < 3 || urmatoarea.contains("x") || urmatoarea.contains("X")) {
                precedenta = urmatoarea;
                urmatoarea = "skipped";
                System.out.println("Current word is: " + urmatoarea + " , replaced word is: " + precedenta);
            } else {
                arrstr.add(urmatoarea.toUpperCase());
            }
        }
        System.out.println("we'll print the array");
        System.out.println(arrstr);
        System.out.println("we'll print the array");
        System.out.println(emptystr);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //4. Create an empty map that will contain Name and Email as key-value pairs
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Map<String, String> trainees = new HashMap<>(); // cream mapa goala
        trainees.put("Ionut", "ionut@e.mail"); // populam
        trainees.put("Vasalica", "vasi@e.mail");
        trainees.put("Maria", "maria@e.mail");
        trainees.put("Ioana", "ioana@e.mail");
        trainees.put("George", "georege@e.mail");
        System.out.println("The size of the map trainees is: " + trainees.size());
        System.out.println("check if the map contains Maria: " + trainees.containsKey("Maria"));
        System.out.println("get Ioana's mail: " + trainees.get("Ioana"));
        trainees.remove("Vasalica");
        //sortare !!!!! aici cred ca ar merge daca am avea key numar
        Map<String, String> sortm = new TreeMap<String, String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }

                    ;
                });
        sortm.putAll(trainees);
        System.out.println(sortm);
    }
}