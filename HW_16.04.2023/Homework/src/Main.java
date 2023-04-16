public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(3.5, 4.2, "Васька");
        myCat.out();

        myCat.setAge(3);
        myCat.setWeight(3.3);
        myCat.setName("Мурка");
        myCat.out();

    }
}