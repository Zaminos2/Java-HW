import java.util.Scanner;

public class main {
    byte smallNum ;
    short number;
    int midNum;
    long maxNum;
    float floatNum;
    double corNum;
    char sym;
    boolean qest;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {




        System.out.println("Введите число");
        byte smallNum2 = sc.nextByte();
        System.out.println("Введите число (2)");
        byte smallNum = sc.nextByte();
        System.out.println("Ещё одно");
        short number2 = sc.nextShort();
        System.out.println("Ещё одно (2)");
        short number = sc.nextShort();
        System.out.println("И ещё");
        int midNum2 = sc.nextInt();
        System.out.println("И ещё (2)");
        int midNum = sc.nextInt();
        System.out.println("Опять таки");
        long maxNum2 = sc.nextLong();
        System.out.println("Опять таки (2)");
        long maxNum = sc.nextLong();
        System.out.println("Дробное");
        float floatNum2 = sc.nextFloat();
        System.out.println("Дробное (2)");
        float floatNum = sc.nextFloat();
        System.out.println("Точьное");
        double corNum2 = sc.nextDouble();
        System.out.println("Точьное (2)");
        double corNum = sc.nextDouble();
        System.out.println("Знак");
        char sym2 = sc.next().charAt(0);
        System.out.println("Знак (2)");
        char sym = sc.next().charAt(0);
        System.out.println("Правда или нет");
        boolean qest2 = sc.nextBoolean();
        System.out.println("Правда или нет");
        boolean qest = sc.nextBoolean();

        System.out.println("|------|-------|-----|------|-------|--------|------|---------|");
        System.out.println("|-byte-|-short-|-int-|-long-|-float-|-double-|-char-|-boolean-|");
        System.out.printf("|%6d|%7d|%5d|%6d|%7.2f|%8.2f|%6c|%9b|\n",smallNum2,number2,midNum2,maxNum2,floatNum2,corNum2,sym2,qest2);
        System.out.printf("|%6d|%7d|%5d|%6d|%7.2f|%8.2f|%6c|%9b|\n",smallNum,number,midNum,maxNum,floatNum,corNum,sym,qest);
        System.out.println("|------|-------|-----|------|-------|--------|------|---------|");

    }
}
