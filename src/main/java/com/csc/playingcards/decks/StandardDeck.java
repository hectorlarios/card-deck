package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Card;

import java.util.HashMap;

public class StandardDeck extends Deck
{
  //-------------------------
  //chars
  //-------------------------
  public final static char SPADES_CHAR = '♠';
  public final static char HEARTS_CHAR = '♥';
  public final static char DIAMONDS_CHAR = '♦';
  public final static char CLUBS_CHAR = '♣';
  //-------------------------
  //strings
  //-------------------------
  public final static String SPADES = "Spades";
  public final static String HEARTS = "Hearts";
  public final static String DIAMONDS = "Diamonds";
  public final static String CLUBS = "Clubs";

  public final static String ACE = "A";
  public final static String KING = "K";
  public final static String QUEEN = "Q";
  public final static String JACK = "J";
  public final static String TEN = "10";
  public final static String NINE = "9";
  public final static String EIGHT = "8";
  public final static String SEVEN = "7";
  public final static String SIX = "6";
  public final static String FIVE = "5";
  public final static String FOUR = "4";
  public final static String THREE = "3";
  public final static String DEUCE = "2";
  public final static String BIG_JOKER = "BJ";
  public final static String LITTLE_JOKER = "LJ";

  private final String STANDARD = "Standard";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public StandardDeck()
  {
    name = STANDARD;
  }
  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Protected Methods
  //****************************************************************************************************
  @Override
  protected void createCardSuits()
  {
    suits = new String[]
      {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
      };

    symbols = new HashMap<String, Character>();
    symbols.put(SPADES,SPADES_CHAR);
    symbols.put(HEARTS,HEARTS_CHAR);
    symbols.put(DIAMONDS,DIAMONDS_CHAR);
    symbols.put(CLUBS,CLUBS_CHAR);
  }

  @Override
  protected void createCardRanks() {
    ranks = new HashMap<String, String[]>();
    ranks.put(Card.ALL_SUITS,
      new String[]
        {
          ACE,
          KING,
          QUEEN,
          JACK,
          TEN,
          NINE,
          EIGHT,
          SEVEN,
          SIX,
          FIVE,
          FOUR,
          THREE,
          DEUCE
        }
    );
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}