public class Fighter {
    int hp=1000;
    String name;
    String weapon;
    String  skill;
    int hurt;
    int dizz=0;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void addweapon(Weapon weaponRealize){
        weapon=weaponRealize.getName();
    }


    //方法参数为一个人物对象，表示向该人物发起攻击。攻击时从技能数组中随机选择一项技能进行方法调用，调用需要满足技能接口的方法声明
    public void attack(Fighter fighter){
        System.out.println(fighter.name+"受到伤害"+hurt);
    }


    //方法接收一个数值作为受到伤害的数值，将会扣除血量值
    public void hurt(int hurt){
        this.hurt=hurt;
            this.hp-= hurt;
    }
    //受到眩晕伤害，增加眩晕值，眩晕值如果不为零则会跳过一个回合攻击
    public void vertigo(int rounds){
        if(rounds!=0){
            recover();
        }
    }
//从眩晕中恢复，眩晕值如果不为零则减一
    public void recover(){
           if(dizz!=0){
               dizz--;
           }
    }
}
