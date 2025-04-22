package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] arrayName = new String[9];
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {
                "When in doubt, STRING it out!",
                "Stop STRING-ing me along!",
                "STRINGS! The ones you can depend on!",
                "You're tugging at my heartSTRINGS!",
                "STRINGS of a feather, strung together",
                "STRING low-, Sweet Chariot...",
                "We can have some fun, no STRINGS attached!",
                "Help me out! I'm hanging on by a STRING here!",
                "My band's about to perform, we're STRING-ing up now.",
                "STRING,thing, chicken wing... Lakers in 5."
        };
        try {
            // int userInput = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Invalid Numerical Input. Try Again");
            e.printStackTrace();

        } catch (InputMismatchException e) {
            // int userInput = scanner.nextInt();
            System.out.println("Invalid. Try Again");
            e.printStackTrace();

        }

        //for (int i = 0; i < quotes.length ; i++) {
        System.out.println("Quote :" + quotes[scanner.nextInt()]);

    }

}


