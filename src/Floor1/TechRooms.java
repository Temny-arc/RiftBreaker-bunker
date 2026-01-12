package Floor1;

import IngameSys.Commander;

public class TechRooms implements Commander {
    @Override
    public int move() {
        //TODO here player needs to decide which one he wants to visit, he can also move directly to second tech room
        return 0;
    }

    @Override
    public int dialog() {
        return 0;
    }

    @Override
    public int search() {
        //TODO decider where you are right now
        return 0;
    }

    @Override
    public int invent() {
        return 0;
    }

    @Override
    public int help() {
        return 0;
    }
}
