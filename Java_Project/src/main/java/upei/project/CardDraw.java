package upei.project;

public class CardDraw extends Block{
    private Deck deck;

    public CardDraw(Deck deck, String name){
        super(name);
        this.deck = deck;
    }

    @Override
    public void doAction(Player player) {
        deck.playTop(player);
    }
}