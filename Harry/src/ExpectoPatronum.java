public class ExpectoPatronum implements Spell {
    @Override
    public void cast(Character target) {
        System.out.println(target.getName() + " casts Expecto Patronum!");
    }
}
