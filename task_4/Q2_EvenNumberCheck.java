package task_4;

import java.util.Scanner;
public class Q2_EvenNumberCheck {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        sc.close();
        
        if (number % 2 == 0) {
            System.out.println("The " + number + " is even number.");
            
        } else {
            System.out.println("The " + number + " is odd number.");
        }
    }
}