package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        // this is my inner and outer for loop
        for(int i=0; i<3; i++){
            System.out.println("Outer Loop: " + i);
            for(int j=0; j<5; j++){
                System.out.println("\tInner Loop " + j + ": Hi Everyone!");// this t will tab for me
            }
        }


    }
}
