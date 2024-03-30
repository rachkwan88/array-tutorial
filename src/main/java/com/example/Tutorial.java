package com.example;

public class Tutorial {
    public int[] func1(int input){
        // input = 5
        int[] result = new int[input];
        // result = [0|1| | | ]
        for(int i=0;i<input;i++){
            // i = 1
            result[i]=i;
            // result[i+1] 
        }
        return result;
    }
}
