import java.util.Scanner;

public class Player {

    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;

    private final Scanner scanner = new Scanner(System.in);

    public Player(String name){
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){
        GameChar[] characters = {new Archer(),new Samurai(),new Knight()};
        System.out.println("----------------------------------------------------");
        System.out.println("Characters");
        for (GameChar character : characters)
            System.out.println(
                    "Id: " +character.getId() +
                    "\tName: "+character.getName() +
                    "\tDamage: "+character.getDamage() +
                    "\tHealth: "+character.getHealth() +
                    "\tMoney: "+character.getMoney());
        System.out.println("----------------------------------------------------");
        int choice = 0;
        do {
            System.out.println("Toplam : " + GameChar.getCountOfCharacter());
            System.out.println("Please make your choice for character id: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    initPlayer(new Archer());
                    break;
                case 2:
                    initPlayer(new Samurai());
                    break;
                case 3:
                    initPlayer(new Knight());
                    break;
                default:
                    System.out.println("Please choice 1 or 2 or 3!");
                    break;
            }
        }while (choice < 0 || choice > GameChar.getCountOfCharacter());
        System.out.println("You are " + this.getCharName() + "!");
    }

    private void initPlayer(GameChar character){
        this.setCharName(character.getName());
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
    }
}
