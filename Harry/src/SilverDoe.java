public class SilverDoe extends Character {
    public SilverDoe(String name, Gender gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}
    public void performAction(Action action, Character actor) {
        action.perform(actor);
    }

	
}

