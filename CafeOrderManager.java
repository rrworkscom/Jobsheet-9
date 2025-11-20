import java.util.Scanner;

public class CafeOrderManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] orderNames = new String[n];
        double[] orderPrices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of order " + (i + 1) + ": ");
            orderNames[i] = sc.nextLine();

            System.out.print("Enter the price of " + orderNames[i] + ": ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += orderPrices[i];
        }

        System.out.println("\n===== ORDER LIST =====");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp " + orderPrices[i]);
        }

        System.out.println("\nTotal Cost: Rp " + totalCost);
    }
}
