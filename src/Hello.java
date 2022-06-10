import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String RU = "RU", RO = "RO", EN = "EN", IT = "IT";

        Scanner input = new Scanner(System.in);
        System.out.println("Available languages:" + "\n1. Russian - " + RU + "\n2. Romanian - " + RO +
                "\n3. English - " + EN + "\n4. Italian - " + IT);
        System.out.println("\nPlease select language from the list (two uppercase letters): ");
        String select = input.nextLine();

        if (select.equals(RU)) System.out.println("Здравствуйте!");
        else if (select.equals(RO)) System.out.println("Bună ziua!");
        else if (select.equals(EN)) System.out.println("Hello!");
        else if (select.equals(IT)) System.out.println("Buongiorno!");
        else System.out.println("This language is not available");
    }
}
