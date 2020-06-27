public class SkillRealize implements Skill{




    @Override
    public void apply(Fighter from, Fighter to) {
       switch ((int)(Math.random()*(1-0+1)+0)) {
           case 0:
               System.out.println(from.getName()+"向"+to.getName()+"使用了双倍攻击");
                 from.getWeapon();
                 to.hurt(weapon.attack()*2);
               break;
           case 1:
               System.out.println(from.getName()+"向"+to.getName()+"使用了眩晕攻击");
               WeaponRealize weaponRealize1 = null;
                 to.hurt((int) (weaponRealize1.attack()*0.5));
               break;
       }
    }
}
