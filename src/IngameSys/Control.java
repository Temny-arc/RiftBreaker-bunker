package IngameSys;
import Floor1.*;
import Floor2.*;

import java.util.HashMap;
import java.util.Scanner;

public class Control {
    public HashMap<Integer, Integer> data= new HashMap<>();
    public HashMap<String, Commander> trigger= new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private int turn;
    private boolean exit;
    private Player player;
    private Loader l;// no this is not L from death note
    private HashMap<String,String> bliz; //direct data for dialog search

    public Control() {
    }


    public HashMap<Integer, Integer> getData() {
        return data;
    }

    public void setData(HashMap<Integer, Integer> data) {
        this.data = data;
    }

    public HashMap<String, Commander> getTrigger() {
        return trigger;
    }

    public void setTrigger(HashMap<String, Commander> trigger) {
        this.trigger = trigger;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * due this being long it have specific method
     */
    public void comando(){
        trigger.put("A",new Entrance());
        trigger.put("B",new Hallway());
        trigger.put("C",new BedRoom());
        trigger.put("D",new BathRoom());
        trigger.put("E",new Kitchen());
        trigger.put("F",new Stairs());
        trigger.put("G",new TechRooms());
        trigger.put("H",new CableCar());
        trigger.put("I",new CableOperator());
        trigger.put("J",new ContolRoom());
        trigger.put("K",new Cryochamber());
        trigger.put("O",new ExperimentalLab());
        trigger.put("P",new Laboratory());
        trigger.put("Q",new Manufactory());


    }

    /**
     * reason this issue exist is me being idiot and not having proper coding but It's something its a decoder that decodes where player is
     * @param cel is data from hash map as a symbol whitch location you are at
     * @return key to specific room
     */
    public String decider(int cel){
        switch(cel){
            case 0:
                return "B";
            case 1, 8:
                return "A";
            case 2:
                return "C";
            case 3:
                return "D";
            case 4:
                return "E";
            case 5, 6:
                return "G";
            case 7:
                return "F";
            case 9:
                return "I";
            case 10:
                return "H";
            case 11:
                return "J";
            case 12:
                return "I";
            case 13:
                return "O";
            case 14:
                return "P";
            case 15:
                return "Q";

        }


        return "A";





    }

    /**
     * executor will load data from user and execute one operation in chosen room (this is basically a hybrid between strategy and command)
     */
    public boolean executor(){
        System.out.print(">> ");
        String prikaz = scanner.nextLine();

        prikaz = prikaz.toLowerCase();
        decode d  =new decode();
        String[] s = d.decod(prikaz);
        System.out.println(s[0]+" s0 "+ s[1]+" s1");
        switch (s[0]){
            case "move":
                trigger.get(decider(data.get(0))) // decide which room will be working
                        .move(s[1], data);// now does trigger the command in specific room
                return true;
            case  "dialog":
                trigger.get(decider(data.get(0))).dialog(s[1], data); // this is just smaller version
                return true;
            case "search":
                trigger.get(decider(data.get(0))).search(s[1],data,bliz); // this is just smaller version
                return true;
            case "inventory":
                trigger.get(decider(data.get(0))).invent(l); // this is just smaller version
                return true;
            case "help":
                trigger.get(decider(data.get(0))).help(s[1],data,bliz); // this is just smaller version
                return true;
        }
        return false;

    }

    /**
     * Base for the program handles most items and makes sure it works
      * @return just to end the game like it will not return anything
     */
    public String director(){
        for (int i = 0; i < 200; i++) {
            data.put(i, 0);
        }
        comando();// map activation
        l = Loader.load("res/moredata.txt");
        data.put(5,-1); // room where you are in
        data.put(7,-1); // cost of action
        data.put(3,15);
        exit = true;
        int c = 0;
        turn = 0;
        try { // this is basic version it will be updated but due to the program still not having everything we are still by this
            while (turn < 40) {// counter for turns works as main cycle
                if (!exit||turn > data.get(3)) {
                    if (turn > data.get(3)) {
                        System.out.println(bliz.get("ending_bad:"));
                        System.out.println(bliz.get("ending_bad+"));
                        return null;
                    } else {
                        System.out.println(bliz.get("ending_bitter:"));
                        System.out.println(bliz.get("ending_bitter+"));
                        return null;
                    }
                }
                while (c < 4) { // defines the players turn
                    executor();
                    c = c + data.get(1);// consumed action? also how many

                    backturn();

                }
                // expect this to be upgraded so not now
                //enemyturn();

                c = 0;
                turn++;// It's just a for i but bit "enhanced"
            }







        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            throw new RuntimeException(e);

        }














        return null;
    }
    public void save(){

    }

    public void enemyturn(){

    }

    /**
     * this new thing is doing some insystem stuff like combat or items
     *
     */
    public void backturn(){

        Combat comat = new Combat();

        if (data.get(5)>0){ // combat trigger
            exit = comat.fight(data.get(5),player,l.getWeapons());
            data.put(5,-1);
        }
        if (data.get(6)>0){ // easy weapon getter tho we will still need a special version for the katana
            l.getWeapons().get(data.get(6)).Obtain();
            data.put(6,-1);
        }
        if (data.get(7)>0){ // easy weapon getter tho we will still need a special version for the katana
            l.getItems().get(data.get(7)).Obtain();
            data.put(7,-1);
        }
        turn = turn + data.get(2);

    }




}
