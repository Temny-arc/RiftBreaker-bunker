package Floor2;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CableOperator implements Commander {
    //TODO exactly same as before
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        map.replace(0,8);
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
                System.out.println(text.get("kitchen_item1a"));
                if (map.get(52) == 0) {
                    map.put(1, 1);
                }
                map.put(52, 1);
                return map;
            case "1":
                System.out.println(text.get("cableoperator_item0a"));

                    map.put(1, 1);



                    System.out.println(text.get("cableoperator_item1+"));
                    System.out.println(text.get("cableoperator_item1++"));
                    System.out.println(text.get("cableoperator_item1+++"));
                    System.out.println(text.get("cableoperator_item1++++"));


                    map.put(111, 1);

                return map;
                /* its for a reason the map dont have more data now
            case "1":
                System.out.println(text.get("enterance_item1a"));
                if (map.get(22) == 0) {
                    map.put(1, 1);
                }
                map.put(22, 1);
                return map;
            case "2":
                System.out.println(text.get("enterance_item2a"));
                if (map.get(23) == 0) {
                    map.put(1, 1);
                }
                map.put(23, 1);
                return map;

                 */
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
        if (arg.equals("?")) {
            System.out.println(text.get("enterance_item0?"));
            System.out.println(text.get("enterance_item1?"));
            arg = sc.nextLine();
        }
        return arg;
    }
}
