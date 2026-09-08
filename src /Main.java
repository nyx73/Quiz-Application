import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which keyword is used to create an object in Java?",
                "class",
                "new",
                "object",
                "create",
                "B"
        ));

        questions.add(new Question(
                "Which method is the starting point of a Java program?",
                "start()",
                "run()",
                "main()",
                "begin()",
                "C"
        ));

        questions.add(new Question(
                "Which data type is used to store whole numbers?",
                "double",
                "String",
                "boolean",
                "int",
                "D"
        ));

        questions.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                "this",
                "extends",
                "super",
                "inherit",
                "B"
        ));

        questions.add(new Question(
                "Which symbol is used to end a statement in Java?",
                ".",
                ":",
                ";",
                ",",
                "C"
        ));

        System.out.println("================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("================================");

        System.out.println("\nTotal Questions: " + questions.size());

        sc.close();
    }
}
