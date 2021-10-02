public class PriestAcademy extends Academy{
    @Override
    public void teach(Trainee druid) {
        if (druid instanceof Healer) {
            super.teach(druid);
            return;
        }
        else {
            System.out.println("Cant train");
        }
    }
}
