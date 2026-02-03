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

    public EnemyCreator() {
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

        this.hp = hp - num;
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

    public EnemyCreator create(int what){
        switch(what){
            case 0:
                return new EnemyCreator("Frosty",6.0,1,0);
            case 1:
                return new EnemyCreator("Snowman",8.0,1,0);
            case 2:
                return new EnemyCreator("HalfMelted",4.0,3,0);
            case 3:
                return new EnemyCreator("Frost Baller",16.0,8,1);
            case 4:
                return new EnemyCreator("Frost Hunter",25.0,6,1);
            case 5:
                return new EnemyCreator("Frost Necromancer",15.0,15,2);
            case 6:
                return new EnemyCreator("Frost Ravager",60.0,10,0);
            case 7:
                return new EnemyCreator("Crying Angel",32.0,6,2);
            case 8:
                return new EnemyCreator("Frost Psycho",10.0,30,0);
            case 9:
                return new EnemyCreator("Frost Revenant",120.0,30,0);




        }






        return new EnemyCreator("BelowNatural",3200.0,50,2);
    }
}
