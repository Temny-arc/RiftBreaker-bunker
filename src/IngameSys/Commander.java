package IngameSys;

import java.util.HashMap;

public interface Commander {
    /*
    Int represents action, most commands do but dialog and search have no penality if you have done it before

     */

    /**
     * knowlidge of rooms where they are
     * vzdy se jedna o jednicku
     * hallway = 0,8
     * enterance = 1
     * bedroom = 2
     * bathroom = 3
     * Kitchen = 4
     * TechRooms = 5,6
     * Stairs = 7
     *
     * Cableroom = 10
     * CableOperator = 9
     * Controlroom = 11
     * Cryochamber = 12
     * ExperimentalLab = 13
     * Laboratory = 14
     * Manufactory = 15
     * @param arg
     * @param map
     * @return returns the same data exept items in 0 and 1 can be changed 0 is for location and 1 for turn cost
     */
    public HashMap<Integer,Integer> move(String arg,HashMap<Integer,Integer> map);

    /**
     *
      * @param arg decider of what to ask it can also be empty
     * @param map data to enable text since you need to rescue someone or be somewhere in order to even talk to someone
     * @return data since player can learn something important from a talk
     */
    public HashMap<Integer,Integer> dialog(String arg,HashMap<Integer,Integer> map);

    public HashMap<Integer,Integer> search(String arg,HashMap<Integer,Integer> map,HashMap<String,String> text);

    /**
     * due to the setup invent will do same thing everywhere so: sad face, still it would need a class not abstract not interface but a true class
     * @param li all data that will be loaded we will need only weapon and Item for now
     * @return It's just for fun since nothing happens
     */
    public int invent(Loader li);

    /**
     * help will do two things 1 is help player orient in the room, the second the command help
     * @param arg what part should be called
     * @param data some texts you access may need a data to bee seen
     * @param text info about data in the rooms
     * @return returns the instruction what is method supposed to do
     */
    public String help(String arg,HashMap<Integer,Integer> data,HashMap<String,String> text);


}
