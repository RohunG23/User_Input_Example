/*
Scanner is not a standard build in Java feature.
This is because not every program needs a scanner.
This means that we need to specifically go and find the Java library that
has the Scanner class in it ,so we can use those methods.
 */

import java.util.Scanner;

public class UserInputPractice {
    public static void main(String[] args){
        // To take input from the user there are a number of options we can choose from
        // One of those options is taking input from the keyboard through the console
        // This needs to be done from a special kind of object called Scanner

        // Syntax for making an object
        // ClassName variable_name = "new" ClassName()
        //                                 This ClassName should match the first one we said (Scanner)
        Scanner userInput = new Scanner(System.in); // System.in means java is looking for keyboard input

        // Now that we have an object we can use the various Scanner class methods to capture user input
        // The method we want depends on the data we are hoping to capture

        // Syntax for method calls
        // variable_name.methodName() (variable_name matches what is above)
//        userInput.nextInt();
        // Whenever a Scanner method is reached the program will wait for input without a prompt to the user
        // They might have no idea we are waiting for them to input something
        // We should be storing the user input into an appropriate data type
        System.out.print("Enter a number: ");
        int userNum = userInput.nextInt();

        //Whenever we use .next(), .nextInt, .nextDouble(), .nextFloat() the next line of code needs to clear buffer
        // We don't have to store this line in any variable
        // We MUST clear the buffer to be able to use .nextLine() for strings
        userInput.nextLine();

        // Once we have input from the user we can manipulate their data if needed
        int sum = userNum + 7;

        // We can print out the user input as we do any variable.
        // When printing variables and words in one statement, words go between ""
        // Variables do not. Words and variables are separated by +
        System.out.println("You entered " + userNum + " we added 7 to it and got " + sum);

        // When using certain methods from the Scanner class a newline character is stored in the buffer
        // This can cause some problem. The addition of line 36 enables us to clear the buffer
        // This allows us to get input now
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();

        System.out.print("Welcome to our program, " + name);
    }//end of main method
}//end of class
