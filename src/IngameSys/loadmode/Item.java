package IngameSys.loadmode;

public class Item {
    private String id;
    private String name;
    private String type;
    private String description;
    private boolean obtained;

    public Item(String id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.obtained = false;
    }
    public Item(Item item) {
        this.id = item.id;
        this.name = item.name;
        this.type = item.type;
        this.description = item.description;
        this.obtained = item.obtained;// there may be some already obtained items
    }

    public int use(String id) {

        return 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public boolean isObtained() {
        return obtained;
    }
    public void Obtain() { // set that is doing almost the same thing but we don't want to false it
        this.obtained = true;
    }
    public void deObtain() { // in some wierd cases this is used
        this.obtained = false;
    }
}
