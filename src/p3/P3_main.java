package p3;

import java.util.random.RandomGenerator;

public class P3_main {

    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int k = 2;

        // i = RandomGenerator.getDefault().nextInt(-10, 10);
        // j = RandomGenerator.getDefault().nextInt(-10, 10);
        // k = RandomGenerator.getDefault().nextInt(-10, 10);

        System.out.println(i + " " + j + " " + k);

        if (i < j) System.out.println("A");
        if (i < k) System.out.println("B");
        if (j < k) System.out.println("C");

    }
}

/* Aufgaben zum Code:

    Möglichkeiten:
        - nichts    0 0 0
        - A         1 2 1
        - C         3 1 2
        - AB        1 2 2
        - BC        0 0 1
        - ABC       1 2 3


 */
