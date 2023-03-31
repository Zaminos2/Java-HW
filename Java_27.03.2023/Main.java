import java.util.Random;
import java.util.Scanner;
public class Main {
    static Random random;
    static  Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Приветствие");
            String hello = sc.nextLine();
            System.out.println("Имя");
            String name = sc.nextLine();
            System.out.printf("%s  %s\n", hello, name);

            Human Oleksii = new Human("Oleksii","Student");
            Oleksii.out();
        }


}
