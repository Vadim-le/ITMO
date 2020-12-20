public class MainStory {
    public static void main(String[] arguments) {
        Attacker hatifnats = new Attacker("Hatifnats");
        Surviver hemul = new Surviver("Hemul");
        Damage hiss = new Damage("hiss");
        hiss.setDamage(20);
        Damage arround = new Damage("surrounded and approached by a wall");
        arround.setDamage(60);
        Mental hear = new Mental("hearing");
        hear.setMental(40);
        Mental face = new Mental("silence and stillness");
        face.setMental(50);

        hatifnats.changeLocation(Location.FOREST);
        hatifnats.mental(hear);
        hatifnats.attack(hiss);
        hemul.SkillFromMental(hemul);
        hatifnats.changeLocation(Location.MOVE);
        hatifnats.attack(arround);
        hatifnats.mental(face);
        hemul.SkillFromDamage(hemul);
        hemul.changeLocation(Location.MOVE);
        hemul.SkillFromMental(hemul);
        hemul.changeLocation(Location.PILLAR);
        hemul.SkillFromDamage(hemul);
    }
}