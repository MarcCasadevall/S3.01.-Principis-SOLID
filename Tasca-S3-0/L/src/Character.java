public class Character {
    private TakingDamage takingDamage;

    public Character(TakingDamage takingDamage) {
        this.takingDamage = takingDamage;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }

    public void takeDamage(int points) {
        takingDamage.takeDamage(points);
    }
}
