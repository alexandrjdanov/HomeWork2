import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {
        int i, j, k, x, y;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer and push [Enter]: ");
        i = input.nextInt();
        System.out.println("Enter second integer and push [Enter]: ");
        j = input.nextInt();
        System.out.println("Enter third integer and push [Enter]: ");
        k = input.nextInt();
        System.out.println("Enter fourth integer and push [Enter]: ");
        x = input.nextInt();
        System.out.println("Enter fifth integer and push [Enter]: ");
        y = input.nextInt();

        ArrayList num = new ArrayList();
        num.add(i);
        num.add(j);
        num.add(k);
        num.add(x);
        num.add(y);
        Collections.sort(num);
        System.out.println("\nEntered numbers in ascending order:");
        System.out.println(num);

//        int[] array = new int[] {
//                i, j, k, x, y
//        };
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }
}
