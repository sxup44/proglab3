class ProtectHarryAction implements Action {
    @Override
    public void perform(Character actor) {
        System.out.println(actor.getName() + " puts ownself in mortal danger to protect Harry Potter.");
    }
}
