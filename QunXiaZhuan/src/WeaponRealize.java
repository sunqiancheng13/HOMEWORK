import java.nio.channels.ScatteringByteChannel;

public class WeaponRealize implements Weapon {
     String weaponname;

    public WeaponRealize(String weaponname){
        this.weaponname = weaponname;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    @Override
    public String getName() {
        return getWeaponname();
    }

    @Override
    public int  attack() {
        switch (getName()){
            case "倚天剑":return 15;
            case "屠龙刀":return (int) (Math.random()*(30-20+1)+20);
        }
        return  0;
    }
}
