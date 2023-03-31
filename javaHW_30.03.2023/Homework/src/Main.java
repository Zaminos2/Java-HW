

public class Main {

    static double x = 8;
    static double y = 3;
    static double z = 5;

    public static void main(String[] args) {
        Car car = new Car("Opel ","Germany ",2020,true);
        System.out.println(car.getMark() + car.getCountry() + car.getYear() + " " + car.isElektrik());
        Car car2 = new Car("Volvo ","Polland ",2016);
        System.out.println(car2.getMark() + car2.getCountry() + " " + car2.getYear());
        System.out.println(isBigger3());
    }

    /**
     * набор статических методов для математических дейчтвий
     * @return
     */
    public static double add (){
    return x + y;
    }
    public static double subtract (){
        return x - y;
    }
    public static double multiply (){
        return x * y;
    }
    public static double divide (){
        if(y == 0){
            throw new IllegalArgumentException("cannot divide by zero");
        }
        return x / y;
    }

    /**
     * набор логических методов
     * @return
     */
    public static boolean isBigger(){
        if(x > y && x > z){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isBigger2() {
        if (x > y || x > z) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isBigger3(){
        if (x > y ^ x > z){
            return true;
        }else {
            return false;
        }
    }
}