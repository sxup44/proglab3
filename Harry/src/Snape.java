public class Snape extends Character {
    public Snape(String name, Gender gender) {
        super(name, gender);
    }

    public void useSpell(Spell spell, Character target) {
        spell.cast(target);
    }

    public void performAction(Action action, Character actor) {
        action.perform(actor);
    }

    public void say(String text) {
        System.out.println(getName() + ": \"" + text + "\"");
    }
}
