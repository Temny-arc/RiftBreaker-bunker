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
        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public int search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        Scanner sc = new Scanner(System.in);
        if (arg.equals("0")){
            System.out.println(text.get("enterance_item0?"));
            String s = sc.next();
            if (s.equals("0")){// selected outcome
                System.out.println(text.get("enterance_item0a"));
                map.replace(10,2); // get data that the area has been searched
            } else if (s.equals("1")){// second outcome
                System.out.println(text.get("enterance_item0?"));
                map.replace(10,1); // area has been searched but item was not taken
            } else {

            }
        }


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


// pruzkum, pruzkum 0 , pruzkum <vec>







}
