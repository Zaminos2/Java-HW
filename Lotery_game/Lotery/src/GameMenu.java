import java.util.Arrays;
import java.util.Scanner;
public class GameMenu extends GameLogik{
  static Scanner scanner = new Scanner(System.in);
public void gameMenu() {

    int choise;
    System.out.println("Сделайте выбор: ");
    System.out.println(" 1 Играть");
    System.out.println(" 2 Не играть");
    choise = scanner.nextInt();

        switch (choise) {
            case (1): {
                addRandNumbers();
                addPlayerNumbers();
                gameResault();
                break;
            }
            case (777): {
                System.out.println("Режим всевидящего ока!!");
                addRandNumbers();
                System.out.println("Выйгрышные числа " + Arrays.toString(getRandNumbers()));
                addPlayerNumbers();
                gameResault();
                break;
            }
            case (2): {
                System.exit(0);
            }
            default: {
                System.out.println("Такого выбора нет");
                gameMenu();
                break;
            }
        }
    scanner.close();
}
}
