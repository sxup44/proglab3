class Jumpfromwindow implements Action {
    @Override
    public void perform(Character actor) {
        System.out.println(actor.getName() + " jumps from tip of the wand to office floor and then goes outside. " );
    }
}