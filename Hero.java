public abstract class Hero implements Info{
    int hp;
    private int level;
    private int damage;

    public Hero(int hp, int level, int damage) {
        this.hp = hp;
        this.level = level;
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void info() {
        System.out.println("Hi! My name is Super Ultra Man");
    }


}
