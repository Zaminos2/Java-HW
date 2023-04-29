import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class RandArray {
    private int arrParam;
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private int [] myArray;

    public void arrayCreation(){

        System.out.println("Введите параметры массива");
        arrParam = scanner.nextInt();
        this.myArray = new int[arrParam];

        for (int i = 0; i < arrParam ; i++) {
            myArray[i] = rand.nextInt(arrParam);
            myArray[i] = myArray[i] + 10;
        }
        System.out.println(Arrays.toString(myArray));
    }

}
