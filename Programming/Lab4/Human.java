import java.util.Objects;
public abstract class Human {
    private Location location = Location.FOREST;
    private String name;
    private Condition condition;

    public Human(String name) {
        this.name = name;
    }

    public Human() {

    }

    public void Skill(String s) {

    }

    public void changeLocation(Location loc) {
        this.location = loc;
        System.out.println(this.name + " last position change " + loc);
    }

    public void changeCondition(Condition con,String f) {
        this.condition = con;
        System.out.println(this.name + " mental change to " + con + f);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class Attacker extends Human {
        public Attacker(String name) {
            super(name);
        }
        boolean speak = false;
        boolean hear = false;
        boolean vision = true;

        public Attacker() {
            super();
        }

        public void Skill(String s) {
            System.out.println(getName() + s);
        }

        public void Condition(String s) {
            System.out.println(getName() + s);
        }

        public void organs(){System.out.println(getName()+" speak-" + speak + " hear-"+ hear + " vision-" + vision);}
        void carpet() {
            class  Carpet{
                public void print() {
                    System.out.println("Like a white carpet, they covered the whole clearing");
                }
            }
            Carpet carpet = new Carpet();
            carpet.print();
        }
    }


    public static class Surviver extends Human {
        final String ANSI_GREEN = "\u001B[32m";
        boolean isSuround  =  true;
        public Surviver(String name) {
            super(name);
        }

        public void Skill(String l) {
            System.out.println(getName() + l);
        }

        void Whistle() {
            int [] myNum = new int[] {1,3};
            class Whist {
                public void print() {
                    try {
                        System.out.println(myNum[1] + " short " + myNum[1] + " long SOS ");
                    } catch (RuntimeException e) {
                        throw new RuntimeException(" не верный индекс!!! ");
                    }
                }
            }
            Whist whist = new Whist();
            whist.print();
        }
        public void escape() throws EscapeExeption{
            if (isSuround == true) {
                System.out.println(ANSI_GREEN + getName()  +" can not escape ");
            } else {
                throw new EscapeExeption(getName() + " way clear, he escape");
            }
        }
    }

    public static class Defender extends Human {
        public Defender(String name) {
            super(name);
        }

        INFORMATION inf = new INFORMATION("NORTH side", 1);

        private class INFORMATION { //вложенный

            public INFORMATION(String position, int quanity) {
                System.out.println(getName() + " stay on " + position + " in quanity of " + quanity);
            }
        }

        public void Skill(String f) {
            System.out.println(getName() + f);
        }

        public void Ask(String text) {
            System.out.println(getName() + text);
        }

        boolean prosvet = true;

        public void open() throws OpenExeption {
            if (prosvet == true) {
                System.out.println("prosvet = " + prosvet + " " + getName() + " saw a clearing, hatifnatts and Hemul");
            } else {
                throw new OpenExeption("Gap did not open, end of story!");
            }
        }
    }
}