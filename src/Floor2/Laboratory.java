package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Laboratory implements Commander {
    //TODO exactly same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("cryochamber")){
            map.replace(0,12);
        } else if (arg.equals("controlroom")) {
            map.replace(0,11);
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
            arg = help("?", map, text); // calls for additional info that will be loaded
        }
        Scanner sc = new Scanner(System.in);
        switch (arg) {
            case "0":
                System.out.println(text.get("laboratory_item0a"));
                if (map.get(151) == 0) {
                    map.put(1, 1);
                }
                map.put(151, 1);
                return map;
            case "1":
                System.out.println(text.get("laboratory_item1a"));
                arg = sc.next();
                if (map.get(152) == 0) {
                    map.put(1, 1);
                }
                if (arg.equals("1")) { // this is for the data bus because there is too much text
                    System.out.println(text.get("laboratory_item1+"));
                    System.out.println(text.get("laboratory_item1++"));
                    System.out.println(text.get("laboratory_item1+++"));
                    System.out.println(text.get("laboratory_item1++++"));
                    System.out.println(text.get("laboratory_item1+++++"));
                    System.out.println(text.get("laboratory_item1++++++"));
                    map.put(152,2);
                }
                map.put(152, 1);
                return map;
            case "2":
                System.out.println(text.get("laboratory_item2a"));
                if (map.get(153) == 0) {
                    map.put(1, 1);
                }
                map.put(153, 1);
                return map;
            case "3":
                System.out.println(text.get("laboratory_item3a"));
                if (map.get(154) == 0) {
                    map.put(1, 1);
                }
                map.put(154, 1);
                return map;
            case "4":
                System.out.println(text.get("laboratory_item4a"));
                if (map.get(155) == 0) {
                    map.put(1, 1);
                }
                map.put(155, 1);
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
            System.out.println(text.get("laboratory_item0?"));
            System.out.println(text.get("laboratory_item1?"));
            System.out.println(text.get("laboratory_item2?"));
            System.out.println(text.get("laboratory_item3?"));
            System.out.println(text.get("laboratory_item4?"));
            return sc.nextLine();
        }
        return arg;
    }
}
