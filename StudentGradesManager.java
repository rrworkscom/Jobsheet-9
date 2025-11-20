import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student grades to be entered: ");
        int n = sc.nextInt();

        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += grades[i];
        }
        double average = total / n;

        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 1; i < n; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("\nAll grades entered:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
