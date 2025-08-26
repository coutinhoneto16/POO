public abstract class Character {
    private String name;
    private int maxHp;
    private int hp;
    private int atk;
    private int def;
    private int speed;
    private int stamina = 5;
    private int mp;
    private int mpMax;
    private int level = 1;
    private int exp = 0;
    private int expUp = 100;
    private int mpCost;


    public Character() {
    }

    public abstract void showSkills();

    public abstract void useSkills(int option, Character target);

    public void getDamage(int damageReceived) {
        this.hp -= damageReceived;
        if (hp <= 0) {
            this.hp = 0;
            System.out.println("GAME OVER!!");
        }
        System.out.println(this.name + " suffer " + damageReceived + " damage. HP: " + this.hp + "/" + this.maxHp + "\n");
    }

    public boolean alive(){
        return hp > 0;
    }

    public void attack(Character target) {
        int damageGiven = (2 * atk) - target.def;
        if (damageGiven < 0) damageGiven = 0;
        System.out.println(this.name + " attack causes " + damageGiven + " damage \n");
        target.getDamage(damageGiven);
    }

    public void experience(int experience) {
        this.exp += experience;
        if (exp >= expUp){
            lvlUp(1);
            exp -= expUp;
            expUp = expUp * 2;
        }
    }

    public void mostrarFicha(){
        System.out.println("Name: " + this.name + " Lvl: " + this.level +
                "\nHP: " + this.hp + "/" + this.maxHp +
                "\nMP: " + this.mp + "/" + this.mpMax +
                "\nATK: " + this.atk +
                "\nDEF: " + this.def +
                "\nXP: " + this.exp + "/" + this.expUp);

    }

    public boolean mana(){
        return mp > mpCost;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExpUp() {
        return expUp;
    }

    public void setExpUp(int expUp) {
        this.expUp = expUp;
    }

    public void lvlUp(int lvl){
        this.level += lvl;
        System.out.println("Lvl up!!");
        this.hp += 5;
        this.speed += 2;
        this.atk += 2;
        this.def += 2;
        this.mp += 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMpCost() {
        return mpCost;
    }

    public void setMpCost(int mpCost) {
        this.mpCost = mpCost;
    }

    public int getMpMax() {
        return mpMax;
    }

    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }
}
