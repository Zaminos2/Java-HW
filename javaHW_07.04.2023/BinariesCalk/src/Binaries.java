import java.util.Scanner;
public class Binaries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary is: " + binary);

    }



}
