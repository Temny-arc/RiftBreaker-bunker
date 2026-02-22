package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExperimentalLab implements Commander {
    //TODO exactly same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("cableroom")){
            map.replace(0,10);
        } else if (arg.equals("manufactory")){
            map.replace(0,15);
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
                System.out.println(text.get("experimentallab_item0a"));
                if (map.get(141) == 0) {
                    map.put(1, 1);
                }
                map.put(141, 1);
                return map;
            case "1":
                System.out.println(text.get("experimentallab_item3a"));
                if (map.get(142) == 0) {
                    map.put(1, 1);
                }
                map.put(23, 1);
                return map;

            case "2":
                System.out.println(text.get("experimentallab_item2a"));
                if (map.get(141) == 0) {
                    map.put(1, 1);
                }
                map.put(143, 1);
                return map;
            case "3":
                System.out.println(text.get("experimentallab_item1a"));
                arg = sc.next();
                if (map.get(144) == 0) {
                    map.put(1, 1);
                }
                if (arg.equals("1")) { // this is for the data bus because there is too much text
                    System.out.println(text.get("experimentallab_item1+"));
                    System.out.println(text.get("experimentallab_item1++"));
                    System.out.println(text.get("experimentallab_item1+++"));
                    System.out.println(text.get("experimentallab_item1++++"));
                    map.put(144,2);
                }
                map.put(144, 1);
                return map;
            case "4":
                System.out.println(text.get("experimentallab_item3a"));
                if (map.get(144) == 0) {
                    map.put(1, 1);
                }
                map.put(1444, 1);
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
        Scanner sc = new Scanner(System.in);
        if (arg.equals("?")){
            System.out.println(text.get("experimentallab_item0?"));
            System.out.println(text.get("experimentallab_item1?"));
            System.out.println(text.get("experimentallab_item2?"));
            System.out.println(text.get("experimentallab_item3?"));
            System.out.println(text.get("experimentallab_item4?"));
            return sc.nextLine();
        }
        return arg;
    }
}
