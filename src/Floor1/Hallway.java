package Floor1;

import IngameSys.Commander;

public class Hallway implements Commander {
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int dialog() {
        //TODO talk to a women
        return 0;
    }

    @Override
    public int search() {
        //TODO if there is something from event allow triggering
        return 0;
    }

    @Override
    public int invent() {
        //TODO this is just heal
        return 0;
    }

    @Override
    public int help() {
        //TODO info player to move
        return 0;
    }
}
