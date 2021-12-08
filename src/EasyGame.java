import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.out;

public class EasyGame
{
    public EasyGame()
    {
        // New Integer[] of 10 values
        Integer[] temp = new Integer[10];
        // Loop 10 Times Incrementing
        for(int j = 0; j < 10; j++)
        {
            // Rnd = Random num between 1-100
            int rnd = ThreadLocalRandom.current().nextInt(1, 100);
            // Assign temp[index j] == rnd
            temp[j] = rnd;
        }
        // Make temp an Ordered Array
        Randomizer Ordered = new Randomizer();

        Integer[] OrderedArray = Ordered.Sort(temp);
        String output = "";
        for(int k : OrderedArray)
        {

            output += k + ", ";
        }
        out.println(output.substring(0, output.length()-2));


    }


}
