import java.util.Objects;

public final class Surviver extends Human {


    public Surviver(String name){
        super(name);
    }

    public void SkillFromDamage(Surviver cast) {
        if (getLocation() == Location.FOREST) {
            System.out.println(getName() + " take skirts and start climb to pillar");
        } else {
            System.out.println(getName() + " hold on the barometr ");
        }
    }

    public  void SkillFromMental(Surviver ment){
        if (getLocation() == Location.FOREST) {
            System.out.println(getName() + " scare and look around ");
        }else {
            System.out.println(getName() + " showed non-Hemul power ");
        }
    }
}
