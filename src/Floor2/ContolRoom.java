package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ContolRoom implements Commander {
    //TODO exactly same as before(Operation ice is nice)
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (arg.equals("Lab")){
            map.replace(0,14);
        } else if (arg.equals("hallway")){
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
                System.out.println(text.get("controlroom_item0a"));
                if (map.get(121) == 0) {
                    map.put(1, 1);
                }
                map.put(121, 1);
                return map;
            case "1":
                System.out.println(text.get("controlroom_item1a"));
                arg = sc.next();
                if (map.get(121) == 0) {
                    map.put(1, 1);
                }
                if (arg.equals("1")) { // this is for the data bus because there is too much text
                    System.out.println(text.get("controlroom_item2+"));
                    System.out.println(text.get("controlroom_item2++"));
                    System.out.println(text.get("bedroomroom_item2+++"));
                    System.out.println(text.get("bedroomroom_item2++++"));
                    System.out.println(text.get("bedroomroom_item2+++++"));
                    map.put(121,1);
                }
                return map;
            case "2":
                if (map.get(154) != 0) { // allow secret ending dont fear the reaper
                    System.out.println(text.get("controlroom_item3a-"));
                    map.put(8, 1); // have fun
                }
                System.out.println(text.get("controlroom_item3a+"));
                if (map.get(2)== 39 & map.get(131)!=0) { // trigger for secret ending
                    System.out.println(text.get("controlroom_item3a-+"));
                    map.put(6, 1); // now lets begin
                }
                //TODO complete game ending

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
