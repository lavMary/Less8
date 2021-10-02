public abstract class Healer extends Hero {
    private int healPower;

    public Healer(int hp, int level, int damage) {
        super(hp,level,damage);
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    void heal() {
        System.out.println("It`s ok. I`m healing!");
    }
    
}
