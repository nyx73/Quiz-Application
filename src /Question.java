public class Question {

    String questionText;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String correctAnswer;

    public Question(String questionText, String optionA, String optionB,
                    String optionC, String optionD, String correctAnswer) {

        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {

        System.out.println(questionText);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    public boolean isCorrect(String answer) {

        return answer.equalsIgnoreCase(correctAnswer);
    }
}
