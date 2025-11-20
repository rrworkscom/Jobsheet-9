import java.util.Scanner;

public class linearSearch20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = input.nextInt();

        int result = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("The key is not found in the array");
        }

        input.close();
    }
}
