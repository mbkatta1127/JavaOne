package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //
    public Scanner sc = new Scanner(System.in);
    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        System.out.println(sc.nextLine().toUpperCase());
    }

    public void ex2() {
        System.out.println("Enter a String: ");
        String string = sc.nextLine();
        int count = 0;

        for(int i = 0; i<string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))) count++;
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        System.out.println("Enter a String: ");
        String[] words = sc.nextLine().split(" ");
        boolean capital = true;

        for(int i = 0; i<words.length; i++) {
            if (capital) {
                words[i] = words[i].toUpperCase();
                capital = false;
            } else {
                words[i] = words[i].toLowerCase();
                capital = true;
            }

            System.out.print(words[i] + " ");
        }
    }

    public void ex4() {
        System.out.println("Input a an string: ");
        String word = sc.nextLine();
        boolean isPalindrome = true;
        int rightPointer = word.length()-1;

        for (int leftPointer = 0; leftPointer < word.length()/2; leftPointer++){
            if(word.charAt(leftPointer)!=word.charAt(rightPointer)){
                isPalindrome = false;
                break;
            }
            rightPointer--;
        }

        if(isPalindrome) System.out.println("YES");
        else System.out.println("NO");
    }

    public void ex5() {
        String string = "";
        int vowelsCount = 0;
        int consonantsCount = 0;
        do{
            System.out.println("Enter a string: ");
            string = sc.nextLine();
            if(string.equals("quit")) break;

            for(int i = 0; i<string.length(); i++){

                if((string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' ||
                        string.charAt(i) == 'U' || string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' ||
                        string.charAt(i) == 'o' || string.charAt(i) == 'u')) vowelsCount++;
                else if(Character.isLetter(string.charAt(i))) consonantsCount++;
            }

            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + consonantsCount);
            vowelsCount = 0;
            consonantsCount = 0;

        } while(!string.equals("quit"));

    }

    public void ex6() {
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Result: " + (firstNumber + secondNumber));

    }

    public void ex7() {
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter operation (add, sub, mul, div): ");
        String choice = sc.nextLine();

        switch (choice){
            case "add":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "sub":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "mul":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "div":
                System.out.println("Result: " + (firstNumber / secondNumber));
                break;
        }
    }

    public void ex8() {
        System.out.println("Enter price per square feet: ");
        double price = sc.nextDouble();
        sc.nextLine();

        String dimensions = "";
        int dimensionsInt = 0;
        do{
            System.out.println("Enter room dimensions (width x height): ");
            dimensions = sc.nextLine();

            if(dimensions.equals("done")) break;
            String[] wh = dimensions.split(" x ");
            dimensionsInt += Integer.parseInt(wh[0]) * Integer.parseInt(wh[1]);

        } while(!dimensions.equals("done"));

        System.out.println("Total cost: $" + (price*dimensionsInt));
    }

    public void ex9() {
        System.out.print("Enter a number: ");

        int randNum = (int) (Math.random() * 100) + 1;
        int guess = sc.nextInt();

        while(randNum != guess){
            System.out.println("Try again...");
            System.out.print("Enter a number: ");
            guess = sc.nextInt();
        }

        System.out.println("Correct guess!");
    }

    public void ex10() {
        System.out.print("Enter a string: ");
        String[] words = sc.nextLine().split(" ");

        for(int i = 0; i< words.length; i++){
            int countSpaces = 0;
            for(int j = 0; j<words[i].length(); j++){
                for(int k = 0; k<countSpaces; k++){
                    System.out.print(" ");
                }

                System.out.print(words[i].charAt(j));
                countSpaces++;
                System.out.println();
            }
        }
    }

    //
    // Private helper methods
    //
}
