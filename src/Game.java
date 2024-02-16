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
    }
}
