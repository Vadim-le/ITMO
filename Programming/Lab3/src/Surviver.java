import java.util.Objects;

public final class Surviver extends Human implements IFiz,IMental {
    public Surviver(String name) {
        super(name);
    }

    @Override
    public void firstSkill() {
        System.out.println(getName() + " take skirts ");
    }

    @Override
    public void secondSkill() {
        System.out.println(getName() + " hold on to the barometr ");
    }

    @Override
    public void firstCondition() {
        System.out.println(getName() + " start " + Condition.SCARY);
    }


    @Override
    public void secondCondition() {
        System.out.println(getName() + " condition change to " + Condition.SHIVER);
    }

}