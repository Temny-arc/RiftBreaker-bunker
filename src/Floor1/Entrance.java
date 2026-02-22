package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Entrance implements Commander {
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        map.replace(0,0);
        System.out.println("moving to hallway");
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
                System.out.println(text.get("enterance_item0a"));
                if (map.get(31) == 0) {
                    map.put(1, 1);
                }
                map.put(31, 1);
                return map;
            case "1":
                System.out.println(text.get("enterance_item1a"));
                if (map.get(32) == 0) {
                    map.put(1, 1);
                }
                map.put(32, 1);
                return map;
            case "2":
                System.out.println(text.get("enterance_item2a"));
                if (map.get(33) == 0) {
                    map.put(1, 1);
                }
                map.put(33, 1);
                return map;
            case "3":
                System.out.println(text.get("enterance_item3a"));
                if (map.get(34) == 0) {
                    map.put(1, 1);
                }
                map.put(34, 1);
                return map;
            case "4":
                System.out.println(text.get("enterance_item4a"));
                if (map.get(35) == 0) {
                    map.put(1, 1);
                }
                map.put(35, 1);
                return map;
            case "5":
                System.out.println(text.get("enterance_item5a"));
                if (map.get(36) == 0) {
                    map.put(1, 1);
                }
                map.put(36, 1);
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
            System.out.println(text.get("enterance_item0?"));
            System.out.println(text.get("enterance_item1?"));
            System.out.println(text.get("enterance_item2?"));
            System.out.println(text.get("enterance_item3?"));
            System.out.println(text.get("enterance_item4?"));
            System.out.println(text.get("enterance_item5?"));
            return sc.nextLine();
        }
        return arg;
    }


// pruzkum, pruzkum 0 , pruzkum <vec>







}
