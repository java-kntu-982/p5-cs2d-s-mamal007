package Weapons;

public class Weapon {
    private String name;
    private int price;
    private int damage;
    private int FireAgain;
    private double Reload;
    private int Capacity;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFireAgain() {
        return FireAgain;
    }

    public void setFireAgain(int fireAgain) {
        FireAgain = fireAgain;
    }

    public double getReload() {
        return Reload;
    }

    public void setReload(double reload) {
        Reload = reload;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", damage=" + damage +
                ", FireAgain=" + FireAgain +
                ", Reload=" + Reload +
                ", Capacity=" + Capacity +
                '}';
    }
}
