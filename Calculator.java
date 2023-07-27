import java.util.Scanner;
// java import used to create a way for users to input infor into the terminal (the two integers and a single operator) so that the code can perform a certain behavior based on it(solving the problem inputed)

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner used to take input from the user

        // int a and int b portions meant to take in integer values inputed in the terminal
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // portion for the user to choose the operator of their choice
        System.out.println("Pick and input the type of operation you need (+, -, *, /)" + "*");
        char operator = sc.next().charAt(0);
        solve(a, b, operator);
    }
    
    //method used to introduce operators and int a, int b behaviors and relationships
    public static int solve(int a, int b, char operator) {
        int answer = 0;
        // addition
        if(operator == '+') {
            answer = a + b;
        // subtration
        }else if(operator == '-') {
            answer = a - b;
        // multiplication
        }else if(operator == '*') {
            answer = a * b;
        // division
        }else if(operator == '/') {
            answer = a / b;
        // modulo
        }else if(operator == '%') {
            answer = a % b;
        }else {
            System.out.println("You have entered incorrect information! Try again!");
        }

        // area that prints the final result
        System.out.println("Your answer is: " + answer);
        return answer;
    }
}