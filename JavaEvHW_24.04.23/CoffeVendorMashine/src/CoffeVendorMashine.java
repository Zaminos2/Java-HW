import java.util.Scanner;

public class CoffeVendorMashine {
    private String watter = "Вода ";
    private String zukker = "Сахар ";
    private String coffe = "кофе ";
    private String tea = "чай ";
    private String milk = "молоко ";

    public String makeEspresso(){
        Scanner sc = new Scanner(System.in);
        String espresso = "";
        System.out.println("Добаваить сахар?");
        String choise = sc.nextLine();
        if(choise.equals("нет")) {
            espresso = coffe + watter;
        }else if(choise.equals("да")){
            espresso = coffe + watter + zukker;
        }else {
            System.out.println("Неверная уоманда!! Только да или нет.");
        }
        return espresso;
    }
    public String americano(){
        Scanner sc = new Scanner(System.in);
        String americano = "";
        System.out.println("Добаваить сахар?");
        String choise = sc.nextLine();
        if(choise.equals("нет")) {
            americano = makeEspresso() + watter;
        }else if(choise.equals("да")){
            americano = makeEspresso() + watter + zukker;
        }else {
            System.out.println("Неверная уоманда!! Только да или нет.");
        }
        return americano;
    }
    public String makeCapuchino(){
        Scanner sc = new Scanner(System.in);
        String capuchino = "";
        System.out.println("Добавить сахар?");
        String choise = sc.nextLine();
        if (choise.equals("нет")){
            capuchino = makeEspresso() + milk;
        } else if (choise.equals("да")) {
            capuchino = makeEspresso() + milk + zukker;
        }
        return capuchino;
    }
    public String makeTea(){
        Scanner sc = new Scanner(System.in);
        String hotTea;
        System.out.println("Выберите опцию: ");
        System.out.println("1. Просто чай");
        System.out.println("2. Чай с сахором");
        System.out.println("3. Чай с сахором и молоком");
        System.out.println("4. Только с молоком");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                hotTea = tea + watter;
                break;
            case "2":
                hotTea = tea + zukker;
                break;
            case "3":
                hotTea = tea + zukker + milk;
                break;
            case "4":
                hotTea = milk + tea;
                break;
            default:
                System.out.println("Ошибка! Введите число от 1 до 4");
                return makeTea();
        }
        return hotTea;
    }
    public void coffeeMachineMenu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите опцию: ");
        System.out.println("1. Эспрессо");
        System.out.println("2. Американо");
        System.out.println("3. Капучино");
        System.out.println("4. Чай");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                System.out.println(makeEspresso());;
                break;
            case "2":
                System.out.println(americano());;
                break;
            case "3":
                System.out.println(makeCapuchino());;
                break;
            case "4":
                System.out.println(makeTea());;
                break;
            default:
                System.out.println("Ошибка! Введите число от 1 до 4");
                coffeeMachineMenu();
        }
        sc.close();

    }
}
