package task_4;

import java.util.Scanner;

public class Q9_SeniorCitizen {
	
	public static void main(String[] args) {
	       
    	Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the person age: ");
        int age = sc.nextInt();
 
        sc.close();
 
        
        if (age >= 60) {
            System.out.println("He/she is  senior citizen.");
        } else {
            System.out.println("He/She is not a senior citizen.");
        }
    }

}
