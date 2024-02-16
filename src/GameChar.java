public abstract class GameChar {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;

    private static int characterCount = 0;

    public GameChar(int id ,String name, int damage, int health, int money){
        this.id = id;
        this.damage = damage;
        this.name = name;
        this.money = money;
        this.health = health;
        characterCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static int getCountOfCharacter(){
        return characterCount;
    }
}
