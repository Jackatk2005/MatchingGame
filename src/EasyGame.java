package src;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.out;

public class EasyGame
{
    public static String base2 = "";
    private static final int SIZE = 4;
    public static Map<String, Integer> count = new HashMap<>();
    public EasyGame()
    {
        // New Integer[] of 10 values
        TreeSet<Integer> temp = new TreeSet<>();
        // Loop 10 Times Incrementing
        while(temp.size() < SIZE) {
            // Rnd = Random num between 1-100
            int rnd = ThreadLocalRandom.current().nextInt(1, 100);
            // Assign temp[index j] == rnd
            temp.add(rnd);
        }
        // Make temp an Ordered Array
        // New Treeset that orders the Integers in descending order
        TreeSet<Integer> res = (TreeSet<Integer>)temp.descendingSet();
        // New String for the Base10 outputs
        Stack<String> Base10Arr = new Stack<String>();
        Stack<String> Base2Arr = new Stack<String>();
        // make each element a part of output

        String Base2 = "";
        // For Each loop that add binary to Base2Arr
        for(int j : res)
        {
                Base2Arr.add(Integer.toString(j, 2));
        }
        // For Each loop that add j to Base10Arr
        for(int j : res)
        {
            Base10Arr.add(Integer.toString(j));
        }
        Collections.shuffle(Base2Arr);
        // For loop that prints out the
        count.put("1",0);
        while (Base2Arr.size() != 0)
        {
            for(int t = 0; t < Base2Arr.size(); t++)
            {
                out.println(t + 1 + ": " + Base10Arr.get(t) + " __________ " + Base2Arr.get(t));
            }
            Scanner sc = new Scanner(System.in);


                out.println("Input The base10 Num then the Base2 Num: (Ex: 1 2)");

                String Base10 = sc.next();
                String Basee2 = sc.next();
                Queue<String> qs = new LinkedList<>();

                qs.add(Base10);
                qs.add(Basee2);
                Iterator<String> In = qs.iterator();

                String base10 = In.next();
                base2 = In.next();
                out.println(base10);

                if(Integer.parseInt(base10) > Base10Arr.size() || Integer.parseInt(base2) > Base2Arr.size())
                {
                    out.println("Invalid Try Again");
                }
                else
                {
                    int intBase2 = Integer.parseInt(base2.trim());
                    int intBase10 = Integer.parseInt(base10.trim());



                    String h = String.valueOf(Integer.parseInt(Base2Arr.get(intBase2-1), 2));

                    if(Objects.equals(h, Base10Arr.get(intBase10-1)))
                    {
                        out.println("You Did it");
                        count.put("1",count.get("1")+ 1);
                        Base2Arr.remove(intBase2-1);
                        Base10Arr.remove(intBase10-1);
                    }
                    else
                    {
                        count.put("1",count.get("1")+ 1);
                        out.println("Oops, Try Again");
                    }
            }

        }
        out.println("You Finished in " + count.get("1") + " Guesses");






    }


}
