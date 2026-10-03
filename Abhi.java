import java.util.Scanner;

public class Abhi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");
        int number = sc.nextInt();

        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter your favorite quote: ");
        String quote = sc.nextLine();

        System.out.printf("Favorite Number: %d%n", number);
        System.out.printf("Favorite Quote: %s%n", quote);

        sc.close();
    }
}
