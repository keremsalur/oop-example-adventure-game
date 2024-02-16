public abstract class BattleLoc extends Location{
    private Obstacle[] obstacles;

    public BattleLoc(Obstacle[] o){
        this.obstacles = o;
    }

    public Obstacle[] getObstacle() {return obstacles;}

    public void setObstacle(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void combat(){

    }

    @Override
    public boolean onLocation(){
        return  true;
    }

}
