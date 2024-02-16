public abstract class BattleLoc extends Location{
    private Obstacle[] obstacles;
    private int maxObstacleCount = 3;

    public BattleLoc(Obstacle[] o){
        this.obstacles = o;
    }

    public Obstacle[] getObstacles() {return obstacles;}

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public int getMaxObstacleCount() {
        return maxObstacleCount;
    }

    public void setMaxObstacleCount(int maxObstacleCount) {
        this.maxObstacleCount = maxObstacleCount;
    }

    public void combat(){

    }

    @Override
    public boolean onLocation(){
        return  true;
    }

}
