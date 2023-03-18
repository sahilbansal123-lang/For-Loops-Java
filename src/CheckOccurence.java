import java.util.Scanner;

public class CheckOccurence {
    public static void main(String[] args) {

        // Checking the ocurrence of a number

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int b = in.nextInt();
//
//        int count = 0;
//        while(n > 0){
//            int rem = n % 10;
//            if(rem == b){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

        // Reversing the number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reverseNumber = 0;

        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            reverseNumber = reverseNumber * 10 + rem;

        }
        System.out.print(reverseNumber);
    }
}
