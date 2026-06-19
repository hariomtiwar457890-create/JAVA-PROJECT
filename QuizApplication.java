import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "1. Java kis company ne develop kiya tha?",
                "2. Java ka founder kaun hai?",
                "3. Java me entry point method ka naam kya hai?",
                "4. JVM ka full form kya hai?",
                "5. Java kis type ki language hai?"
        };

        String[][] options = {
                {"A. Microsoft", "B. Sun Microsystems", "C. Google", "D. Apple"},
                {"A. Dennis Ritchie", "B. James Gosling", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
                {"A. start()", "B. run()", "C. main()", "D. execute()"},
                {"A. Java Variable Machine", "B. Java Virtual Machine", "C. Java Verified Machine", "D. Java Value Machine"},
                {"A. Procedural", "B. Assembly", "C. Object-Oriented", "D. Machine Language"}
        };

        char[] answers = {'B', 'B', 'C', 'B', 'C'};

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter Your Answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        double percentage = ((double) score / questions.length) * 100;

        System.out.println("\\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
