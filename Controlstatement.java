import java.util.Scanner;

public class Controlstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // if-else
        if (num > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative or Zero");

        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++)
            System.out.println(i);

        // while loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        System.out.println("Do-while loop:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // switch-case
        System.out.print("Enter a number from 1 to 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}