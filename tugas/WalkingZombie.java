package tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int level, int health) {
        super(level, health);
    }

    @Override
    public void heal(int healingPoints) {
        super.heal(healingPoints);
        System.out.println("Walking Zombie healed by " + healingPoints + " points.\n");
    }

    @Override
    public void destroyed() {
        super.destroyed();
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie\n" + super.getZombieInfo();
    }
}