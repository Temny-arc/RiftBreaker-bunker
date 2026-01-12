package IngameSys;

public interface Commander {
    /*
    Int represents action, most commands doo but dialog and search have no penality if you have done it before

     */

    public int move();

    public int dialog();

    public int search();

    public int invent();

    public int help();


}
