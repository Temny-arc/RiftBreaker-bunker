package Floor2;

import IngameSys.Commander;

import java.util.HashMap;

public class Manufactory implements Commander {
    //TODO exactly same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("experimentallab")){
            map.replace(0,13);
        } else if (arg.equals("hallway")) {
            map.replace(0,8);
        }
        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public int search(String arg) {
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
