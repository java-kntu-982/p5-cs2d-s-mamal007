package Soldiers;

import Weapons.USP;

public class CT extends Soldier {
    public CT() {
        setHealth(100);
        setColt( new USP());
        setMoney(800);
    }
}
