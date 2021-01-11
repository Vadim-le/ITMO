import java.util.Objects;

public abstract class Human {
    private Location location = Location.FOREST;
    private String name;
    private String desc;
    public Human(String name) {
        this.name = name;
    }

    public void changeLocation(Location loc) {
        this.location = loc;
        System.out.println(this.name + " last position change " + loc );
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}