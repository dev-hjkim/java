package c.inheritance;

public class Animal {
    public String name;
    public String kind;
    public int legCount;
    public int iq;
    public boolean hasWing;

    public void move() {
        System.out.println("Animal is moving!");
    }

    public void eatFood() {
        System.out.println("Animal is eating!");
    }
}