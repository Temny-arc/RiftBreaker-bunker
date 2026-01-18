package IngameSys;

import java.util.HashMap;

public class Control {
    public HashMap<Integer, Integer> data= new HashMap<>();
    public HashMap<String, Commander> trigger= new HashMap<>();
    private int turn;
    private boolean exit;
    private Player player;

    public Control() {
    }



    public void comando(){
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
    public void load(){
        //TODO nacist data ze souboru do hashmapy data
    }



}
