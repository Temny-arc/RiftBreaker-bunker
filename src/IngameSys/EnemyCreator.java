package IngameSys;

public class EnemyCreator {
    private String name;
    private double hp;
    private int dmg;
    private int dmgtype;


    public EnemyCreator(String name, double hp, int dmg, int dmgtype) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.dmgtype = dmgtype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setDmgtype(int dmgtype) {
        this.dmgtype = dmgtype;
    }
    public void reducehp(int num){
        this.hp -= num;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getDmgtype() {
        return dmgtype;
    }
}
