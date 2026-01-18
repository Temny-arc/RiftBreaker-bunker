package IngameSys;

public interface Commander {
    /*
    Int represents action, most commands do but dialog and search have no penality if you have done it before

     */

    public int move(String arg);

    public int dialog(String arg);

    public int search(String arg);

    public int invent(String arg);

    public int help(String arg);


}
