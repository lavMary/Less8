abstract class Wizard implements WizardAttack{
    protected int wizardDamage;

    public Wizard(int wizardDamage) {
        this.wizardDamage = wizardDamage;
    }

    public int getWizardDamage() {
        return wizardDamage;
    }

    public void setWizardDamage(int wizardDamage) {
        this.wizardDamage = wizardDamage;
    }

    public void st(WizardAttack wizardAttack) {
        wizardAttack.attack();

    }

    @Override
    public void attack() {
        System.out.println("I lose hp!");
    }
}
