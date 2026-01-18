package Floor1;

import IngameSys.Commander;

public class TechRooms implements Commander {
    @Override
    public int move(String arg) {
        //TODO here player needs to decide which one he wants to visit, he can also move directly to second tech room
        return 0;
    }

    @Override
    public int dialog(String arg) {
        return 0;
    }

    @Override
    public int search(String arg) {
        //TODO decider where you are right now
        return 0;
    }

    @Override
    public int invent(String arg) {
        return 0;
    }

    @Override
    public int help(String arg) {
        return 0;
    }
}
