package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        if (arg.equals("?")) { // if you only wrote search
            arg = help("?", map, text); // calls for additional info that will be loaded
        }
        Scanner sc = new Scanner(System.in);
        switch (arg) {
            case "0":
                System.out.println(text.get("manufactory_item0a"));
                if (map.get(161) == 0) {
                    map.put(1, 1);
                }
                map.put(161, 1);
                return map;
            case "1":
                System.out.println(text.get("manufactory_item1a"));
                arg = sc.next();

                map.put(1, 1);

                if (arg.equals("1")) { // this is for the data bus because there is too much text
                    //TODO triggering
                    System.out.println(text.get("manufactory_item1+?"));
                    System.out.println(text.get("manufactory_item1++?"));
                    System.out.println(text.get("manufactory_item1+-?"));
                    System.out.println(text.get("manufactory_item1+++?"));
                    map.put(162, 2);
                }
                map.put(162, 1);
                return map;
            case "2":
                System.out.println(text.get("manufactory_item2a"));
                if (map.get(163) == 0) {
                    map.put(1, 1);
                }
                map.put(163, 1);
                return map;
            case "3":
                System.out.println(text.get("manufactory_item3a"));
                System.out.println(text.get("manufactory_item3a+"));

                if (map.get(163) == 0) {
                    map.put(1, 1);
                }
                map.put(163, 1);
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
