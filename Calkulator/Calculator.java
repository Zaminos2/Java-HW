import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("num 1");
        double num1 = input.nextDouble();
        System.out.println("num 2");
        double num2 = input.nextDouble();

        System.out.println("operation");
        char operator = input.next().charAt(0);

        double resoult = 0;

        if (operator == '-'){
        resoult = num1 - num2;
        }
        else if (operator == '+') {
          resoult = num1 + num2;
        }
        else if (operator == '*'){
            resoult = num1 * num2;
        }
        else if (operator == '/') {
            resoult = num1 / num2;
        }
        else {System.out.println("wrong operation");
            return;

        }
        System.out.println(resoult);
    }
}
