public class Main {
    public static void main(String[] args) {

        Mage m1 = new Mage("Gandalf");
        Mage m2 = new Mage("Fodase");
        Warrior w1 = new Warrior("Guts");

        Events event = new Events();

        event.PvP(m1,w1);
        m2.mostrarFicha();
    }
}
