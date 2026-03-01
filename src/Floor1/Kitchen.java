package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Kitchen implements Commander {
    //TODO exact same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("hallway")) {
            map.replace(0, 0);
            System.out.println("You have entered to the hallway");
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
        Scanner sc = new Scanner(System.in);
        switch (arg) {
            case "0":
                System.out.println(text.get("kitchen_item0a"));
                if (map.get(51) == 0) {
                    map.put(1, 1);
                }
                map.put(51, 1);
                return map;
            case "1":
                System.out.println(text.get("kitchen_item1a"));
                if (map.get(52) == 0) {
                    map.put(1, 1);
                }
                map.put(6, 1);
                map.put(52, 1);
                return map;
            case "2":
                System.out.println(text.get("kitchen_item2a"));
                if (map.get(53) == 0) {
                    map.put(1, 1);
                }
                map.put(53, 1);
                return map;
            case "3":
                System.out.println(text.get("kitchen_item3a"));
                if (map.get(54) == 0) {
                    map.put(1, 1);
                }
                arg = sc.next();
                if (arg.equals("1")) { // this is for the data bus because there is too much text
                    System.out.println(text.get("bedroom_item1+"));
                    System.out.println(text.get("bedroom_item1++"));
                    System.out.println(text.get("bedroom_item1+++"));
                    System.out.println(text.get("bedroom_item1++++"));
                    map.put(54,2);
                }
                map.put(54, 1);
                return map;
            case "4":
                System.out.println(text.get("kitchen_item3a"));
                if (map.get(55) == 0) {
                    map.put(1, 1);
                }
                map.put(55, 1);
                return map;
            case "5":
                System.out.println(text.get("kitchen_item4a"));
                System.out.println(text.get("kitchen_item4a+"));
                if (map.get(56) == 0) {
                    map.put(1, 1);
                }
                map.put(56, 1);
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
            System.out.println(text.get("kitchen_item0?"));
            System.out.println(text.get("kitchen_item1?"));
            System.out.println(text.get("kitchen_item2?"));
            System.out.println(text.get("kitchen_item3?"));
            System.out.println(text.get("kitchen_item4?"));
            return sc.nextLine();
        }
        return arg;
    }
}
