public class WarriorAcademy extends Academy {
    @Override
    public void teach(Trainee warrioirTr) {
        if (warrioirTr instanceof Warrior) {
            super.teach(warrioirTr);
            return;
        }
        else {
            System.out.println("Can`t training");
        }
    }
}
