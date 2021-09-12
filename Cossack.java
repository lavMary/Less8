public class Cossack extends Warrior implements Trainee,Info{
    private Saber saber;
    public Cossack(int hp, int level, int damage) {
        super(hp, level, damage);
    }

    public Saber getSaber() {
        return saber;
    }

    public void setSaber(Saber saber) {
        this.saber = saber;
    }

    @Override
    public void info() {
        System.out.println("Hi! My name is Ivan and I like pierogi.");
    }
    @Override
    public void train() {
        System.out.println("Cossack cant training here");
    }
}
