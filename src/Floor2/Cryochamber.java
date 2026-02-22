package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.decode;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cryochamber implements Commander {


    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("lab")){
            map.replace(0,14);
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
        Scanner sc = new Scanner(System.in);
        switch (arg) {
            case "0":
                System.out.println(text.get("cryochamber_item0a+"));
                if (map.get(13)!=0){
                    System.out.println(text.get("cryochamber_item0a-"));
                }
                decode d = new decode();
                d.puzzle("12344");// the ultimate passcode
                System.out.println(text.get("cryochamber_item0a++"));
                if (map.get(131) == 0) {
                    map.put(1, 1);
                }
                map.put(131, 1);
                return map;
            case "1":
                System.out.println(text.get("cryochamber_item1a"));
                if (map.get(132) == 0) {
                    map.put(1, 1);
                }
                map.put(132, 1);
                return map;
            case "2":
                System.out.println(text.get("cryochamber_item2a"));
                if (map.get(133) == 0) {
                    map.put(1, 1);
                }
                map.put(133, 1);
                return map;
            case "3":
                System.out.println(text.get("cryochamber_item3a"));
                arg = sc.next();
                if (map.get(134) == 0) {
                    map.put(1, 1);
                }
                if (arg.equals("1")) {
                    System.out.println(text.get("cryochamber_item1+"));
                    System.out.println(text.get("cryochamber_item1++"));
                    System.out.println(text.get("cryochamber_item1+++"));
                    System.out.println(text.get("cryochamber_item1++++"));
                    map.put(134, 2);
                } else {
                    map.put(134, 1);
                }
                return map;
            case "4":
                System.out.println(text.get("cryochamber_item4a"));
                if (map.get(135) == 0) {
                    map.put(1, 1);
                }
                map.put(135, 1);
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
            System.out.println(text.get("cryochamber_item0?"));
            System.out.println(text.get("cryochamber_item1?"));
            System.out.println(text.get("cryochamber_item2?"));
            System.out.println(text.get("cryochamber_item3?"));
            System.out.println(text.get("cryochamber_item4?"));
            return sc.nextLine();
        }
        return arg;
    }
}
