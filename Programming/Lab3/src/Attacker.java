import java.util.Objects;

public final class Attacker extends Human implements IFiz,IMental {
    public Attacker(String name) {
        super(name);
    }

    @Override
    public void firstSkill(){
        System.out.println(getName() + " start hiss ");
    }

    @Override
    public void secondSkill(){
        System.out.println(getName() + " start swing ");
    }

    @Override
    public void firstCondition(){
        System.out.println(getName() + " stop hearing ");
    }

    @Override
    public void secondCondition(){
        System.out.println(getName() + " face change to " + Condition.SILENCE);
    }


    public void move1(Walk walk1){
        System.out.println(getName() + " step by step gerenga");
    }

}