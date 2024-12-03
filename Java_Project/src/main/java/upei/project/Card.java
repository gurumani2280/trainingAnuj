package upei.project;
import java.util.ArrayList;
public abstract class Card {

    String text;

    public Card(String message){
        this.text = message;
    }
    public String getText() {
        return text;
    }

    public void play(Player player){
        doAction(player);
        System.out.println("You drew: " + text);
    }

    public abstract void doAction(Player player);
    public String toString(){
        return "Card: " + text;
    }
}

public class CollectCard extends Card{
    private int amount;

    public CollectCard(int amount, String text){
        super(createCollectMessage(amount, text));
        this.amount = amount;
    }

    protected static String createCollectMessage(int amount, String text){
    if(amount > 0){
        return text + ". Collect $ " + amount;
    } else {
        return text + ". Pay $ " + Math.abs(amount);
    }
}
public void doAction(Player player){
    player.addMoney(amount);
    }
}

public class CollectEveryCard extends CollectCard {
    private ArrayList<Player> players;

    public CollectEveryCard(ArrayList < Player > players, int amount, String text){
        super(amount, createCollectMessage(amount, text));
        this.players = players;
    }
    protected static String createCollectMessage ( int amount, String text){
        String actionMessage = CollectCard.createCollectMessage(amount, text);
        String playerCountMessage = (amount > 0) ? "from every player" : "to every player";
        return actionMessage + playerCountMessage + "(" + players.size() + "players involved)";
    }

    public void doAction (Player player){
        if (players.isEmpty()) {
            System.out.println("No players to collect money from.");
            return;
        }
        if (amount == 0) {
            System.out.println("Amount is zero. No action will be taken.");
            return;
        }
        for (Player p : players) {
            p.addMoney(amount < 0 ? amount : -amount);
        }
        player.addMoney(amount * (players.size() - 1));
        System.out.println(player.getName() + " collects " + Math.abs(amount) * (players.size() - 1) + " from all players.");
    }
}
public class MoveCard extends Card{
    private int numSquares;
    private Board board;

    public MoveCard(int numSquares, Board board, String text){
        super(text);
        this.numSquares = numSquares;
        this.board = board;
    }
public void doAction(Player player) {
    if (numSquares == 0) {
        System.out.println(player.getName() + " does not move. No squares to move on.");
        return;
    }
    int currentPosition = player.getPosition();
    int newPosition = currentPosition + numSquares;

    if (newPosition >= 40) {
        newPosition = newPosition % 40;
        System.out.println(player.getName() + " moves beyond the last square and wraps around to position " + newPosition);
    } else if (newPosition < 0) {
        newPosition = 40 + newPosition % 40;
        System.out.println(player.getName() + "moves backward to position " + newPosition);
    } else {
        System.out.println(player.getName() + " moves to position " + newPosition);
    }
    player.move(newPosition, board);

    Square currentSquare = board.getSquareAt(newPosition);
    currentSquare.doAction(player);
}
public String toString(){
        String direction = (numSquares > 0) ? "forward" : "backward";
        return super.toString() + "(Move " + Math.abs(numSquares) + " squares " + direction + ")";
}
}
public class MoveToCard(int[] index, Board board, String text){
    super(text);
    this.index = index;
    this.board = board;
}
public void doAction(Player player){
    int minimumDistance = Integer.MAX_VALUE;
    for(int target : index){
        int distance = (target - player.getPosition() + 40) % 40;
        minimumDistance = Math.min(minimumDistance, distance);
    }
    player.move(minimumDistance, board);

}

}


public class HouseRepairCard extends CollectCard{
    private int perHouse;
    private int perHotel;
    public HouseRepairCard(int perHouse, int perHotel, String text){
        super(0, text);
        this.perHouse = perHouse;
        this.perHotel = perHotel;
    }
    private int calculateFee(Player player){
        int fee = 0;

        for(ColorProperty p : player.getOwnColorGroupList()){
            if(p.getNumHouses() == 5) {
                fee += perHotel;
                System.out.println(player.getName() + " is charged " + perHotel + " for a hotel on " + p.getName());
            }else if(p.getNumHouses() > 0){
                fee += perHouse * p.getNumHouses();
                System.out.println(player.getName() + " is charged " + (perHouse * p.getNumHouses()) + " for " + p.getNumHouses() + " houses on " + p.getName());
            }
        }
        amount = fee;
        return fee;
    }
    public void doAction(Player player){
        int fee = calculateFee(player);
        player.addMoney(-fee);
        System.out.println(player.getName() + " has paid a total of $ " + fee + " for house repairs.");
    }
}
public class ToJailCard extends Card{
    private Jail jail;
    public ToJailCard(Jail jail){
        super("Go Directly To Jail");
        this.jail = jail;
    }
    public void doAction(Player player){
        jail.sendToJail(player);
        System.out.println(player.getName() + " has been sent directly to jail.");
    }
}
public class OutOfJailCard extends Card{
    public OutOfJailCard(){
        super("Get Out Of Jail For Free");
    }
    public void doAction(Player player){
        player.outOfJailCards++;
        System.out.println(player.getName() + " has used an 'Out of Jail For Free' card and can now leave jail at no cost.");
    }
}
