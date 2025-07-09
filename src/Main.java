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

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Age !");
//        int age = input.nextInt();
//        input.nextLine();
//        System.out.println("Enter Your Nationality !");
//        String nationality = input.nextLine();
//        System.out.println( age >= 18 && nationality.equals("Egyptian") ? "Eligible to Vote !" : "Not eligible !" );
        // ===== Problem 5: What is Loop Exercise  =====
        // 5.1 Print Numbers from 1 to 10
        // 5.2 Use if to check if numbers is even or odd
        // 5.3 Apply week day using switch from 1 to 7

        for( int i = 1 ; i <= 10 ; i++ ){
            System.out.print((i % 2 == 0 ) ? i  + " is Even Number " :  i + " is Odd Number ");
            switch(i){
                case 1:
                    System.out.println( " and Today is Saturday");
                    break;
                case 2:
                    System.out.println( "and Today Sunday");
                    break;
                case 3:
                    System.out.println("and Today Monday");
                    break;
                case 4:
                    System.out.println("and Today Tuesday");
                    break;
                case 5:
                    System.out.println( "and Today Wednesday");
                    break;
                case 6:
                    System.out.println( "and Today Thursday");
                    break;
                case 7:
                    System.out.println( "and Today Friday");
                    break;
                default:
                    System.out.println("Not a Day");
            }
        }
        // 5.4 Print Multiplication Table (1 to 10) using for loop
        System.out.println("5.4 Print Multiplication Table (1 to 10) using for loop");
        int number = 10;
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " × " + i + " = " + (number * i));
        }
        // 5.5 Count Digits in a Number using while
//        System.out.println("5.4 Count Digits in a Number using while");
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a Number to count!");
//        int numberEntered = input.nextInt();
//        input.nextLine();
//
//        int numberAbs = Math.abs(numberEntered);
//        int count = 0;
//
//        if (numberAbs == 0) {
//            count = 1;
//        } else {
//            while (numberAbs > 0) {
//                numberAbs = numberAbs / 10;
//                count++;
//            }
//        }
//        System.out.println("Number of digits = " + count);
        // 5.6 Reverse A Number
             System.out.println("5.6 Reverse a number using while");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            int numberInput = input.nextInt();
            int reversed = 0;
            while (numberInput != 0) {
                int digit = numberInput % 10;
                reversed = reversed * 10 + digit;
                numberInput /= 10;
            }

            System.out.println("Reversed number: " + reversed);












    }
}

