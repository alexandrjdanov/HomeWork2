import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double i, j;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter i: ");
        i = input.nextDouble();
        System.out.println("Enter j: ");
        j = input.nextDouble();

        double sum = i + j;
        System.out.println("\nThe sum is: " + sum);

        double avg = (i + j) / 2;
        System.out.println("The average value is: " + avg);

        if (i > j) System.out.println(i + " > " + j);
        else if (i < j) System.out.println(i + " < " + j);
        else System.out.println(i + " = " + j);
    }
}
