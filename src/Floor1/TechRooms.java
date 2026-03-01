package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TechRooms implements Commander {
    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {
            if (map.get(60)!= 0){
                Scanner sc = new Scanner(System.in);
                System.out.println("which room you want to go to");
                arg = sc.nextLine();
                if (arg.equals("0")){
                    map.replace(0, 5);
                } else {
                    map.replace(0, 6);
                }

            } else {

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


        if (map.get(0)== 5){ //
            switch (arg) {
                case "0":
                    System.out.println(text.get("techrooma_item0a"));
                    if (map.get(71) == 0) {
                        map.put(1, 1);
                    }
                    map.put(71, 1);
                    return map;
                case "1":
                    System.out.println(text.get("techrooma_item1a"));
                    if (map.get(72) == 0) {
                        map.put(1, 1);
                    }
                    map.put(72, 1);
                    return map;
                case "2":
                    System.out.println(text.get("techrooma_item2a"));
                    if (map.get(23) == 0) {
                        map.put(1, 1);
                    }
                    map.put(73, 1);
                    return map;
                case "3":
                    System.out.println(text.get("techrooma_item3a"));
                    if (map.get(74) == 0) {
                        map.put(1, 1);
                    }
                    map.put(74, 1);
                    return map;

            }
        }else {
            System.out.println(text.get("techrooma_item0a"));
            if (map.get(81) == 0) {
                map.put(1, 1);
            }
            map.put(81, 1);
            return map;
            //todo add more data to the tech room b
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
            if (data.get(0)== 5) {
                System.out.println(text.get("techrooma_item0?"));
                System.out.println(text.get("techrooma_item1?"));
                System.out.println(text.get("techrooma_item2?"));
                System.out.println(text.get("techrooma_item3?"));
                return sc.nextLine();
            } else if (data.get(60)!= 0) {
                System.out.println(text.get("techroomb_item0?"));
            }
        }
        return arg;

    }
}
