package task_5;


import java.util.Scanner;

public class Q7_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // I am using Double data type for handle all format input numbers
        System.out.print("Enter the first number:");
        double number1 = sc.nextDouble();
        
        System.out.print("Enter the second number:");
        double number2 = sc.nextDouble();
        
        System.out.print("Enter the third number:");
        double number3 = sc.nextDouble();

        double largest;
        
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        System.out.println("The largest number is : " + largest);
        
        sc.close();
    }
}
