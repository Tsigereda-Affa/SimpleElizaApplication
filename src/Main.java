import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Q1. Create an interactive chat-bot type program. Eliza is a therapist program that interacts with the user.
// Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the therapist really cares.
//
//Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter "Q", the program will stop running.
// Your program should print out the last input (as an output) every time before accepting new input. Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
        // OUTPUT
        //Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
        //my teacher hates me
        //Enter your response here or Q to quit: i dont know what's wrong
        //i dont know what's wrong
        //Enter your response here or Q to quit: i am feeling great
        //i am feeling great
        //>>> END
        Scanner sca = new Scanner(System.in);
        System.out.println("Good day. What is your problem? ");
        String userInput;
        userInput = sca.nextLine();
        while (!userInput.equalsIgnoreCase("Q")) {
            //System.out.println(userInput);
            System.out.println("Enter your response here or Q to quit: ");
            userInput = sca.nextLine();
            //System.out.println("Your response is : " + userInput);
            if (userInput.contains("I am feeling great")) {
               // System.out.println("Thank you");
                break;

            }
        }
        System.out.println("Thank you");
    }
}