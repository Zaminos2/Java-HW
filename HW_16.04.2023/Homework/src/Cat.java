public class Cat {
     private double age = 0;
     private double weight = 0;
     private String name = "";

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(double age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    public void out(){
        System.out.println("Возраст " + age);
        System.out.println("Вес " + weight);
        System.out.println("Кличка " + name);
    }
}
