import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the X (odd number): ");
        int size = scanner.nextInt();
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
