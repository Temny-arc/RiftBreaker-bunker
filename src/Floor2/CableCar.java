package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class CableCar implements Commander {

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
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        if (arg.equals("?")) {
            arg = help("?", map, text);
        }
        switch (arg) {
            case "0":
                System.out.println(text.get("cablecar_item0a"));
                if (map.get(101) == 0) {
                    map.put(1, 1);
                }
                map.put(101, 1);
                return map;
            case "1":
                System.out.println(text.get("enterance_item1a"));
                if (map.get(102) == 0) {
                    map.put(1, 1);
                }
                map.put(102, 1);
                return map;
            case "2":
                System.out.println(text.get("enterance_item2a"));
                if (map.get(103) == 0) {
                    map.put(1, 1);
                }
                map.put(103, 1);
                return map;
        }
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
