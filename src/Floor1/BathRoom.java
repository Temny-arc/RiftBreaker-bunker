package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class BathRoom implements Commander {

    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {


        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public int search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {




        return 0;
    }

    @Override
    public int invent(Loader li) {
         ArrayList<Item> n = li.getItems(); // yea and just a fun fact the items will be completely ignored like it will be better but we dont have still full placement in hashmap data so you guess it
         ArrayList<Weapon> m = li.getWeapons();
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        } // hahaha it will be more complex i promise but not now
        return 0;
    }

    @Override
    public int help(String arg) {
        return 0;
    }
}
