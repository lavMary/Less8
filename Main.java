public class Main {
    public static void main(String[] args) {
        //Hero hero = new Hero(3000, 99, 1400);
        //Healer healer = new Healer(1750, 72, 100);
        //Warrior warrior = new Warrior(1200, 70, 150);
        //Beast beast = new Beast(100, 105, "Bubble");
        HealerDruid healerDruid = new HealerDruid(1900, 75,135);
        Sword sword = new Sword("Archaic",700);
        Saber saber = new Saber("Wickedness",600);
        Cossack cossack = new Cossack(9999, 999, 10000);


        //Academy academy = new Academy();
        //academy.teach((Trainee) warrior);
        //System.out.println("Warrior is teaching in academy");
        WarriorAcademy warriorAcademy = new WarriorAcademy();
        warriorAcademy.teach((Trainee) cossack);
        //System.out.println("Cossack is teaching in Warrior academy");
        PriestAcademy priestAcademy = new PriestAcademy();
        priestAcademy.teach((Trainee) healerDruid);
        //System.out.println("Healer is teaching in Priest academy");

        //Wizard wizard = new Wizard(1000);
        DarkWizard darkWizard = new DarkWizard(9999,"Avada Kedavra");
        darkWizard.attack();
    }

}
