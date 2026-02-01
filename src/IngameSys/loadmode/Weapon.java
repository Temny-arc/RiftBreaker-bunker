package IngameSys.loadmode;

public class Weapon {
    private String id;
    private String name;
    private int dmg;
    private String dmgtype;
    private String note;
    private boolean obtained;

    public Weapon(String id, String name, int dmg, String dmgtype, String note) {
        this.id = id;
        this.name = name;
        this.dmg = dmg;
        this.dmgtype = dmgtype;
        this.note = note;
        this.obtained = false;
    }
    public boolean isObtained() {
        return obtained;
    }
    public void Obtain() { // all documentation is same as item the split is just for combat use
        this.obtained = true;
    }
    public void deObtain() {
        this.obtained = false;
    }
}
