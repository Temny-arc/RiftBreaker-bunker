package Floor1;

import IngameSys.Commander;

import java.util.HashMap;

public class TechRooms implements Commander {
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        //TODO here player needs to decide which one he wants to visit, he can also move directly to second tech room
        map.replace(0,0);
        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public int search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        //TODO decider where you are right now
        return 0;
    }

    @Override
    public int invent(String arg) {
        return 0;
    }

    @Override
    public int help(String arg) {
        return 0;
    }
}
