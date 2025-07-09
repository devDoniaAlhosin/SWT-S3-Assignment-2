import java.util.Locale;
import java.util.Scanner;
import java.util.zip.Deflater;

public class Main {
    public static void main(String[] args) {
        // ===== Problem 1: User Info =====
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name:");
//        String name = input.nextLine();
//
//        System.out.print("Enter your age:");
//        int age = input.nextInt();
//        input.nextLine();
//
//        System.out.print("Enter your favorite programming language: ");
//        String language = input.nextLine();
//
//        int ageInMonths = age * 12;
//
//        System.out.println("\nHello! My name is " + name);
//        System.out.println("I am " + age + " years old, which is " + ageInMonths + " months");
//        System.out.println("My favorite programming language is " + language);
//
//        age++;
//        System.out.println("Next year I will be " + age + " years old");


        // ===== Problem 2: Basic Arithmetic =====
//        System.out.print("Enter First Number:" );
//        double input1 = input.nextDouble();
//        input.nextLine();
//        System.out.print("Enter Second Number:" );
//        double input2 = input.nextDouble();
//        input.nextLine();
//
//        double sum = input1 + input2;
//        double differance = input1 - input2;
//        double quotient = input1 / input2;
//        double product = input1 * input2;
//
//
//        System.out.println("Sum = " + sum );
//        System.out.println("Differance = " + differance );
//        System.out.println("Product = " + product );
//        System.out.println("Quotient = " + quotient );

         // ===== Problem 3: Sentence Analysis =====
//        Scanner sentence = new Scanner(System.in);
//
//        System.out.print("Enter Sentence: ");
//        String userSentence = sentence.nextLine();
//        String uppercase = userSentence.toUpperCase(Locale.ROOT);
//        int sentenceLength = userSentence.length();
//        char firstCharacter = userSentence.charAt(0);
//
//        System.out.println(" UpperCase:" + uppercase );
//        System.out.println(" Length:" + sentenceLength );
//        System.out.println(" First character:" + firstCharacter );

        // ===== Problem 4: Check Voting Eligibility =====

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age !");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter Your Nationality !");
        String nationality = input.nextLine();
        System.out.println( age >= 18 && nationality.equals("Egyptian") ? "Eligible to Vote !" : "Not eligible !" );





    }
}

