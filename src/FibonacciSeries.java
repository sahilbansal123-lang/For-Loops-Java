import java.net.SocketTimeoutException;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " " + b);

//        This is for returning the nth number of fibonacci series

//        while(count <= n){
//             int temp = b;
//             b = b + a;
//             a = temp;
//             count++;
//        }

//             Print the fibonacci series

                for(int i = 3; i <= n; i++){
                    int c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }

    }
}
