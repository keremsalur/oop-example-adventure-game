public class Weapon extends Item{
    private int damage;
    public Weapon(int id, String name, int price) {
        super(id, name, price);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
