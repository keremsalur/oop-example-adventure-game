public abstract class BattleLoc extends Location{
    private Obstacle obstacle;

    public BattleLoc(Obstacle o){

    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public void combat(){

    }

    @Override
    public boolean onLocation(){
        return  true;
    }

}
