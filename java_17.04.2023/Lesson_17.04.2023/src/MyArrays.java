import java.util.Random;
public class MyArrays {
      static   Random random = new Random();
     static int [] arrey;
      static char[] arrey2;
      static int [] numbers(int size, int bound){
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++){
        arr[i] = random.nextInt(bound);
    }
    return arr;
     }
     static char[] characters(int size, int bound) {
        char[] arr2 = new char[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (char) (random.nextInt(bound) + 32);
        }
        return arr2;
    }
    public static void display(){
        int[] intArray = numbers(20, 15);
        System.out.print("intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        char[] charArray = characters(15, 33);
        System.out.print("charArray: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }
}
