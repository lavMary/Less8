public class Warrior extends Hero {
    private int phisDamageMultipl;

    public Warrior (int hp, int level, int damage) {
        super(hp, level, damage);
    }

    public int getPhisDamageMultipl() {
        return phisDamageMultipl;
    }

    public void setPhisDamageMultipl(int phisDamageMultipl) {
        this.phisDamageMultipl = phisDamageMultipl;
    }

    void powerfulHit() {
        hp -= 300;
        System.out.println("Now my hp is " + hp + ". It was powerful!");
    }

    public void train() {
        System.out.println("Warrior cant training here");
    }
}
