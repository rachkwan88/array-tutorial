package com.example;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        // make an object
        Tutorial tut1 = new Tutorial();
        // call the function + store it in an int array
        int[] result = tut1.func1(3);
        // run a for loop
        for (int i = 0; i < result.length; i++) {
            // print the result
            // System.out.print(result[i]+" ");
        }

        // create array of Tutorial
        int input = 5;
        Tutorial[] tutorials = new Tutorial[input];
        for (int i = 0; i < input; i++) {
            tutorials[i] = new Tutorial();
            int[] result2 = tutorials[i].func1(i);
            for (int j = 0; j < result2.length; j++) {
                System.out.print(result2[j] + " ");
            }

        }

    }
}
