import java.util.Random;
public class Mage extends Character {


    Random rand = new Random();

    public Mage(String name) {
        this.setName(name);
        this.setMaxHp(100);
        this.setHp(100);
        this.setAtk(30);
        this.setDef(10);
        this.setSpeed(10);
        this.setMpMax(50);
        this.setMp(50);
    }

    @Override
    public void showSkills(){
        System.out.println("1 - Hit");
        System.out.println("2 - Fireball");
        System.out.println("3 - Heal");
    }

    @Override
    public void useSkills(int option, Character target) {
        switch (option){
            case 1 -> attack(target);
            case 2 -> Fireball(target);
            case 3 -> Heal();
            default -> System.out.println("Invalid option");
        }
    }



    public void Fireball(Character target) {
        setMpCost(10);
        if (!mana()){
            System.out.println("Not enough mana!");
        }
        this.setMp(this.getMp() - getMpCost());
        int damage = (int) (getAtk() * 2.5);
        System.out.println("Fireball damage " + damage);
        target.getDamage(damage);
    }

    public void Heal(){
        setMpCost(20);
        if (!mana()){
            System.out.println("Not enough mana!");
        }
        this.setMp(this.getMp() - getMpCost());
        int heal = (int) rand.nextInt(30, 70);
        this.setHp(this.getHp() + heal);
        if(this.getHp() > this.getMaxHp()) setHp(this.getMaxHp());
        System.out.println("Heal " + heal + " HP");
    }

}
