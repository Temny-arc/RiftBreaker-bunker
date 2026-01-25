package IngameSys.loadmode;

public class Weapon {
    private String id;
    private String name;
    private int dmg;
    private String dmgtype;
    private String note;


    public Weapon(String id, String name, int dmg, String dmgtype, String note) {
        this.id = id;
        this.name = name;
        this.dmg = dmg;
        this.dmgtype = dmgtype;
        this.note = note;
    }
}
