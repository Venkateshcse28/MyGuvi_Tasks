package task_5;

import java.util.Scanner;

public class Q1_Palindrome {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userinput = sc.nextLine();
        boolean isPalindrome = true;
        
        int length = userinput.length();
        for (int i = 0; i < length / 2; i++) {
            if (userinput.charAt(i) != userinput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The is a palindrome string.");
        } else {
            System.out.println("The is not a palindrome string.");
        }
        
        sc.close();
    }
}
