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
            Integer[] base2 = new Integer[4];
            for (int j = 0; j < 4; j++) {
                Base2 = Integer.toString(arr[j], 2);
                base2[j] = Integer.valueOf(Base2);
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
            Integer[] base2 = new Integer[6];
            for (int j = 0; j < 6; j++) {
                Base2 = Integer.toString(arr[j], 2);
                base2[j] = Integer.valueOf(Base2);
            }
            shuffleArray(base2);
            for (int p = 0; p < 6; p++) {
                System.out.println(arr[p] + " ———— " + base2[p]);
            }


    }
    else if(difficulty ==3)
    {
        TreeSet<Integer> temp = new TreeSet<>();
        while (temp.size() < 10) {
            for (int i = 0; i < 1; i++) {
                Rand = ThreadLocalRandom.current().nextInt(401, 600);
                temp.add(Rand);
            }
        }
        Integer[] arr = new Integer[10];

        int i = 0;

        for (int ele : temp) {
            arr[i++] = ele;
        }

        Arrays.sort(arr);
        Integer[] base2 = new Integer[10];
        for (int j = 0; j < 10; j++) {
            Base2 = Integer.toString(Integer.parseInt(String.valueOf(arr[j])), 2);
            base2[j] = Integer.valueOf(Base2);
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

        int ans1 = Integer.parseInt(String.valueOf(arr[inans1]));

        String a = String.valueOf(base2[inans2]);
        int ans2 = Integer.parseInt(a,2);

        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(base2);
        int count = 15;
        while(true)
        {
            count--;
            if(count == 0){
                break;
            }
            else if(ans1 == ans2)
            {
                System.out.println("Way To Go");
                list1.remove(inans1);
                list2.remove(inans2);
                for (int p = 0; p < list1.size(); p++) {
                    System.out.println(p+": "+arr[p] + " ———— " + p+": "+base2[p]);
                }
            }
            else
            {
                System.out.println("Oops That's Wrong, Try Again");
            }

        }
    }
}

    static void shuffleArray(Integer[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = String.valueOf(ar[index]);
            ar[index] = ar[i];
            ar[i] = Integer.valueOf(a);
        }
    }

}