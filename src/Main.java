import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("The quiz will be added soon.");

        sc.close();
    }
}
