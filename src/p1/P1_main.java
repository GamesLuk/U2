package p1;

import java.util.Scanner;

public class P1_main {

    public static void main(String[] args) {

        System.out.println("Hello from P1_main");

        Scanner s = new Scanner(System.in);
        String zeile = new String(); // why not simply: "String zeile;" ?
        zeile = s.nextLine();
        System.out.println(zeile);
        s.close();

    }

}

/* Aufgaben zum Code:

b) Das Geschriebene wird in der Konsole ausgegeben.

 */
