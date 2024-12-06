package task_4;

import java.util.Scanner;

public class Q4_SwapNumbers {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);


	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();

	        System.out.println("Input values: num1 = " + num1 + ", num2 = " + num2);

	        int swapvalue = num1;
	        num1 = num2;
	        num2 = swapvalue;

	       System.out.println("Swapped values: num1 = " + num1 + ", num2 = " + num2);

	        sc.close();
	    }

}
