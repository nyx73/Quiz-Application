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

        int score = 0;
        for (int i = 0; i < questions.size(); i++) {

            Question q = questions.get(i);

            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(q.questionText);

            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);

           String answer = sc.nextLine();

if (answer.equalsIgnoreCase(q.correctAnswer)) {
    System.out.println("Correct! ✓");
    score++;
} else {
    System.out.println("Wrong! ✗");
}
        System.out.println("You selected: " + answer);
        }
System.out.println("\n================================");
System.out.println("           RESULT");
System.out.println("================================");
System.out.println("Correct Answers : " + score);
System.out.println("Total Questions : " + questions.size());

double percentage = (double) score / questions.size() * 100;

System.out.println("Score           : " + (int) percentage + "%");
System.out.println("================================");
        sc.close();
    }
}
