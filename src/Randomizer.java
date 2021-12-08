import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {

    public Randomizer()
    {

}
    public Integer[] Sort(Integer[] ar)
    {
        Integer[] jk = new Integer[ar.length];
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            String a = String.valueOf(ar[index]);
            ar[index] = ar[i];
            jk[i] = Integer.valueOf(a);
        }
        return jk;
    }
}