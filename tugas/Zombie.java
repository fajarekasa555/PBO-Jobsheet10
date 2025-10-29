package tugas;

public class Zombie implements Destroyable {
    private int health;
    private int level;

    public Zombie(int level, int health) {
        this.level = level;
        this.health = health;
    }

    public void heal(int healingPoints) {
        health += healingPoints;
    }

    @Override
    public void destroyed() {
        if (level == 1) {
            health -= 10;
        } else if (level == 2) {
            health -= 5;
        } else if (level == 3) {
            health -= 2;
            
        };
    }

    public String getZombieInfo() {
        return "Zombie Level: " + level + "\n" + "Health: " + health + "\n";
    }

}
