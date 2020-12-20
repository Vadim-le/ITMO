import java.util.Objects;

public final class Damage implements  IDamage{
    private String name;
    private int damage;

    public Damage(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getDamage(){
        return damage;
    }

    @Override
    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Damage damage1 = (Damage) o;
        return damage == damage1.damage && Objects.equals(name, damage1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage);
    }

    @Override
    public String toString() {
        return "Damage{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
