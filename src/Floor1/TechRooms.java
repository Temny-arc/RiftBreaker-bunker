package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class TechRooms implements Commander {
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        //TODO here player needs to decide which one he wants to visit, he can also move directly to second tech room

            map.replace(0, 0);

        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        //TODO there are no data for this room yet



        if (map.get(1)== 60){ //
            switch (arg) {
                case "0":
                    System.out.println(text.get("techrooma_item0a"));
                    if (map.get(71) == 0) {
                        map.put(1, 1);
                    }
                    map.put(71, 1);
                    return map;
                case "1":
                    System.out.println(text.get("techrooma_item1a"));
                    if (map.get(72) == 0) {
                        map.put(1, 1);
                    }
                    map.put(72, 1);
                    return map;
                case "2":
                    System.out.println(text.get("techrooma_item2a"));
                    if (map.get(23) == 0) {
                        map.put(1, 1);
                    }
                    map.put(73, 1);
                    return map;
                case "3":
                    System.out.println(text.get("techrooma_item3a"));
                    if (map.get(74) == 0) {
                        map.put(1, 1);
                    }
                    map.put(74, 1);
                    return map;

            }
        }else {
            System.out.println(text.get("techrooma_item1a"));
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
