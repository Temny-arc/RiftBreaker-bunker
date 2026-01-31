package Floor1;

import IngameSys.Commander;

import java.util.HashMap;

public class Hallway implements Commander {

    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (map.get(0)== 0) {
            if (arg.equals("bedroom")) {
                map.replace(0, 2);
            }
            if (arg.equals("enterance")) {
                map.replace(0, 1);
            }
            if (arg.equals("TechRoom")) {
                map.replace(0, 5);
            }
            if (arg.equals("bedroom")) {
                map.replace(0, 7);
            }
        } else {
            if (arg.equals("cableoperator")){
                map.replace(0,9);
            }
            if (arg.equals("cableroom")){
                map.replace(0,10);
            }
            if (arg.equals("controlroom")){
                map.replace(0,11);
            }
            if (arg.equals("cryochamber")){
                map.replace(0,12);
            }
            if (arg.equals("manufactory")){
                map.replace(0,15);
            }
        }










        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        //TODO talk to a women
        return map;
    }

    @Override
    public int search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        //TODO if there is something from event allow triggering
        return 0;
    }

    @Override
    public int invent(String arg) {
        //TODO this is just heal
        return 0;
    }

    @Override
    public int help(String arg) {
        //TODO info player to move
        return 0;
    }
}
