import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    public int difficulty;
    public TreeSet<Integer> amount = new TreeSet<Integer>();

    public Randomizer() {
        difficulty = Difficulty.diff;
        int Rand;
        if (difficulty == 1) {
            TreeSet<Integer> temp = new TreeSet<>();
            while (temp.size() < 4)
            {
                for (int i = 0; i < 1; i++) {
                    Rand = ThreadLocalRandom.current().nextInt(1, 200);
                    temp.add(Rand);
                }
            }
            int n = temp.size();
            int arr[] = new int[n];

            int i = 0;

            for (int ele : temp)
                arr[i++] = ele;

            Arrays.sort(arr);

            for(int j : arr)
            {
                String Base2 = Integer.toString(j,2);
                System.out.println(j + " == " + Base2);
            }
        } else if (difficulty == 2) {
            Rand = ThreadLocalRandom.current().nextInt(201, 400);
        } else if (difficulty == 3) {
            Rand = ThreadLocalRandom.current().nextInt(401, 600);
        }


    }
}
