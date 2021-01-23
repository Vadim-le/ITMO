import java.util.Objects;

public class Walk implements IWalk{
    private String name;

    public Walk(String name){
        this.name =name;
    }
    public String getName() {
        return this.name;
    }


    public void walk1(){
        System.out.println(getName() + " step by line ");
    }

    public void walk2(){
        System.out.println(getName() + " surrounded by the wall ");
    }

    public void walk3(){
        System.out.println(getName() + " fleshed between the trees ");
    }

    public void walk4(){
        System.out.println(getName() + " kept getting closer ");//продолжали приближаться
    }

    public void walk(String s){
        System.out.println(getName() + s);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Walk walk = (Walk) o;
        return Objects.equals(name, walk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Walk{" +
                "name='" + name + '\'' +
                '}';
    }
}
