package Floor1;

import IngameSys.Commander;
import IngameSys.Loader;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class BathRoom implements Commander {

    @Override
    public HashMap<Integer, Integer> move(String arg, HashMap<Integer, Integer> map) {


        return map;
    }

    @Override
    public HashMap<Integer, Integer> dialog(String arg, HashMap<Integer, Integer> map) {
        return map;
    }

    @Override
    public HashMap<Integer, Integer> search(String arg, HashMap<Integer, Integer> map, HashMap<String, String> text) {
        if (arg.equals("?")){ // if you only wrote search
            arg = help("?",map,text); // calls for additional info that will be loaded
        }
        switch (arg) {
            case "0":
                System.out.println(text.get("bathroom_item0a") );
                if (map.get(11)==0){
                    map.put(1,1);
                }
                map.put(11,1);
                return map;

            case "1":
                if (map.get(2)<6){ // If you are wondering what is this its a decider. you need to be in that room before some turn in order to save that guy
                    System.out.println(text.get("bathroom_item1+"));

                } else {
                    System.out.println(text.get("bathroom_item1-"));
                }
                map.put(5,2);// 5 is for combat number is symbol for enemy
                if (map.get(12)==0){
                    map.put(1,1);// first time in here ?
                }
                return map;
            case "2":
                System.out.println(text.get("bathroom_item2a"));
                if (map.get(13)==0){
                    map.put(1,1);
                }
                map.put(13,1);
                return map;
        }


        return map;
    }

    @Override
    public int invent(Loader li) {
         ArrayList<Item> n = li.getItems(); // yea and just a fun fact the items will be completely ignored like it will be better but we dont have still full placement in hashmap data so you guess it
         ArrayList<Weapon> m = li.getWeapons();
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        } // hahaha it will be more complex i promise but not now
        return 0;
    }

    @Override
    public String help(String arg, HashMap<Integer, Integer> data, HashMap<String, String> text) {
        if (arg.equals("?")){
            System.out.println(text.get("bathroom_item0?"));
            System.out.println(text.get("bathroom_item1?"));
            System.out.println(text.get("bathroom_item2?"));
        }

        return arg;
    }
}
