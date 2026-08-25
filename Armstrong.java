import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
