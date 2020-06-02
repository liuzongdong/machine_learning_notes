public class Hero {
    private String heroName = "";
    private int attackPower = 10;
    private int hp = 100;
    private int gold = 100;
    private int mana = 100;
    private int level = 1;

    public Hero(String name) {
        heroName = name;
    }

    public int getHP(){
        return hp;
    }

    public attack(Hero target) {
        target.damage(attackPower);
    }

    public restore(int value) {
        //
        hp = hp + value;
    }

    public damage(int value) {
        hp = hp - value;
    }

    public abilityOne(int value) {
        mana = mana - value;
    }

    public abilityTwo(int value) {
        mana = mana - value;
    }

    public abilityThree(int value) {
        mana = mana - value;
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("Yu ji");
        Hero hero2 = new Hero("Hou Yi");
        System.out.println(hero2.getHP());
        hero1.attack(hero2);
        System.out.println(hero2.getHP());
    }

}