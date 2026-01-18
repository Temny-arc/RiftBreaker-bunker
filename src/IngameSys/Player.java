package IngameSys;

public class Player {
    private String name;
    private int xp;
    private int str;
    private int agi;
    private int know;

    public Player(String name, int xp, int str, int agi, int know) {
        this.name = name;
        this.xp = xp;
        this.str = str;
        this.agi = agi;
        this.know = know;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getKnow() {
        return know;
    }

    public void setKnow(int know) {
        this.know = know;
    }


    public void buffstr(){
        this.str += 1;
    }
    public void buffagi(){
        this.agi += 1;
    }
    public void buffknow(){
        this.know += 1;
    }

    public void lvlup(){
        // TODO lvl vylepsuje stat




    }









}
