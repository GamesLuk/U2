package h1;

import java.util.random.RandomGenerator;

public class H1_main {

    public static void main(String[] args) {

        int z = RandomGenerator.getDefault().nextInt(0, 20);

        System.out.println(z);

        if (z > 10) z -= 10;

        System.out.println(z);

    }

}
