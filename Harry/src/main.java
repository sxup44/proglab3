import java.util.Objects;

abstract class Character {
    private String name;
    private Gender gender;

    public Character(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    //@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) &&
                gender == character.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

interface Spell {
    void cast(Character target);
}

interface Action {
    void perform(Character actor);
}

interface Object {
    String getName();
}

enum Place {
    OFFICE,
    HOGWARTS,
    OUTSIDE,
    TIPOFWAND
}

public class main {
    public static void main(String[] args) {
        Snape snape = new Snape("Severus Snape", Gender.MALE);
        LilyPotter lilyPotter = new LilyPotter("Lily Potter", Gender.FEMALE);
        SilverDoe silverdoe = new SilverDoe("Silver Doe", Gender.FEMALE);
        Place office = Place.OFFICE;
        snape.performAction(new ProtectHarryAction(), lilyPotter);
        snape.useSpell(new KillingCurse(), lilyPotter);
        snape.say("I have spied for you and lied for you, put myself in mortal danger for you. Everything was supposed to be to keep Lily Potter’s son safe. Now you tell me you have been raising him like a pig for slaughter—");
        Dumbledore dumbledore = new Dumbledore("Albus Dumbledore", Gender.MALE);
        dumbledore.say("Have you grown to care for the boy, after all?" );
        snape.useSpell(new ExpectoPatronum(), snape);
        
        Place tip = Place.TIPOFWAND;
        silverdoe.performAction(new Jumpfromwindow(), silverdoe);
        
        dumbledore.say("After all this time?");
        snape.say("Always");
    }
}