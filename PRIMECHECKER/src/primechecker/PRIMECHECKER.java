/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primechecker;

import java.util.Scanner;

/**
 *
 * @author reyes_CPE112
 */
public class PRIMECHECKER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int count = 0;
        String s;
        do {
            System.out.println("CHECKING IF IT'S A PRIME NUMBER");
            float b = a.nextFloat();

            for (int i = 1; i <= b; i++) {
                float y = b / i;

                if (b % i == 0) {
                    count = count + 1;
                }

            }
            if (count == 2) {
                System.out.println("IT'S A PRIME NUMBER!");             
            } else {
                System.out.println("IT IS A COMPOSITE NUMBER!");
            }
            System.out.println("DO YOU WANT TO ENTER ANOTHER NUMBER? [Yes] OR [No]");
            s = a.next();
        } while (s.equals("Yes"));
    }
}
