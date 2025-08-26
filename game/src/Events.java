import java.util.Scanner;
public class Events {

    public void PvP(Character c1, Character c2) {

        int round = 1;
        System.out.println("FIGHT STARTED!");
        System.out.println(c1.getName() + " VS " + c2.getName());

        while (c1.alive() && c2.alive()) {
            System.out.println("\n=== Round " + round + " ===");
            if (c1.getSpeed() > c2.getSpeed()) {
                turn(c1, c2);
                if (!c2.alive()) break;

                turn(c2, c1);
                if (!c1.alive()) break;

            } else {
                turn(c2, c1);
                if (!c1.alive()) break;

                turn(c1, c2);
                if (!c2.alive()) break;
            }
            round++;
        }

        if (c1.alive()) {
            System.out.println("\n" + c1.getName() + " wins the fight!");
        } else {
            System.out.println("\n" + c2.getName() + " wins the fight!");
        }
    }


    public void turn(Character attacker, Character target) {
        System.out.println("\n--- Turno de " + attacker.getName() + " ---");
        System.out.println("HP: " + attacker.getHp() + " | MP: " + attacker.getMp());

        attacker.showSkills();
        System.out.println("Choose your skill: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        attacker.useSkills(choice, target);
    }
}


