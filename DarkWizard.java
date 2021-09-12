public class DarkWizard extends Wizard implements Info, WizardAttack{
    protected int wizardDamage;
    protected String curse;

    public DarkWizard(int wizardDamage, int wizardDamage1) {
        super(wizardDamage);
        this.wizardDamage = wizardDamage1;
    }

    @Override
    public void info() {
        System.out.println("...");
    }

    @Override
    public int getWizardDamage() {
        return wizardDamage;
    }

    public String getCurse() {
        return curse;
    }

    @Override
    public void setWizardDamage(int wizardDamage) {
        this.wizardDamage = wizardDamage;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    public void st(int wizardDamage) {
        System.out.println("I lose " + wizardDamage + " hp!");
    }
    public void st(int wizardDamage,String curse) {
        System.out.println("I lose " + wizardDamage + " hp!And I have the " + curse);
    }

}
