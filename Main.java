public class Main {
    public static void main(String[] args) {
        Character hero = new Character(100, 50);

        // Swing sword multiple times
        for (int i = 0; i < 6; i++) {
            hero.swingSword();
        }

        // Take damage multiple times
        hero.takeDamage(30);
        hero.takeDamage(50);
        hero.takeDamage(20);

        // Rest and restore
        hero.rest();

        // Print final state
        System.out.println("Character's health: " + hero.getHealth() + ", stamina: " + hero.getStamina() + ".");
    }
}