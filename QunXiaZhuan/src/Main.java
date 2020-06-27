import java.io.FileReader;

public class Main {



    public void main(String[] args) {
        int hurt;
        Fighter WuJi = new Fighter();
        Fighter ShiTai = new Fighter();
        WuJi.setName("张无忌");
        ShiTai.setName("灭绝师太");
        WuJi.addweapon(new WeaponRealize("屠龙宝刀"));
        ShiTai.addweapon(new WeaponRealize("倚天剑"));


        while (WuJi.hp!=0||ShiTai.hp!=0){
            SkillRealize x = null;
            x.apply(WuJi,ShiTai);
              WuJi.attack(ShiTai);
        }
    }
}
