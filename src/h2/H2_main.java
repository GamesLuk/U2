package h2;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {

        int i = RandomGenerator.getDefault().nextInt(-20, 20);
        int j = RandomGenerator.getDefault().nextInt(-20, 20);
        int k = RandomGenerator.getDefault().nextInt(-20, 20);
        int min;
        int max;

        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        list.add(k);

        System.out.println(list.toString());

        list.sort(Integer::compareTo);

        System.out.println(list.toString());

        min = list.getFirst();
        max = list.getLast();

        System.out.println(min);
        System.out.println(max);

    }

}
