public class KillingCurse implements Spell {
    @Override
    public void cast(Character target) {
        System.out.println(target.getName() + " was hit by the Killing Curse!");
    }
}
