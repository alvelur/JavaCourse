package chapter10;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("whof whof");
    }

    public void fetch(){
        System.out.println("This is fun");
    }
}
