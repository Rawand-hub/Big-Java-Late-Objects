/*Write a method
public static double readDouble(String prompt)
that displays the prompt string, followed by a space, reads a floating-point number
in, and returns it. Here is a typical usage:
salary = readDouble("Please enter your salary:");
percentageRaise = readDouble("What percentage raise would you like?");*/

import java.util.Scanner;

    

public class P5_10 {
    private static Scanner input;
    
    public static void main(String[] args){
        input = new Scanner(System.in);
        double salary = readDouble("Please enter your salary: ");
        double percentageRaise = readDouble("What percentage raise would you like?");
        input.close();
        
        System.out.printf("Salary is: %.2f %n", salary);
        System.out.printf("percentageRaise is: %.2f", percentageRaise);
    }
    
    public static double readDouble(String prompt){
        System.out.println(prompt);
        double value = input.nextDouble();
        return value;
        
        
    }
}
