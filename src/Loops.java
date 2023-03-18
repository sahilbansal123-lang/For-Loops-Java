import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        /*
            // Syntax of for loops

            for(initialization, condition, inc/dec) {
                // Body
            }

         */

        // Q: Print numbers from 1 to 10

//        for (int num = 1; num <= 10; num++){
//            System.out.println(num);
//        }

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.print("Numbers are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(i + " ");
//
//        }


        /*
            // While loop Syntax

                while( condition){
                    // body
                }

         */

        // Print numbers from 1 to 10 using while loop

//        int num = 0;
//        while (num < 10) {
//            System.out.print(num + " ");
//            num++;
//        }


        /*

            // Do-While Loop

            do{
            // body
            }while(condition);

        */

//        int n = 1;
//        do {
//            System.out.print(n + " ");
//            n++;
//        } while(n<= 10);


// -----------------------------------------------------------------------

//        Q: Find the largest of the three numbers

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int a = in.nextInt();
        System.out.println("Enter the second Number");
        int b = in.nextInt();
        System.out.println("Enter the third Number");
        int c = in.nextInt();

//        if(a>b && a>c){
//            System.out.println("Largest Number is: " +a);
//        } else if (b>c) {
//            System.out.println("Largest Number is: " +b);
//        } else {
//            System.out.println("Largest Number is: " +c);
//        }

//               -----OR-----

        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.print("Largest Number is: " +max);
    }
}
