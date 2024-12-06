package task_4;

import java.util.Scanner;

public class Q5_PrimeNumber {
	public static void main(String[] args) {
	     
	      int count = 0;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number to check prime number or not:");
	     
	      int num = sc.nextInt();
	    
	      sc.close();
	      
	      if(num == 2) {
	         System.out.println(num + " is a prime number");
	      } else {
	        
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               count++;
	            }
	         }
	        
	         if(count == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	      }
	   }

}
