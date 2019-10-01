package bogdantara;

import java.nio.charset.Charset;
import java.util.*;

public class Week1Homework {
    public static void main(String[] args) {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //4. Define and print on separate lines the following data types, using random values
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //cream obiect random
        Random r = new Random ();

        //generam boolean aleator
        boolean bool = r.nextBoolean();

        //afisam
        System.out.println("random bool: " + bool);

        //linie noua
        //System.out.println("\n");

        //definim alfabetul
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String fullalphabet = alphabet + alphabet.toLowerCase() + "0123456789";

        //afisam
        System.out.println("random char: " + fullalphabet.charAt(r.nextInt(fullalphabet.length())));

        //generam integer random
        int integerul = r.nextInt();

        //afisam integer random
        System.out.println("random integer: " + integerul);

        //generam long random
        long longul = r.nextLong();

        //afisam long random
        System.out.println("random long: " + longul);

        //generam double random
        double dublul = r.nextDouble();

        //afisam double random
        System.out.println("random double: " + dublul);

        //flotari inainte de random string
        //definim o lungime pentru string
        byte [] lungime = new byte [32];

        //generam string random
        new Random().nextBytes(lungime);

        String stringgenerat = new String(lungime, Charset.forName("UTF-8"));

        //afisam string random
        System.out.println("random string: " + stringgenerat);

        //flotari inainte de random array

        //generam si afisam array de random boolean
        boolean[] booleans = new boolean[10];
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = r.nextBoolean();
        }
        System.out.println("random bool   array: " + Arrays.toString(booleans));

        //generam si afisam array de random int
        int[] integers = new int[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt();
        }
        System.out.println("random int    array: " + Arrays.toString(integers));

        //generam si afisam array de random float
        float[] floats = new float[10];
        for (int i = 0; i < floats.length; i++) {
            floats[i] = r.nextFloat();
        }
        System.out.println("random float  array: " + Arrays.toString(floats));

        //generam si afisam array de random gaussian double
        double[] doubles = new double[10];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = r.nextGaussian();
        }
        System.out.println("random double array: " + Arrays.toString(doubles));

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //5.Define some integer variables. Perform the operations below and print the result
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

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

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //6.Define two integer variables, a and b Using an if-else statement, compare the values
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int c = 5;
        int d = 2;

        //comparatii
        if( c == d ) {System.out.println( c + " is equal to " + d );}
        else if (c > b) {
            System.out.println(c + " is larger than " + d);
        } else System.out.println(d + " is larger than " + c);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //7.Define a number array of 10 elements, using random values from range 1 to 100
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        for(int i=0 ; i < 10 ; i++ ) {
            int element = r.nextInt(100);
            if( element == 15) { i++; } // If an element has value 15, skip printing this value.
            else {
            System.out.println("random element between 1 and 100: " + element );
        }}
        }
    }
