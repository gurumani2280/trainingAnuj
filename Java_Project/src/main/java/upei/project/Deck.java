package upei.project;

import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    /** Plays the top card from the deck and then places it at the bottom.
     /* @param player The player who is interacting with the card.
    */

    public void playTopCard(Player player) {
        if(!deck.isEmpty()) {
            Card topCard = deck.removeFirst();
            addCardToBottom(topCard);
            topCard.play(player);
        }else{
            System.out.println("The deck is empty, no card to play");
        }
    }
    /**
     * Adds a card to the bottom of the deck.
     *
     * @param card The card to be added to the deck.
     */
    public void addCardToBottom(Card card) {
        deck.addLast(card);
    }

    /**
     * Shuffles the deck, randomizing the order of cards.
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * Adds a card to the deck (adds it to the bottom).
     *
     * @param card The card to be added to the deck.
     */
    public void add(Card card) {
        deck.addLast(card);
    }

    /**
     * Returns the number of cards in the deck.
     *
     * @return The size of the deck.
     */
    public int size() {
        return deck.size();
    }

    /**
     * Checks if the deck is empty.
     *
     * @return True if the deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return deck.isEmpty();
    }

    /**
     * Get the card at a specific index from the deck.
     *
     * @param index The index of the card to retrieve.
     * @return The card at the specified index.
     */
    public Card getCardAt(int index) {
        if (index >= 0 && index < deck.size()) {
            return deck.get(index);
        }
        return null; // return null if index is out of bounds
    }
}

