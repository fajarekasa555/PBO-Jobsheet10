package tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
        System.out.println("Barrier strength set to: " + strength);
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 16;
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }
}
