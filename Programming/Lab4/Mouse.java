public class Mouse {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Location location;
    private Condition condition;

    public void changeLocation(Location loc) {
        this.location = loc;
        System.out.println(this.name + " last position change " + loc);
        }

    public void changeCondition(Condition con) {
        this.condition = con;
        System.out.println(this.name + " mental change to " + con);
    }

    public void away(){
        System.out.println(getName() + Condition.NERVOUS + " ,they " + Location.AWAY);
    }
    }

