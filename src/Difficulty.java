import src.EasyGame;
import src.HardGame;
import src.MediumGame;

import java.util.Scanner;

public class Difficulty {

    public static int diff;
    public static String ans;

    public Difficulty(int d)
    {
        diff = d;
        checker();
    }

    public void checker()
    {
        switch (diff)
        {
            case 1:
                Easy();
                break;
            case 2:
                Medium();
                break;
            case 3:
                Hard();
                break;
        }
    }

    public void Easy()
    {
        Scanner Easy = new Scanner(System.in);
        System.out.println("Playing on Easy Consists of 4 Numbers to Match");
        while(true)
        {
            System.out.println("Are You Ready? (y,n)");
            String answer = Easy.nextLine();
            if(answer.equalsIgnoreCase("y"))
            {
                EasyGame EG = new EasyGame();
                break;
            }
            else if(answer.equalsIgnoreCase("n"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input Try Again");
            }
        }
    }
    public void Medium()
    {
        Scanner Medium = new Scanner(System.in);
        System.out.println("Playing on Medium Consists of 6 Numbers to Match");
        System.out.println("Are You Ready? (y)");
        String answer = Medium.nextLine();

        if(answer.equalsIgnoreCase("y"))
        {
            MediumGame MG = new MediumGame();
        }
    }
    public void Hard()
    {
        Scanner Hard = new Scanner(System.in);
        System.out.println("Playing on Hard Consists of 8 Numbers to Match");
        System.out.println("Are You Ready? (y)");
        String answer = Hard.nextLine();

        if(answer.equalsIgnoreCase("y"))
        {
            HardGame EG = new HardGame();
        }
    }
}