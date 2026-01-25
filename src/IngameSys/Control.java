package IngameSys;
import com.google.gson.Gson;
import com.sun.tools.javac.Main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class Control {
    public HashMap<Integer, Integer> data= new HashMap<>();
    public HashMap<String, Commander> trigger= new HashMap<>();
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
        Control c = new Control();
        data.put(0,0);
        //TODO  vytvor commandy
    }
    public void executor(){
        //TODO volani commandu
    }
    public String director(){
        //TODO spojeni se vsim
        return null;
    }
    public void save(){
        //TODO dat data z mapy do souboru
    }





}
