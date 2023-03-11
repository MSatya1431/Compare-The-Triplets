import java.util.Scanner;

public class PatternPrinting {
    static int[] compareTriplets(int[] a, int[] b) 
    {
        int aliceScore = 0, bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
        }
        return new int[] {aliceScore, bobScore};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }
        int[] result = compareTriplets(a, b);
        System.out.println(result[0] + " " + result[1]);
        scanner.close();
    }
}
