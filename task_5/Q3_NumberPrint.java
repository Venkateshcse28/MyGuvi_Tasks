package task_5;

import java.util.Scanner;

public class Q3_NumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int number = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
