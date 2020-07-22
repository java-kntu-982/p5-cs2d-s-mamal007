package Soldiers;

import Weapons.Glock;

public class T extends Soldier {
    private boolean hasBomb;

    public T(boolean hasBomb) {
        this.hasBomb = hasBomb;
        this.setHealth(100);
        setColt(new Glock());
        setMoney(800);
    }

    public boolean isHasBomb() {
        return hasBomb;
    }

    public void setHasBomb(boolean hasBomb) {
        this.hasBomb = hasBomb;
    }

    @Override
    public String toString() {
        return "T{" +
                "hasBomb=" + hasBomb +
                '}';
    }
}
