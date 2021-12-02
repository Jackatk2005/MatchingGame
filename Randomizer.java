import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    public int difficulty;
    public TreeSet<Integer> amount = new TreeSet<Integer>();
    public String Base2;

    public Randomizer() {
        difficulty = Difficulty.diff;
        int Rand;
        if (difficulty == 1) {
            TreeSet<Integer> temp = new TreeSet<>();
            while (temp.size() < 4) {
                for (int i = 0; i < 1; i++) {
                    Rand = ThreadLocalRandom.current().nextInt(1, 200);
                    temp.add(Rand);
                }
            }
            int n = temp.size();
            int arr[] = new int[n];

            int i = 0;

            for (int ele : temp) {
                arr[i++] = ele;
            }

            Arrays.sort(arr);
            String[] base2 = new String[4];
            for (int j = 0; j < 4; j++) {
                Base2 = Integer.toString(arr[j], 2);
                base2[j] = Base2;
            }
            shuffleArray(base2);
            for (int p = 0; p < 4; p++) {
                System.out.println(arr[p] + " ———— " + base2[p]);
            }

        } else if (difficulty == 2) {
            TreeSet<Integer> temp = new TreeSet<>();
            while (temp.size() < 6) {
                for (int i = 0; i < 1; i++) {
                    Rand = ThreadLocalRandom.current().nextInt(201, 400);
                    temp.add(Rand);
                }
            }
            int arr[] = new int[6];

            int i = 0;

            for (int ele : temp) {
                arr[i++] = ele;
            }

            Arrays.sort(arr);
            String[] base2 = new String[6];
            for (int j = 0; j < 6; j++) {
                Base2 = Integer.toString(arr[j], 2);
                base2[j] = Base2;
            }
            shuffleArray(base2);
            for (int p = 0; p < 6; p++) {
                System.out.println(arr[p] + " ———— " + base2[p]);
            }


    }
    else if(difficulty ==3)
    {
        TreeSet<String> temp = new TreeSet<>();
        while (temp.size() < 10) {
            for (int i = 0; i < 1; i++) {
                Rand = ThreadLocalRandom.current().nextInt(401, 600);
                String s = Integer.toString(Rand);
                temp.add(s);
            }
        }
        String arr[] = new String[10];

        int i = 0;

        for (String ele : temp) {
            arr[i++] = ele;
        }

        Arrays.sort(arr);
        String[] base2 = new String[10];
        for (int j = 0; j < 10; j++) {
            Base2 = Integer.toString(Integer.parseInt(arr[j]), 2);
            base2[j] = Base2;
        }
        shuffleArray(base2);
        for (int p = 0; p < 10; p++) {
            System.out.println(p+": "+arr[p] + " ———— " + p+": "+base2[p]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Say the First Number Then the Second Number. {EX: (1 2)}");
        String answer = sc.next();
        String answer2 = sc.next();

        int inans1 = Integer.parseInt(answer);
        int inans2 = Integer.parseInt(answer2);

        int ans1 = Integer.parseInt(arr[inans1]);

        String a = base2[inans2];
        int ans2 = Integer.parseInt(a,2);

        List<String> list1 = Arrays.asList(arr);
        List<String> list2 = Arrays.asList(base2);

        while(!list1.isEmpty())
        {

            if(ans1 == ans2)
            {
                System.out.println("Way To Go");
                list1.remove(inans1);
                list1.remove(inans2);
                for (int p = 0; p < 10; p++) {
                    System.out.println(p+": "+arr[p] + " ———— " + p+": "+base2[p]);
                }
            }
        else
        {
            System.out.println("Oops That's Wrong");
        }
    }


    }


}

    static void shuffleArray(String[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

}
