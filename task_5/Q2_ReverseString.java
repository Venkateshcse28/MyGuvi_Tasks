package task_5;

import java.util.Scanner;

public class Q2_ReverseString {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String input = sc.nextLine();
        String reversedstring = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
        	reversedstring += input.charAt(i);
        }
        
        System.out.println("Reversed string is: " + reversedstring);
        
        sc.close();
    }
}

