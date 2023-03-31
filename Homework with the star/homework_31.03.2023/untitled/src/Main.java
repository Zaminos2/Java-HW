public class Main {
    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates(9.5, 12.4);
        boolean isInRange = coordinates.isInRange(10.45, 50.20, 05.3, 57.2);
        Coordinates3D coordinates3D = new Coordinates3D(12.4, 32.4, 24.6);
        boolean isInRange3D = coordinates3D.isInRange(04.2, 45.5, 03.56, 70.45, 10.45, 56.34);
        System.out.println(isInRange);
        System.out.println(isInRange3D);
        Human[] humans = {
                new Human(37, "Oleksii", 58),
                new Human(40, "Volodymyr", 64),
                new Human(47, "Dima", 110),
                new Human(44, "Svitlana", 65),
                new Human(18, "Kateryna", 45)

        };
        System.out.println("Возраст превышает 25 лет и вес меньше 60 кг:");
        for (Human human : humans) {
            if (human.getAge() > 25 && human.getWeight() < 60) {
                System.out.println(human.getName() + " (" + human.getAge() + " years old " + human.getWeight() + " kg)");
            }
        }
        System.out.println("\nВес больше 70 кг и длина имени не превышает 5 символов:");
        for (Human human : humans){
            if(human.getWeight() > 70 && human.getName().length() <= 5){
                System.out.println(human.getName() + " (" + human.getAge() + " years old " + human.getWeight() + " kg)");

            }
        }
        System.out.println("\nИмя начинается с гласной, возраст меньше 18 либо вес больше 70:");
        for (Human human : humans) {
            String firstChar = human.getName().substring(0, 1).toLowerCase();
            if (firstChar.matches("[aeiou]") && (human.getAge() < 18 || human.getWeight() > 70)) {
                System.out.println(human.getName() + " (" + human.getAge() + " years old, " + human.getWeight() + " kg)");
            }
        }
    }
}