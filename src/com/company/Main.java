package com.company;

public class Main {
	
	public static void raiseAlarm(int numOfWarnings) {
	    int i = 1;
	   while (i <= numOfWarnings) {
	       System.out.println("warning");
	       i = i + 1;
	    }
	}

    public static void countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        System.out.println(total);
    }

	public static void rollASix() {
        int rollDice = 0;

        while (rollDice != 6) {
            rollDice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled: " + rollDice);

            if (rollDice == 3) {
                break;
            }
        }
        if (rollDice == 6) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("You Lose");
        }
    }

	
	

    public static void main(String[] args) {
	// write your code here
        // this is my inner and outer for loop
        for(int i=0; i<3; i++){
            System.out.println("Outer Loop: " + i);
            for(int j=0; j<5; j++){
                System.out.println("\tInner Loop " + j + ": Hi Everyone!");// this t will tab for me
            }
        }
        rollASix();
        countBlocks(7);
	raiseAlarm(7);
	}


    }



