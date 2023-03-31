public class Human {

    String name;
    String position;

    public Human(String name, String position){
        this.name = name;
        this.position = position;
    }
    public void out(){
    System.out.println("My name " + name + " and i am " + position);
    }

}
