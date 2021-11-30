import java.util.Scanner;

public class MatcherRunner
{
    public static void main(String[] args)
    {
        //Declare Scanner
        //{
        Scanner input = new Scanner(System.in);
        //}
        
        //Startup Messages
        //{
        System.out.println("Hello User");    
        System.out.println("What shall I Call You");    
        String name = input.nextLine();
        System.out.println("Ok " + name + " It's Nice to Meet You");
        //}
        
        //While loop in order to quit or send to process method
        //{
        while(true)
        {
            System.out.println("Would You Like to Play My Game or Quit  (Enter: play/quit)");
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
        //}
        }
    
    public static void CommandProcesser(){
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");

    }
    }
