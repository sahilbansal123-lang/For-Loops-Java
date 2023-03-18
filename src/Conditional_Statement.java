public class Conditional_Statement {
    public static void main(String[] args) {
    /*
        Syntax of if statement
        if(boolean expression T or F) {
                 // body
           } else {
                //body
           }
     */

        int salary = 1000;

        // SINGLE IF ELSE STATEMENT

//        if(salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 4000;
//        }
//
//        System.out.println("Your salary is: " + salary);

        // MULTIPLE IF ELSE STATEMENT

        if(salary < 10000) {
            salary += 2000;
        } else if (salary > 20000){
            salary += 4000;
        } else {
            salary += 6000;
        }

        System.out.println("Your salary is: " + salary);
    }
}