package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class Stairs implements Commander {
    //TODO this room will work like hallway
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {

        if (true){
            //TODO logic
            map.replace(0,0);// for the first floor


        }
        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        /*
        switch (arg) {
            case "0":
                System.out.println("_item0a");
                if (map.get(61) == 0) {
                    map.put(1, 1);
                }
                map.put(21, 1);
                return map;
            case "1":
                System.out.println("enterance_item1a");
                if (map.get(22) == 0) {
                    map.put(1, 1);
                }
                map.put(22, 1);
                return map;
            case "2":
                System.out.println("enterance_item2a");
                if (map.get(23) == 0) {
                    map.put(1, 1);
                }
                map.put(23, 1);
                return map;


        }

         */
        System.out.println();
        return map;
    }

    @Override
    public int invent(Loader li) {
        ArrayList<Item> n = li.getItems();
        ArrayList<Weapon> m = li.getWeapons();
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        }
        return 0;
    }

    @Override
    public String help(String arg, HashMap<Integer, Integer> data, HashMap<String, String> text) {
        return arg;
    }
}
