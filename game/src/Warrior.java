public class Warrior extends Character {

    public Warrior(String name) {
        this.setName(name);
        this.setMaxHp(130);
        this.setHp(130);
        this.setAtk(20);
        this.setDef(15);
        this.setSpeed(8);
        this.setMpMax(30);
        this.setMp(30);
    }

    @Override
    public void showSkills(){
        System.out.println("1 - Punch");
        System.out.println("2 - Roar");
        System.out.println("3 - Shield");
        System.out.println("4 - Rapid Strike");

    }

    @Override
    public void useSkills(int option, Character target){
        switch (option){
            case 1 -> attack(target);
            case 2 -> Roar(target);
            case 3 -> Shield();
            case 4 -> RapidStrike(target);
            default -> System.out.println("Invalid option");
        }

    }


    public void Roar(Character target){
        setMpCost(15);
        if(!mana()){
            System.out.println("Not enough mana");
        }
        this.setMp(this.getMp() - getMpCost());
        int atkReduction = (int) (target.getAtk() - 0.2 * target.getAtk());
        int defReduction = (int) (target.getDef() - 0.2 * target.getDef());
        target.setAtk(atkReduction);
        System.out.println("Atk reduction: " + atkReduction);
        System.out.println("Def reduction: " + defReduction);
    }

    public void Shield(){
        setMpCost(10);
        if(!mana()){
            System.out.println("Not enough mana");
        }
        this.setMp(this.getMp() - getMpCost());
        int defGrowth = (int) (this.getDef() + 0.25 * this.getDef());
        this.setDef(defGrowth);
        System.out.println("Def Growth: " + defGrowth);
    }

    public void RapidStrike(Character target){
        setMpCost(15);
        if(!mana()){
            System.out.println("Not enough mana");
        }
        this.setMp(this.getMp() - getMpCost());
        int damage = (int) (getAtk() * 2.5);
        System.out.println("Rapid Strike damages " + damage);
        target.getDamage(damage);
    }



}
