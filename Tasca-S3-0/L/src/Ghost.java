public class Ghost extends Character {
    public Ghost() {
        super(new CantTakeDamage());
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }

    @Override
    public void takeDamage(int points) {
        super.takeDamage(points);
    }
}
