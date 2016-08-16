package qse.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int marks = 56;
        if (marks > 80 && marks < 89) {
            System.out.println("A" );
            if (marks >85){
                System.out.println("you are higher end of A");
            }
            System.out.println("A" );
        } else if (marks > 70 && marks < 79) {
            System.out.println("B" );}
            if (marks >75){
                System.out.println("you are higher end of B");
        } else if (marks > 60 && marks < 69) {
            System.out.println("C" );}
                if (marks >65){
                    System.out.println("you are higher end of C");
        } else if (marks > 50 && marks < 59) {
            System.out.println("D" );}
                    if (marks >55){
                        System.out.println("you are higher end of D");
        } else if (marks > 40 && marks < 49) {
            System.out.println("FAIL" );}
                if (marks >45 && marks<50){
                    System.out.println("you are higher end of FAIL");
        }
    }

        }

