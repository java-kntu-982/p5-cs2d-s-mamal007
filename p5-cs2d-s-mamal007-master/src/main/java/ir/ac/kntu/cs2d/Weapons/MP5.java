package Weapons;

public class MP5 extends MainWeapon {
    public MP5() {
        setAvailable("Soldier");
        setCapacity(30);
        setDamage(13);
        setFireAgain(120);
        setName("MP5");
        setPrice(1500);
        setReload(3.1);
    }
}
