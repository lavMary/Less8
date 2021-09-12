public class DarkWizard extends Wizard implements Info, WizardAttack{
    //protected int wizardDamage;
    protected String curse;

    public DarkWizard(int wizardDamage, String curse) {
        super(wizardDamage);
        this.curse = curse;
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
