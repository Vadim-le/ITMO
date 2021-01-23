public class MainStory {
    public static void main(String[] arguments) {
        final String ANSI_GREEN = "\u001B[32m";
        Human.Attacker hatifnats = new Human.Attacker("Hatifnats");
        hatifnats.changeLocation(Location.FOREST);
        Human.Surviver hemul = new Human.Surviver("Hemul");
        hemul.changeLocation(Location.FOREST);
        hatifnats.Condition(" stop hearing ");
        hatifnats.changeCondition(Condition.SHIVER,"");
        Walk move1 = new Walk("Hatifnats ");
        move1.walk1();
        hatifnats.Skill("Start hiss");
        hatifnats.Skill("Start swing");
        hemul.changeCondition(Condition.SCARY ," and look around");
        Walk move2 = new Walk("Enemies");
        move2.walk1();
        Walk move3 = new Walk("new Hatifnats");
        move3.walk2();
        hatifnats.changeCondition(Condition.SHIVER,"");
        Walk move4 = new Walk("Hatifnats");
        move4.walk4();
        hemul.Skill(" take skirts ");
        IUltimate ultimate = new IUltimate() {
            @Override
            public void ultimate() {
                System.out.println("Use Nehemul power");
            }
        };
        ultimate.ultimate();
        hemul.changeLocation(Location.PILLAR);
        hemul.changeCondition(Condition.SHIVER,"");
        hemul.Skill(" hold on the barometr ");
        Walk move = new Walk("Hatifnats");
        move.walk(" came close to the post ");
        hatifnats.carpet();
        hemul.changeCondition(Condition.THOUGHTS,"");
        hemul.Skill(" if fell to the ground ");
        try {
            hemul.escape();
            hemul.Skill(" put two fingers in his mouth and whistled ");
            hemul.Whistle();
            Human.Defender snusmumrik = new Human.Defender("Snusmumrik");
            move.walk(" rushed headlong ");
            IWhistle whistle = new IWhistle() {
                @Override
                public void whist() {
                    System.out.println("Weak at first, whistling became more and more distinct");
                }
            };
            whistle.whist();
            snusmumrik.Skill(" began to sneak ");
            snusmumrik.changeLocation(Location.BETWEEN);
            try {
                snusmumrik.open();
                snusmumrik.Skill(" see glade ");
                hemul.Skill(" hang in top of pillar");
                hemul.Skill(" just clicked on their barometer ");
                IThing thing = new IThing() {
                    @Override
                    public void thing() {
                        System.out.println(" arrow fall down");
                    }
                };
                thing.thing();
                snusmumrik.Skill(" should drive the hatifnatts away");
                snusmumrik.Ask(" :do you remember how we got mouse in" + Location.GARDEN);
                IFather father = new IFather() {
                    @Override
                    public void father() {
                        System.out.println("Moomin-papa then dug many pillars into the ground and put propellers on them");
                    }
                };
                father.father();
                Mouse mouse = new Mouse("Mouse");
                mouse.away();
                hatifnats.organs();
                hatifnats.Condition(" very sensitive to jolts");
                hemul.Skill(" should shake pillar");
                hatifnats.Condition(" feel the earth tremble ");
                hatifnats.changeCondition(Condition.SCARY, " to the very livers");
                hemul.changeCondition(Condition.CALM, "");
            } catch (OpenExeption openExeption){
                System.out.println(openExeption.getMessage());
            }
        } catch (EscapeExeption escapeExeption) {
            System.out.println("Is Hemul surrounded? Answer = " + hemul.isSuround);
            System.out.println(escapeExeption.getMessage());
        }
    }
}