public class CantTakeDamage implements TakingDamage {

    @Override
    public void takeDamage(int points) {
        System.out.println("cannot take physical damage!");
    }
}
