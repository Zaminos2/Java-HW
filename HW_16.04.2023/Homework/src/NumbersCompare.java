import java.util.Scanner;
public class NumbersCompare {
    static int a = 0;
    static int b = 0;
    static Scanner sc;
    public static  boolean compareNumbers(){
        sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

}
