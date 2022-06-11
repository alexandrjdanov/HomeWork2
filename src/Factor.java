import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int i, j; // i - число, для которого ищем множители; j - множители

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer and push [Enter]:");
        i = input.nextInt();
        System.out.println("\nPairs of factors:");

        for (j = 1; j * j <= i; j++) {
            if (i % j == 0)
                System.out.println(j + " x " + i/j);
            }
        }
    }
