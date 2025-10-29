package tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int level, int health) {
        super(level, health);
    }

    @Override
    public void heal(int healingPoints) {
        super.heal(healingPoints);
        System.out.println("Jumping Zombie healed by " + healingPoints + " points.\n");
    }

    @Override
    public void destroyed() {
        super.destroyed();
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie\n" + super.getZombieInfo();
    }
    
}
