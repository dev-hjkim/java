package c.inheritance;

public class Dog extends Animal {
    public boolean isBark;

    public void move() {
        System.out.println("Dog is moving!");
    }

    public void eatFood() {
        System.out.println("Dog is eating!");
    }
}