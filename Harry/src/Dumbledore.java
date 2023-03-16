public class Dumbledore extends Character {
    public Dumbledore(String name, Gender gender) {
        super(name, gender);
    }

    public void say(String text) {
        System.out.println(getName() + ": \"" + text + "\"");
    }
}
