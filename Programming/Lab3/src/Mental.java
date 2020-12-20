import java.util.Objects;

public final class Mental implements IMental{
    private String name;
    private int mental;

    public Mental(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getMental(){
        return mental;
    }

    @Override
    public void setMental(int mental){
        this.mental = mental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mental mental1 = (Mental) o;
        return mental == mental1.mental && Objects.equals(name, mental1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mental);
    }


}
