import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("=================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("=================================");

        // Question 1
        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("A. Java");
        System.out.println("B. HTML");
        System.out.println("C. SQL");
        System.out.println("D. CSS");

        System.out.print("Enter your answer: ");
        char answer = sc.next().toUpperCase().charAt(0);

        if (answer == 'A') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("A. function");
        System.out.println("B. class");
        System.out.println("C. define");
        System.out.println("D. create");

        System.out.print("Enter your answer: ");
        answer = sc.next().toUpperCase().charAt(0);

        if (answer == 'B') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which method is the starting point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. execute()");

        System.out.print("Enter your answer: ");
        answer = sc.next().toUpperCase().charAt(0);

        if (answer == 'C') {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which symbol is used to end a statement in Java?");
        System.out.println("A. :");
        System.out.println("B. .");
        System.out.println("C. ,");
        System.out.println("D. ;");

        System.out.print("Enter your answer: ");
        answer = sc.next().toUpperCase().charAt(0);

        if (answer == 'D') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which data type is used to store whole numbers?");
        System.out.println("A. double");
        System.out.println("B. String");
        System.out.println("C. int");
        System.out.println("D. boolean");

        System.out.print("Enter your answer: ");
        answer = sc.next().toUpperCase().charAt(0);

        if (answer == 'C') {
            score++;
        }

        // Result
        System.out.println("\n=================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("=================================");

        System.out.println("Your Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent! Perfect score!");
        } 
        else if (score >= 3) {
            System.out.println("Good job!");
        } 
        else {
            System.out.println("Keep practicing!");
        }

        System.out.println("=================================");

        sc.close();
    }
}
