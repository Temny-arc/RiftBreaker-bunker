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
        String prikaz = scanner.next();
        prikaz = prikaz.trim().toLowerCase();
        decode d  =new decode();
        String[] s = d.decod(prikaz);
        switch (s[0]){
            case "move":
                trigger.get(decider(data.get(0))) // decide which room will be working
                        .move(s[1], data);// now does trigger the command in specific room
                return true;
            case  "dialog":
                trigger.get(decider(data.get(0))).dialog(s[1], data); // this is just smaller version
                return true;
            case "search":
                trigger.get(decider(data.get(0))).search(s[1],null,null); // this is just smaller version
                return true;
            case "inventory":
                trigger.get(decider(data.get(0))).invent(l); // this is just smaller version
                return true;
            case "help":
                trigger.get(decider(data.get(0))).help(s[1]); // this is just smaller version
                return true;
        }
        return false;

    }
    public String director(){
        //TODO spojeni se vsim
        comando();// map activation
        l = Loader.load("res/moredata.txt");

        data.put(0,1);
        data.put(1,1);
        int c = 0;
        turn = 0;
        try { // this is basic version it will be updated but due to the program still not having everything we are still by this
            while (turn < 40) { // counter for turns works as main cycle
                while (c < 4) { // defines the players turn
                    executor();
                    c = c + data.get(1);// consumed action? also how many
                    System.out.println(c);
                }
                // expect this to be upgraded so not now
                //enemyturn();


                turn--;// It's just a for i but bit "enhanced"
                break; // for now
            }




        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            throw new RuntimeException(e);

        }














        return null;
    }
    public void save(){
        //TODO dat data z mapy do souboru
    }

    public void enemyturn(HashMap<String,String> txtdata){

    }




}
