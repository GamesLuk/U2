package p2;

import java.util.random.RandomGenerator;

public class P2_main {

    public static void main(String[] args) {

        int i = RandomGenerator.getDefault().nextInt(0, 20);
        boolean b = RandomGenerator.getDefault().nextBoolean();

        System.out.println(i + " " + b);

        if (i > 10) {
            b = true;
        }

        System.out.println(i + " " + b);
    }

}
