package task_4;

import java.util.Scanner;

public class Q6_FactorialNumber {
	
	 public static void main(String args[]){  
		  int i,a=1;  
		  
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a number to check Factorial Value:");
	     
	      int num = sc.nextInt();
	    sc.close();
		 
		  for(i=1;i<=num;i++){    
		      a=a*i;    
		  }    
		  System.out.println("Factorial of "+num+"! is: "+a);    
		 }  

}
