import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);

        int checkIsPrime = s.nextInt();
        boolean is = false;

        for (int i = 2; i < checkIsPrime; i++)

        {
            if (checkIsPrime % i == 0) {
                is = true;
                break;
            }
        }

        if (is) {
            System.out.println(checkIsPrime + " is not a prime number");
        } else {
            System.out.println(checkIsPrime + " is a prime number");

        }


    }
}
