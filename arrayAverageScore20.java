import java.util.Scanner;

public class arrayAverageScore20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] finalScore = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();
        }

        double passTotal = 0;
        int passCount = 0;

        double failTotal = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            if (finalScore[i] > 70) {
                passTotal += finalScore[i];
                passCount++;
            } else {
                failTotal += finalScore[i];
                failCount++;
            }
        }

        double passAverage = passTotal / passCount;
        double failAverage = failTotal / failCount;

        System.out.println("The average score of students who passed is " + passAverage);
        System.out.println("The average score of students who failed is " + failAverage);
    }
}
