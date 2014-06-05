package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Card;

import java.util.HashMap;

public class PinochleDeck extends StandardDeck
{
  //-------------------------
  //strings
  //-------------------------
  public final static String PINOCHLE = "Pinochle";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************
  public PinochleDeck()
  {
    name = PINOCHLE;
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
    ranks.put(Card.ALL_SUITS,
      new String[]
        {
          ACE,
          TEN,
          KING,
          QUEEN,
          JACK,
          NINE,
          ACE,
          TEN,
          KING,
          QUEEN,
          JACK,
          NINE
        }
    );
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}