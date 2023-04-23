public class PizzaCalloriesCount {
    private int callories = 40;
    private final double PNUM = 3.14;

    public void calloriesCount (int diameter1, int diameter2){
        double sqare1 = diameter1 * 2 / 4 * PNUM;
        double sqare2 = diameter2 * 2 / 4 * PNUM;
        double calloriesRes = 0;
        if (diameter1 < diameter2){
             calloriesRes = (sqare2 * callories) - (sqare1 * callories);
            System.out.println("Вы перебрали на " + calloriesRes + " каллорий");
        } else if (diameter1 ==diameter2) {
            System.out.println("Разницы нет");
        }else {
             calloriesRes = (sqare1 * callories) - (sqare2 * callories);
            System.out.println("Вы перебрали на " + calloriesRes + " каллорий");
        }

    }
}
