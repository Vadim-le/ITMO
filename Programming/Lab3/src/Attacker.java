import java.util.Objects;

public final class Attacker extends Human{
    private int inflictDamage = 0;//нанесенный урон
    private  int inflictMental = 100;//психологическое состояние

    public Attacker(String name){
        super(name);
    }

    public void attack(IDamage cast){
        if (getLocation() == Location.FOREST) {
            inflictDamage += cast.getDamage();
            System.out.println(getName() + " start to do " + cast.getName());// начали шипеть и размахивать
        }else{
            inflictDamage += 2 * cast.getDamage();
            System.out.println(getName() + " continued " + cast.getName());
        }
    }

    public int getInflictDamage(){
        return inflictDamage;
    }

    public void setSameInflictDamage(Attacker attacker){
        this.inflictDamage = attacker.getInflictDamage();
    }

    public void mental(IMental ment){
        if (getLocation() == Location.FOREST) {
            inflictMental -= ment.getMental();
            System.out.println(getName() + " off theirs " +ment.getName());

        }else{
            inflictMental -= ment.getMental();
            System.out.println(getName() + " face condition change to " + ment.getName());
        }
    }
    public int getInflictMental(){
        return inflictMental;
    }

    public void setSameInflictMental(Attacker attacker){
        this.inflictMental = attacker.getInflictMental();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Attacker attacker = (Attacker) o;
        return inflictDamage == attacker.inflictDamage && inflictMental == attacker.inflictMental;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inflictDamage, inflictMental);
    }

    @Override
    public String toString() {
        return "Attacker{" +
                "inflictDamage=" + inflictDamage +
                ", inflictMental=" + inflictMental +
                '}';
    }
}
