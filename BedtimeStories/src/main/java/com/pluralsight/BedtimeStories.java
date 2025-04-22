package com.pluralsight;

import java.io.*;
import java.util.Scanner;


public class BedtimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter name of story: ");
            String fileName = scanner.nextLine();
            FileInputStream fis = new FileInputStream("src/main/resources/DataFiles/" + fileName);

            //File file = new File(fileName);
           /* if (!file.exists()){
                System.out.println("Error!");
                return;
            }*/
            // FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);
            // System.out.println(fileScanner);

            String line;
            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                System.out.println(lineNumber + "." + line);
                lineNumber++;
            }
            fileScanner.close();

        /*Scanner story = new Scanner(FileInputStream())
        System.out.println("Enter name of the story you would like to read: " + FileInputStream());
*/


        } catch (IOException e) {
            e.printStackTrace();

        }
        scanner.close();
    }
}