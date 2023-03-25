
import java.util.Scanner;

public class Main {
    static byte smallNum ;
    static short number;
    static int midNum;
    static  long maxNum;
    static  float floatNum;
    static double corNum;
    static char sym;
    static boolean qest;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        smallNum = 3;


        System.out.println("Введите число");
        byte smallNum2 = sc.nextByte();
        System.out.println("Введите число (2)");
        smallNum = sc.nextByte();
        System.out.println("Ещё одно");
        short number2 = sc.nextShort();
        System.out.println("Ещё одно (2)");
        number = sc.nextShort();
        System.out.println("И ещё");
        int midNum2 = sc.nextInt();
        System.out.println("И ещё (2)");
        midNum = sc.nextInt();
        System.out.println("Опять таки");
        long maxNum2 = sc.nextLong();
        System.out.println("Опять таки (2)");
        maxNum = sc.nextLong();
        System.out.println("Дробное");
        float floatNum2 = sc.nextFloat();
        System.out.println("Дробное (2)");
        floatNum = sc.nextFloat();
        System.out.println("Точьное");
        double corNum2 = sc.nextDouble();
        System.out.println("Точьное (2)");
        corNum = sc.nextDouble();
        System.out.println("Знак");
        char sym2 = sc.next().charAt(0);
        System.out.println("Знак (2)");
        sym = sc.next().charAt(0);
        System.out.println("Правда или нет");
        boolean qest2 = sc.nextBoolean();
        System.out.println("Правда или нет");
        qest = sc.nextBoolean();

        System.out.println("|------|-------|-----|------|-------|--------|------|---------|");
        System.out.println("|-byte-|-short-|-int-|-long-|-float-|-double-|-char-|-boolean-|");
        System.out.printf("|%6d|%7d|%5d|%6d|%7.2f|%8.2f|%6c|%9b|\n",smallNum2,number2,midNum2,maxNum2,floatNum2,corNum2,sym2,qest2);
        System.out.printf("|%6d|%7d|%5d|%6d|%7.2f|%8.2f|%6c|%9b|\n", (smallNum+1),number,midNum,maxNum,floatNum,corNum,sym,qest);
        System.out.println("|------|-------|-----|------|-------|--------|------|---------|");

    }
}
