import java.util.Iterator;
import java.util.Scanner;

public class MatcherRunner {

    public static int d;

    public static void main(String[] args) {
        //Declare Scanner
        Scanner input = new Scanner(System.in);

        //Startup Messages
        System.out.println("Hello User");
        System.out.println("What shall I Call You");
        String name = input.nextLine();
        System.out.println("Ok " + name + " It's Nice to Meet You");


        //While loop in order to quit or send to process method
        while (true) {
            System.out.println("Would You Like to Play My Game or Quit  (Enter: play/quit)");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye");
                input.close();
                break;
            } else if (command.equalsIgnoreCase("play")) {
                CommandProcessor();
            }
            else
            {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }

    public static void CommandProcessor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Attempt to Match These Base 10 Numbers With a Random Base Between 1 and 10");

        while(true) {
            System.out.println("Would You Like to Play on:\nEasy\nMedium\nOr Hard");
            String difficulty = input.nextLine();
            DifficultyChecker DC = new DifficultyChecker(difficulty);
            int i = DC.check();
            if (i == 1) {
                System.out.println("Easy It Is");
                d = 1;
                break;
            } else if (i == 2) {
                System.out.println("Medium It Is");
                d = 2;
                break;
            } else if (i == 3) {
                System.out.println("Hard It Is");
                d = 3;
                break;
            } else if (i == 4) {
                System.out.println("Invalid Input Try Again");
            }
        }
        Difficulty D = new Difficulty(d);
    }
}