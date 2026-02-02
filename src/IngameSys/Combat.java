package IngameSys;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class Combat {

    public boolean fight(int aginst,Player p){
        //TODO nacist oba soupere pote bitva
        double hp = p.getStr() *3;
        double defence = (p.getAgi()+10)/10;// reduces dmg to player
        double crit = 100 - p.getKnow(); // for random
        EnemyCreator e = new EnemyCreator();
        EnemyCreator combater = e.create(aginst); // gets enemy from pool of enemies
        Random rd = new Random();
        int c = 0;
        System.out.println("Combat is as always directed you can pick between head = 0, chest = 1,arms = 2 and legs = 3");
        while  (hp > 0&&combater.getHp() > 0 ){
            Scanner sc = new Scanner(System.in);
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
            if (e.getDmgtype()> 1){
                hp = hp -e.getDmgtype();//magic dmg
            } else if (e.getDmgtype() == 0) {
                hp = hp -(e.getDmgtype()/defence)-1;
            } else {
                hp = hp -(e.getDmgtype()/defence);
            }
            System.out.println(hp+ " you " + combater.getHp() + " enemy");
        }
        if (hp >0){
            return true;// game continues
        } else {
            return false;// worst ending
        }







    }

}
