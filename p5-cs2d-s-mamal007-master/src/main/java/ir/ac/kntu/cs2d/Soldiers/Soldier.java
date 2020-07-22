package Soldiers;

import Weapons.Colt;
import Weapons.MainWeapon;

public class Soldier {
    private Colt colt;
    private MainWeapon mainWeapon;
    private int money;
    private int health;
    private boolean guard;

    public Soldier() {
    }

    public boolean isGuard() {
        return guard;
    }

    public void setGuard(boolean guard) {
        this.guard = guard;
        if (guard == true && this.money >= 1000) {
            setMoney(this.money - 1000);
            setHealth(getHealth() + 80);
        }
    }

    public Colt getColt() {
        return colt;
    }

    public void setColt(Colt colt) {
        this.colt = colt;
    }

    public MainWeapon getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(MainWeapon mainWeapon) {
        this.mainWeapon = mainWeapon;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void win() {
        if (this.money <= 18000){
            setMoney(this.money + 3000);
        }
    }

    public void lose() {
        if (this.money <= 18000) {
            setMoney(this.money + 1500);
        }
    }

    public void kill() {
        if (this.money <= 18000) {
            setMoney(this.money + 350);
        }
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "colt=" + colt +
                ", mainWeapon=" + mainWeapon +
                ", money=" + money +
                ", health=" + health +
                '}';
    }
}
