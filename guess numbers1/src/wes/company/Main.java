package wes.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num = 32;
        Scanner s = new Scanner(System.in);
        int a, j = 0;
        int b = 1;
        while (b == 1 && j < 3) {
            System.out.println("plz enter any number");
            a = s.nextInt();
            if (num == a) {
                System.out.println("user num is equal");
            } else {
                System.out.println("user num is not equal");
                System.out.println("press 1 to continue ");
                System.out.println("or any other key to break");
                b= s.nextInt();
                j++;
            }
        }


    }
}

