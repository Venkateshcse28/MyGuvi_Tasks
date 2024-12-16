package task_5;


import java.util.Scanner;

public class Q4_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                System.out.println("* *");
            } else {
                System.out.println("*");
            }
        }
        
        sc.close();
    }
}
