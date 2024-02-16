public class Armor extends Item{
    private int armor;
    public Armor(int id, String name, int price) {
        super(id, name, price);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
