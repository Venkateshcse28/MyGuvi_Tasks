package task_5;


import java.util.Scanner;

public class Q6_HotelBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the month stay month= ");
        int month = sc.nextInt();
        System.out.print("Enter the room rent per day= ");
        double roomRentPerDay = sc.nextDouble();
        System.out.print("Enter the number of days stayed= ");
        int numberOfDays = sc.nextInt();
  
        boolean isDemandSession = false;
        
        	switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                isDemandSession = true;
                break;
            default:
            	isDemandSession = false;
                break;
        }

        	double totalTariff;
        	if (isDemandSession) {
            totalTariff = roomRentPerDay * 1.20 * numberOfDays;
        } else {
            totalTariff = roomRentPerDay * numberOfDays;
        }
        System.out.printf("Total Tariff Toatl Ampnt: %.2f%n", totalTariff);
        
        sc.close();
    }
}
