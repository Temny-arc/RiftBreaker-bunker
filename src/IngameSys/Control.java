package IngameSys;
import Floor1.*;
import Floor2.*;
import com.google.gson.Gson;
import com.sun.tools.javac.Main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Control {
    public HashMap<Integer, Integer> data= new HashMap<>();
    public HashMap<String, Commander> trigger= new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private int turn;
    private boolean exit;
    private Player player;

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

        //TODO  vytvor commandy
    }
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
                return "H";


        }








    }
    public void executor(){
        //TODO volani commandu
        System.out.print(">>");
        String prikaz = scanner.next();
        prikaz = prikaz.trim().toLowerCase();

    }
    public String director(){
        //TODO spojeni se vsim
        return null;
    }
    public void save(){
        //TODO dat data z mapy do souboru
    }





}
