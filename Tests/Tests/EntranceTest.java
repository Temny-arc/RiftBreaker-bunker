package Tests;

import Floor1.Entrance;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EntranceTest {

    HashMap<Integer,Integer> testdata;
    HashMap<String,String> ignore;
    Entrance entrance;
    String arg;

    @org.junit.jupiter.api.BeforeEach
    void inic(){
        testdata = new HashMap<>();


        ignore = new HashMap<>();
        for (int i = 0; i < 200; i++) {
            testdata.put(i,0);
            ignore.put(i+"pass",i+i+"value");
        }
        testdata.put(0,8);
        entrance = new Entrance();
        arg = "8";
    }



    @org.junit.jupiter.api.Test
    void move() {

        HashMap<Integer,Integer> bel = entrance.move(arg,testdata);


        assertEquals(bel.get(0),testdata.get(0));
    }

    @org.junit.jupiter.api.Test
    void dialog() {
    }

    @org.junit.jupiter.api.Test
    void search() {

        System.out.println(testdata);
        HashMap<Integer,Integer> bel = entrance.search(arg,testdata,ignore);
        System.out.println(testdata);
        assertEquals(bel,testdata);

    }

    @org.junit.jupiter.api.Test
    void invent() {
    }

    @org.junit.jupiter.api.Test
    void help() {
    }
}