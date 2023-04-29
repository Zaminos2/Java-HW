import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GameLogik {

    private int[] playerNumbers;
    private int[] randNumbers;
    private int fullsize;

    public int[] getRandNumbers() {
        return randNumbers;
    }

    public int[] addPlayerNumbers() {
        Scanner sc = new Scanner(System.in);
        this.fullsize = 0;
        this.playerNumbers = new int[6];
        System.out.println("Введите число от 1 до 36");
        while (fullsize < 6) {
            int value = sc.nextInt();
            if (value > 0 && value < 37) {
                boolean chek = false;
                for (int i = 0; i < fullsize; i++) {
                    if (value == playerNumbers[i]){
                        chek=true;
                        System.out.println("Такое число уже использованно!");
                        break;
                    }
                }
                if (!chek) {
                    this.playerNumbers[fullsize] = value;
                    fullsize++;
                }
            }else {
                System.out.println(" Ошибка !! Ведите число от 1 до 36");

            }
        }
        sc.close();
        return playerNumbers;
    }
    public int [] addRandNumbers(){
        Random random = new Random();
        this.randNumbers = new int[6];
        this.fullsize =0;
        while (fullsize < 6){
            int value = random.nextInt(1,37);
            boolean chek = false;
            for (int i = 0; i < fullsize; i++) {
                if(value == randNumbers[i]){
                    chek = true;
                }
            }
            if(!chek){
                this.randNumbers[fullsize] = value;
                fullsize ++;
            }
        }
        return randNumbers;
    }
    public void gameResault(){
        int victoryCount =0;
        for (int i = 0; i < playerNumbers.length; i++) {
            for (int j = 0; j < randNumbers.length; j++) {
                if (playerNumbers[i] == randNumbers[j]){
                    victoryCount++;
                }
            }
        }
        if (victoryCount >= 6){
            System.out.println("Выйгрышные числа " + Arrays.toString(randNumbers));
            System.out.println("Джекпот");
        }else {
            System.out.println("Выйгрышные числа " + Arrays.toString(randNumbers));
            System.out.println("Вы угадали " + victoryCount + " чисел");
        }
    }
}