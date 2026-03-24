public class Warrior extends Character {
    public Warrior() {
        super(new CanTakeDamage(50));
    }

    @Override
    public void attack() {
        System.out.println("The warrior strikes with a sword.");
    }

    @Override
    public void takeDamage(int points) {
        System.out.println("The Warrior resist, and take " + points / 2 + " points of damage.");
    }


}
