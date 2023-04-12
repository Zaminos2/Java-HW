import java.util.Random;
import java.util.Scanner;
public class Game {

     static final String ROCK = "Камень";
     static final String PAPER = "Бумага";
     static final String SCISSORS = "Ножницы";
   static Scanner scanner = new Scanner(System.in);

    static Random random = new Random();
    public static String playerChoice(int num) {
        String player = "";
        while (true) {
            System.out.println("Игрок " + num + " выберите значение");
            player = scanner.next();
            if (isCorrect(player)){
                break;
            }else {
                System.out.println("Не вводи хрень!!");
            }

        }
        return player;
    }
    public static String compChoice(){
    String choice = "";
    int ran = random.nextInt(3) + 1;

    if (ran == 1){
        choice = ROCK;
    }
    else if (ran == 2){
        choice = PAPER;
    }
    else if (ran == 3){
        choice = SCISSORS;
    }
    return choice;
    }
    public static String winnerSet (String player1, String player2){
        String winner = "";
        if (player1.equals(player2)) {
            System.out.println("Ничья");
        } else if (player1.equals(SCISSORS) && player2.equals(PAPER) ||
                player1.equals(ROCK) && player2.equals(SCISSORS) ||
                player1.equals(PAPER) && player2.equals(ROCK)) {
            winner = "Игрок 1 победил!!";
        } else {
            winner = "Игрок 2 победил!!";
        }
        return winner;
    }
    public static boolean isCorrect (String player){
        if(player.equals(SCISSORS) || player.equals(ROCK) || player.equals(PAPER)){
            return true;
        }else {
            return false;
        }
    }
    public static int gameModes (){
        System.out.println("Choose your game \n" +
                "1 Player vs Player \n" +
                "2 Player vs com \n" +
                "3 com vs com \n" +
                "4 Exit");
        int mode = 0;
        while (true){
            mode = scanner.nextInt();
            if (isMenuCorrekt(mode)){
                break;
            }else {
                System.out.println("Wrong choose!!");
            }
        }
        return mode;
    }
    public static void menu(){
        while (true){
            switch (gameModes()){
                case 1:
                    System.out.println(winnerSet(playerChoice(1),playerChoice(2)));
                    break;
                case 2:
                    System.out.println(winnerSet(playerChoice(1),compChoice()));
                    break;
                case 3:
                    System.out.println(winnerSet(compChoice(),compChoice()));
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public static boolean isMenuCorrekt(int mode){
        if (mode == 1 || mode == 2 || mode == 3 || mode == 4 ){
            return true;
        }else {
            return false;
        }
    }

}
