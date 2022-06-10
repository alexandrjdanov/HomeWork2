import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer and push [Enter]: ");
        x = input.nextInt();

        if (x%2 == 0) System.out.println("Number " + x + " is even number");
        else System.out.println("Number " + x + " is odd number");
    }
}
