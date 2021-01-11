public class MainStory {
    public static void main(String[] arguments) {
        Attacker hatifnats = new Attacker("Hatifnats");
        hatifnats.changeLocation(Location.FOREST);
        Surviver hemul = new Surviver("Hemul");
        hemul.changeLocation(Location.FOREST);
        hatifnats.firstCondition();
        Walk move1 = new Walk("Hatifnats");
        move1.walk1();
        hatifnats.firstSkill();
        hatifnats.secondSkill();
        hemul.firstCondition();
        Walk move2 = new Walk("Enemies");
        move2.walk2();
        Walk move3 = new Walk("new Hatifnats");
        move3.walk3();
        hatifnats.secondCondition();
        Walk move4 = new Walk("Hatifnats");
        move4.walk4();
        hemul.firstSkill();
        Ultimate ult = new Ultimate("Hemul");
        ult.ulta();

        hemul.secondCondition();
        hemul.secondSkill();

    }
}