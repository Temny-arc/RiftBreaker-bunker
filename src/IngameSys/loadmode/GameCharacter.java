package IngameSys.loadmode;

public class GameCharacter {
    private String id;
    private String name;
    private String role;
    private String talk_color;
    private String notes;


    public GameCharacter(String id, String name, String role, String talk_color, String notes) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.talk_color = talk_color;
        this.notes = notes;
    }
}
