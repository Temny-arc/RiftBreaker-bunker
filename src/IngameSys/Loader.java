package IngameSys;

import IngameSys.loadmode.GameCharacter;
import IngameSys.loadmode.Item;
import IngameSys.loadmode.Roomdata;
import IngameSys.loadmode.Weapon;
import com.google.gson.Gson;
import com.sun.tools.javac.Main;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;


public class Loader {

    public ArrayList<Item> items;
    public ArrayList<GameCharacter> chara;
    public ArrayList<Weapon> weapons;
    public HashMap<String, String> dialog;


    public Loader() {
        this.items = new ArrayList<>();
        this.chara = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.dialog = new HashMap<>();
    }

    /**
     *
     * @param resourcePath what file you want to read in (its always the same one)
     * @return Active object for loading
     */

    public static Loader load(String resourcePath){
        //TODO nacist data ze souboru do hashmapy data
        /*
        Z urcitych technickych duvodu nacitane pres JSON nefunguje tim ze nevim jak to k****** opravit(neco jsem i zkousel) tak to udelame postaru coz mi pripada spatne az smutne ale je to nutne zlo
        Gson gson = new Gson();

        //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
        try (InputStream is = Loader.class.getResourceAsStream(resourcePath)) {

            //Zde ověřujeme, zdali soubor existuje
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

            //Přečte celý JSON a vytvoří instanci GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída GameData
            return gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    Loader.class
            );

        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }

        */
        try {
            BufferedReader br = new BufferedReader(new FileReader(resourcePath));
            Loader loader = new Loader();


            String s = br.readLine();// read line in order to use it
            while (!s.equals("switch")){ // this is for separation of systems
                String b[] = s.split(";");
                loader.items.add(new Item(b[0],b[1],b[2],b[3]));//fills the items with the data from file
                System.out.println(b[0]+" item");
                s = br.readLine();
            }
            s = br.readLine();
            while (!s.equals("switch")){
                String b[] = s.split(";");
                loader.chara.add(new GameCharacter(b[0],b[1],b[2],b[3],b[4]));
                System.out.println(b[0]+" character");
                s = br.readLine();
            }
            s = br.readLine();
            while (!s.equals("switch")){
                String b[] = s.split(";");
                System.out.println(b[0]+b[2]);

                loader.weapons.add(new Weapon(b[0],b[1],Integer.parseInt(b[2]),b[3],b[4]));
                s = br.readLine();
            }
            s = br.readLine();

            while (s != null){
                String b[] = s.split(";");
                System.out.println(b[0]+" key");
                loader.dialog.put(b[0],b[1]);
                s = br.readLine();
            }











        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;




    }
}
