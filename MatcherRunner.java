import java.util.Scanner;

public class MatcherRunner
{
    public static void main(String[] args)
    {
        //Declare Scanner
        Scanner input = new Scanner(System.in);
        
        //Startup Messages
        System.out.println("Hello User");    
        System.out.println("What shall I Call You");    
        String name = input.nextLine();
        System.out.println("Ok " + name + " It's Nice to Meet You");
        
        //While loop in order to quit or send to process method
        while(true)
        {
            System.out.println("Would You Like to Play My Game or Quit  (Enter: play/quit) juhuh");
            String command = input.nextLine();
            if(command.equalsIgnoreCase("quit"))
            {
                System.out.println("Goodbye");
                input.close();
                break;
            }
            else if(command.equalsIgnoreCase("play"))
            {
                CommandProcesser();
            }
        }    
    }
    
    public static void CommandProcesser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Attempt to Match These Base 10 Numbers With a Random Base Between 1 and 10");
        System.out.println("Would You Like to Play on:" + "\n" + "Easy" + "\n" + "Medium" + "\n" + "Or Hard");
        String difficulty = input.nextLine();
        
        DifficultyChecker DC = new DifficultyChecker(difficulty);
        int i = DC.check();

        if(i == 1){
            System.out.println("Easy It Is");
        }
        else if(i == 2)
        {
            System.out.println("Medium It Is");
        }
        else if(i == 3)
        {
            System.out.println("Hard It Is");
        }
    }
}
