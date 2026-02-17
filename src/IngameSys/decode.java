package IngameSys;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class decode {
    /**
     * detector for input so player dont have to do everything on his own
     * @param txt input data that will be decoded it will be done by using regex
     * @return object of 2 data what command to select and what to put into argument it also can automaticaly ask for help
     */
    public String[] decod(String txt){
        //TODO decode incoming text and return it class issue is when you get an item so this will be fun
        if (txt.matches("[a-z]+[ ][a-z]+")){
         // this is basicaly how it will work
            String[] words = txt.split(" ");
            System.out.println(words[0]+"decoder");
            return words;
        }
        if (txt.matches("[a-z]+[ ][0-9]+")){
            String[] words = txt.split(" ");
            System.out.println(words[0]+"decoder");
            return words;

        }
        String[] wor = new String[2];
        wor[0] = "help";
        wor[1] = "?";
        return wor;// the help trigger
    }

    /**
     * This method does put player into the ingame puzzle, player have to complete the puzzle in order to continue
     * it will return * and + based on the input,  * means that number is in correct position and + means the number is there but in wrong place
     * @param passcode numbers basically 12345, its the thing player have to find out the answer
     */
    public void puzzle(String passcode){
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>(); // this dude is for the +
        ArrayList<Character> d = new ArrayList<>();
        String print = "";//this is output for player
        int c = passcode.length(); // we will need this value more times in here
        int more = 0;
        for (int i = 0; i < c; i++){
            a.add(passcode.charAt(i));
            b.add((char) 0);
            d.add(passcode.charAt(i));

        }
        System.out.println("Passcode inputs are 1,2,3,4 and 5 you need to find the correct answer if you want to move on");
        Scanner sc = new Scanner(System.in);
        String bel = ""; // it reads the input data
         // set d as a for the future
        if (passcode=="gleba"){
            more = c;
        }

        while (more!=c) {
            more = 0;
            bel = sc.nextLine();


            if (bel.length() == c) {
                for (int i = 0; i < c; i++) {
                    b.set(i,bel.charAt(i));// save input for future use
                }

                for (int i = 0; i < c; i++) {// *star trigger
                    if (b.get(i) == a.get(i)) {
                        print = print + "*";
                        b.set(i, null);//character can no longer be seen
                        d.set(i, null);// same goes for actual memory

                        more = more + 1;
                    }
                }


                for (int i = 0; i < c; i++) { // +plus trigger

                        for (int j = 0; j < c; j++) {
                            if (d.get(i)!=null) { // there is bug with comparing null and null so this will prevent it
                                if (b.get(j) == d.get(i)) {

                                    print = print + "+";
                                    b.set(j, null);//character can no longer be seen
                                    d.set(i, null);
                                }
                            }
                        }

                }

                System.out.println(print);// your results
            } else {
                System.out.println("Wrong input, the right input is for example 12345");// its for not having correct input set
            }
            print = "";
            for (int i = 0; i < c; i++){
                d.set(i,passcode.charAt(i));
            }
        }
        System.out.println("good job");








    }

}
