import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the String");

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.print("Input Alphabet is Lower-Case");
        }else {
            System.out.print("Input Alphabet is Upper-Case");
        }
    }
}
