package Floor1;

import IngameSys.Commander;

import java.util.HashMap;

public class Kitchen implements Commander {
    //TODO exact same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        map.replace(0,0);
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
