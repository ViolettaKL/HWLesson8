package org.example;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        //Task3
        final int SEVEN = 7;
        int a = SEVEN;
        while (a <= 98) {
            System.out.println(a);
            a = a + SEVEN;
        }

        //Task4

        int[] myArray20 = new int[20];
        int sum = 0;
        Random rand = new Random();

        for (int i = 0; i < myArray20.length; i++) {
            myArray20[i] = rand.nextInt();
            sum = sum + myArray20[i];
        }
        int average = sum / myArray20.length;
        System.out.println("Average of Array20 = " + average);

        //Task5
        int[] myArray10 = new int[10];
        for (int b = 0; b < myArray10.length; b++) {
            myArray10[b] = rand.nextInt();

        }
        int max = myArray10[0];
        for (int b = 1; b < myArray10.length; b++) {
            if (myArray10[b] > max) {
                max = myArray10[b];
            }
        }
        System.out.println("Array10 max = " + max);


        int min = myArray10[0];
        for (int b = 1; b < myArray10.length; b++) {
            if (myArray10[b] < min) {
                min = myArray10[b];
            }
        }
        System.out.println("Array10 min = " + min);
    }
}