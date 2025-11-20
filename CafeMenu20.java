import java.util.Scanner;

public class CafeMenu20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Fried Rice",
            "Fried Noodles",
            "Toasted Bread",
            "Fried Potatoes",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        System.out.print("Enter the menu item you want to search for: ");
        String item = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(item)) {  
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The " + item + " is available on the menu.");
        } else {
            System.out.println("Sorry, " + item + " is NOT on the menu.");
        }
    }
}
