package IngameSys;

import java.util.Scanner;

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

    /**
     *  Inner function that upgrades yours stats its simple
     */
    public void lvlup(){

        System.out.println("Level up, now you can increase your stats it, remind that the stats are strength agility and intelligence");
        Scanner sc = new Scanner(System.in);
        String s = "";
        for (int i = 0; i < 3; i++) {
            System.out.print("you can upgrade bit more by writing str or 0 for strength"+"\n"+ "agi or 1 for agility or"+"\n"+ "or int or 2 for intelligence");
            s = sc.nextLine();
            if (s.equals("str")||s.equals("0")) {
                buffstr();
            }
            else if (s.equals("agi")||s.equals("1")) {
                buffagi();
            }
            else if (s.equals("int")||s.equals("2")) {
                buffknow();
            } else {
                this.xp += 3; // this is for someone who not choose any of them
            }

        }



    }









}
