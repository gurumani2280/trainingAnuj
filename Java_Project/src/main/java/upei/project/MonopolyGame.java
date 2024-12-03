package upei.project;
import java.util.ArrayList;

public class MonopolyGame {

    private Block[] board = new Block[40];
    public ArrayList<Player> players;
    public Jail jail;
    public Dice dice;
    // figure how to do chance and community chest
    private Deck communityChest = new Deck();
    private Deck chance = new Deck();

    //constructor
    public MonopolyGame(Jail jail,Dice dice ArrayList<Player> players) {
        this.jail = jail;
        this.dice = dice;
        this.players = players;

        //creating all squares on the board
        for (int i = 0; i < 40; i++) {
            board[i] = createBlock(i);
            board[i].index = i;
        }

        communityChest.shuffle();
        chance.shuffle();
    }

    private Block createBlock(int pos) {
        switch (pos) {
            case 0:
                return new Block("GO");
            case 1:
                return new Block("Mediterranean Avenue");
            case 2:
                return new Block("Community Chest");
                //etc
        }
    }

    public Block getSquareAt(int position){
        return board[position];
    }

    public Block getCurrentSquare(Player player){
        return getSquareAt(player.getPosition());
    }








}
