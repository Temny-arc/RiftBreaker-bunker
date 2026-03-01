package IngameSys;

import IngameSys.loadmode.Weapon;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Combat {

    /**
     * Combat is basic function it works based on target area some are consistent but other does nothing
      * @param aginst game asks for a number of foe, then is called specific method in enemy creator to get your opponent
     * @param p player have stats that upgrade his combat performance offering a strategy
     * @param w in the start player will choose one of the weapons he can in order to fight
     * @return info about the fight to let game continue or end it
     */
    public boolean fight(int aginst, Player p, ArrayList<Weapon> w){
        Scanner sc = new Scanner(System.in);
        EnemyCreator e = new EnemyCreator();
        int  wdmg = 0; // weapon damage
        EnemyCreator combater = e.create(aginst); // gets enemy from pool of enemies
        Random rd = new Random();// for the enemy
        int c = 0;// counter for now then it will do something else
        ArrayList<Weapon> actual = new ArrayList<>();
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i).isObtained()){// this is to add items you can into selection
                actual.add(w.get(i));
                System.out.println(w.get(i)+" for this weapon write:"+c);
                c++;
            }
        }
        try {
            int d = sc.nextInt();// this can cause errors so
            wdmg =  actual.get(d).getDmg();// this can also result in error

        } catch (Exception ex) {
            System.out.println("wrong input -> you will fight barehanded have fun");
        }

        c=0;// now it will serve as basically  dmg
        //TODO nacist oba soupere pote bitva
        double hp = p.getStr() *3;
        double defence = (p.getAgi()+10)/10;// reduces dmg to player
        double crit = 100 - p.getKnow(); // for random


        System.out.println("Combat is as always directed you can pick between head = 0, chest = 1,arms = 2 and legs = 3");
        while  (hp > 0&&combater.getHp() > 0 ){

            String s = sc.nextLine();
            if (s.equals("head")||s.equals("0")) {
                 c =rd.nextInt(3)+3;
            }
            else if (s.equals("chest")||s.equals("1")) {
                 c =rd.nextInt(5)+2;
            }
            else if (s.equals("arms")||s.equals("2")) {
                 c = rd.nextInt(12);
            } else { // this is just a protective measure
                 c = rd.nextInt(2)+4;
            }
            if (rd.nextDouble(crit)<25){ // critical chance not ideal but its something
                c = c *2;
            }
            combater.reducehp(c); // if enemy dies it will still attack
            System.out.println(c + " your dmg");
            if (combater.getDmgtype()> 1){
                hp = hp -combater.getDmg();//magic dmg
            } else if (combater.getDmgtype() == 0) {
                System.out.println(combater.getDmg());
                hp = hp -(combater.getDmg()/defence)-1;
            } else {
                hp = hp -(combater.getDmg()/defence);
            }
            System.out.println(hp+ " you " + combater.getHp() + " enemy");
        }
        if (hp >0){
            return true;// game continues
        } else {
            return false;// worst ending
        }







    }

    public Combat() {
    }
}
