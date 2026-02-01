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
    public int search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        return 0;
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
    public int help(String arg) {
        return 0;
    }
}
