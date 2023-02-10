import java.util.Scanner;

public class Iteration {
    public void iteration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 9:");
        int number = sc.nextInt();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int arrayIndex : array) {
            if (number >= arrayIndex) {
                System.out.println(arrayIndex);
            }
        }
    }
}
