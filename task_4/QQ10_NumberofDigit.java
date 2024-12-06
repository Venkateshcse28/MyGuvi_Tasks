package task_4;

import java.util.Scanner;

public class QQ10_NumberofDigit {
	
	public static void main(String args[]){
		   
	      Scanner sc = new Scanner(System.in);
	      int count = 0;
	      
	      System.out.println("Enter a number:");
	      int num = sc.nextInt();
	      
	      sc.close();
	      
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered number are : "+count);
	   }

}
