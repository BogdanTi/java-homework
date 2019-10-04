package bogdantara;

import java.nio.charset.Charset;
import java.util.*;

public class Week3Homework {
    Random r = new Random();
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//~~~~~~~~~~~~~~~~~week's 1 homework~~~~~~~~~~~~~~~~~~~~
        Week3Homework rndbl = new Week3Homework();
        rndbl.randombool();
        //randombool();
        Week3Homework rndch = new Week3Homework();
        rndch.randomchar();
        Week3Homework rndin = new Week3Homework();
        rndin.rndint();
        Week3Homework rndlng = new Week3Homework();
        rndlng.rndlong();
        Week3Homework rnddbl = new Week3Homework();
        rnddbl.rnddouble();
        Week3Homework rndstr = new Week3Homework();
        rndstr.rndstring();
        Week3Homework rndarb = new Week3Homework();
        rndarb.rndarrbool();
        Week3Homework rndari = new Week3Homework();
        rndari.rndarrint();
        Week3Homework rndarf = new Week3Homework();
        rndarf.rndarrflt();
        Week3Homework rndard = new Week3Homework();
        rndard.rndarrdouble();
        Week3Homework task5 = new Week3Homework();
        task5.task5();
        Week3Homework task6 = new Week3Homework();
        task6.task6();
        Week3Homework task7 = new Week3Homework();
        task7.task7();
//~~~~~~~~~week's 2 homework~~~~~~~~~~~~~~~~~~~~~~~
        Week3Homework w2t1 = new Week3Homework();
        w2t1.week2task1();
        Week3Homework w2t2 = new Week3Homework();
        w2t2.week2task2();
        Week3Homework w2t3 = new Week3Homework();
        w2t3.week2task3();
        Week3Homework w2t4 = new Week3Homework();
        w2t4.week2task4();
    }
    public void randombool() {
        //generam boolean aleator
        boolean bool = r.nextBoolean();
        //afisam
        System.out.println("random bool: " + bool);
    }
    public void randomchar() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String fullalphabet = alphabet + alphabet.toLowerCase() + "0123456789";
        //afisam random char
        System.out.println("random char: " + fullalphabet.charAt(r.nextInt(fullalphabet.length())));
    }
    public void rndint() {
        int integerul = r.nextInt();
        //afisam integer random
        System.out.println("random integer: " + integerul);
    }
    public void rndlong() {
        long longul = r.nextLong();
        //afisam long random
        System.out.println("random long: " + longul);
    }
    public void rnddouble() {
        double dublul = r.nextDouble();
        //afisam double random
        System.out.println("random double: " + dublul);
    }
    public void rndstring() {
        //definim o lungime pentru string
        byte [] lungime = new byte [32];
        //generam string random
        new Random().nextBytes(lungime);
        String stringgenerat = new String(lungime, Charset.forName("UTF-8"));
        //afisam string random
        System.out.println("random string: " + stringgenerat);
    }
    public void rndarrbool() {
        //generam si afisam array de random boolean
        boolean[] booleans = new boolean[10];
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = r.nextBoolean();
        }
        System.out.println("random bool   array: " + Arrays.toString(booleans));
    }
    public void rndarrint() {
        //generam si afisam array de random int
        int[] integers = new int[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt();
        }
        System.out.println("random int    array: " + Arrays.toString(integers));
    }
    public void rndarrflt() {
        //generam si afisam array de random float
        float[] floats = new float[10];
        for (int i = 0; i < floats.length; i++) {
            floats[i] = r.nextFloat();
        }
        System.out.println("random float  array: " + Arrays.toString(floats));
    }
    public void rndarrdouble() {
        //generam si afisam array de random gaussian double
        double[] doubles = new double[10];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = r.nextGaussian();
        }
        System.out.println("random double array: " + Arrays.toString(doubles));
    }
    public void task5() {
        //Define some integer variables. Perform the operations below and print the result
        //definim niste variabile int
        int a = 9;
        int b = 6;
        //incrementam&afisam
        System.out.println("a incrementat: " + ++a);
        //decrementam&afisam
        System.out.println("a decrementat: " + --a);
        //a+b
        int adunare = a + b;
        System.out.println("a+b= " + adunare);
        //b-a
        int scadere = b - a;
        System.out.println("b-a= " + scadere);
        //a*b
        int inmultire = a * b;
        System.out.println("a*b= " + inmultire);
        //a%b
        int rest = a % b;
        System.out.println("a%b= " + rest);
        //comparatie
        boolean comparatie = a == b;
        System.out.println("a==b: " + comparatie);
    }
    public void task6() {
        //6.Define two integer variables, a and b Using an if-else statement, compare the values
        int b = 6;
        int c = 5;
        int d = 2;
        //comparatii
        if( c == d ) {System.out.println( c + " is equal to " + d );}
        else if (c > b) {
            System.out.println(c + " is larger than " + d);
        } else System.out.println(d + " is larger than " + c);
    }
    public void task7() {
        //7.Define a number array of 10 elements, using random values from range 1 to 100
        for(int i=0 ; i < 10 ; i++ ) {
            int element = r.nextInt(100);
            if( element == 15) { i++; } // If an element has value 15, skip printing this value.
            else {
                System.out.println("random element between 1 and 100: " + element );
    }}}
    public void week2task1() {
        //1. Given two strings, check if the strings are equal. After that, concatenate them into one single string
        //facem rost de 2 strings
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
    }
    public void week2task2() {
        //2. Given a one word string, return true if the string is a palindrome eg. mam, madam
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
    }
    public void week2task3() {
        //3. Create an empty string, an empty array of strings, and a list of strings with random
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
    }
    public void week2task4() {
        //4. Create an empty map that will contain Name and Email as key-value pairs
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
