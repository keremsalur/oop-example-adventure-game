import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Adventure Game!.");
        System.out.print("Please enter player name: ");
        String playerName = scanner.nextLine();
        Player player1 = new Player(playerName);
        System.out.println("Welcome " +player1.getName());
        System.out.println("Please select your character: ");
        player1.selectChar();
        createMap();
    }
    public void createMap(){
        System.out.println("Map loading...");
        Location[] locations = {
            new Forest(
                    new Vampire[] {
                            new Vampire(2,4,14,7),
                            new Vampire(2,4,14,7),
                            new Vampire(2,4,14,7)
                    }
            ),
            new Cave(
                    new Zombie[] {
                            new Zombie(1,3,10,4),
                            new Zombie(1,3,10,4),
                            new Zombie(1,3,10,4)
                    }
            ),
            new River(
                    new Bear[] {
                            new Bear(3,7,20,12),
                            new Bear(3,7,20,12),
                            new Bear(3,7,20,12)
                    }
            ),
            new ToolStore(),
            new SafeHouse()
        };
    }

}
