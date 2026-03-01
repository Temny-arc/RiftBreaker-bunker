package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hallway implements Commander {

    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
        if (map.get(0)== 0) {
            if (arg.equals("bedroom")) {
                map.replace(0, 2);
                System.out.println("You have entered to bedroom");
            }
            if (arg.equals("entrance")) {
                map.replace(0, 1);
                System.out.println("You have entered to entrance");
            }
            if (arg.equals("techroom")) {
                map.replace(0, 5);
                System.out.println("You have entered to techroom");
            }
            if (arg.equals("stairs")) {
                map.replace(0, 7);
                System.out.println("You have entered to stairs");
            }
        } else {
            if (arg.equals("stairs")) {
                map.replace(0, 7);
                System.out.println("You have entered to stairs");
            }
            if (arg.equals("cableoperator")){
                map.replace(0,9);
                System.out.println("You have entered to cable operator");
            }
            if (arg.equals("cableroom")){
                map.replace(0,10);
                System.out.println("You have entered to room with Cable car");
            }
            if (arg.equals("controlroom")){
                map.replace(0,11);
                System.out.println("You have entered to control room");
            }
            if (arg.equals("cryochamber")){
                map.replace(0,12);
                System.out.println("You have entered to cryochamber");
            }
            if (arg.equals("manufacture")){
                map.replace(0,15);
                System.out.println("You have entered to manufacture");
            }
        }

        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        //TODO talk to a women
        return map;
    }

    @Override
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        if (arg.equals("?")) {
            arg = help("?", map, text);
        }
        switch (arg) {
            case "0":
                System.out.println(text.get("hallway_item0a"));
                if (map.get(41) == 0) {
                    map.put(1, 1);
                }
                return map;
            case "1":
                if (map.get(8) == 1) {// safety trigger
                    System.out.println(text.get("hallway_item1a"));
                    System.out.println(text.get("hallway_item1a+"));
                    System.out.println(text.get("hallway_item1a+-"));
                    System.out.println(text.get("hallway_item1a+++"));
                    System.out.println(text.get("hallway_item1a++-"));
                    System.out.println(text.get("hallway_item1a++++"));

                    map.put(2, 40);// trigger the end
                    map.put(1, 4); // for the second cycle
                    map.put(42, 1); // time to party like its 2023
                    return map;
                }
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
        if (arg.equals("?")&data.get(0)==0){// ground floor
            System.out.println(text.get("hallway_item0?"));
            if (data.get(8)==1){// time to party?
                System.out.println(text.get("hallway_item1?"));
            }
            return sc.nextLine();
        }
        return arg;
    }
}
