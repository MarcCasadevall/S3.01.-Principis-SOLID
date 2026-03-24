public class CanTakeDamage implements TakingDamage {
    private int points;

    public CanTakeDamage(int points) {
        this.points = points;
    }

    @Override
    public void takeDamage(int points) {
        System.out.println("The character takes " + points + " points of damage.");
    }
}
