public class Character {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int health, int stamina) {
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health = health;
        this.stamina = stamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        if (stamina <= 0) {
            System.out.println("Your character needs to cool down.");
            return;
        }

        stamina -= 10;
        if (stamina < 0) {
            stamina = 0;
        }
        System.out.println("Character swings sword. Stamina is now " + stamina + ".");
    }

    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health < 0) {
            health = 0;
        }

        System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");

        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }

    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
