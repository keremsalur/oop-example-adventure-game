public abstract class Obstacle {
    private int obstacleId;
    private int damage;
    private int health;
    private int money;

    public Obstacle(int obstacleId, int damage, int health, int money) {
        this.obstacleId = obstacleId;
        this.damage = damage;
        this.health = health;
        this.money = money;
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
    public int getObstacleId() {
        return obstacleId;
    }
    public void setObstacleId(int obstacleId) {
        this.obstacleId = obstacleId;
    }
    public boolean onLive(){
        return this.getHealth() > 0;
    }
    public int defence(int playerDamage){
        return this.getHealth() - playerDamage;
    }
    public int attack(int playerHealth){
        return playerHealth - this.getDamage();
    };
    public int reward(int playerMoney){
        return playerMoney + this.getMoney();
    }
}
