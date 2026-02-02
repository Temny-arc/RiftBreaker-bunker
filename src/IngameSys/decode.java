package IngameSys;

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

}
