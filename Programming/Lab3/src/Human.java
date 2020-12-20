import java.util.Objects;

public abstract class Human {
    private Location location = Location.FOREST;
    private String name;

    public Human(String name){
        this.name = name;
    }

    public Location getLocation(){
        return this.location;
    }

    public void changeLocation(Location loc){
        this.location = loc;
        System.out.println(this.name + " last position change " + loc);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return location == human.location && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "location=" + location +
                ", name='" + name + '\'' +
                '}';
    }
}
