package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Card;

import java.util.HashMap;

public class GhettoSpadesDeck extends StandardDeck
{
  //-------------------------
  //strings
  //-------------------------
  private final String GHETTO_SPADES = "Ghetto Spades";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public GhettoSpadesDeck()
  {
    name = GHETTO_SPADES;
  }
  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Protected Methods
  //****************************************************************************************************
  @Override
  protected void createCardRanks() {
    ranks = new HashMap<String, String[]>();
    ranks.put(SPADES,
      new String[]
        {
          BIG_JOKER,
          LITTLE_JOKER,
          DEUCE,
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
          THREE
        }
    );

    ranks.put(DIAMONDS,
      new String[]
        {
          DEUCE,
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
          THREE
        }
    );

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
          THREE
        }
    );
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}