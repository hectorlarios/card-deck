package com.csc.playingcards.decks;

import java.util.HashMap;

public class GhettoSpadesDeck extends StandardDeck
{
  //-------------------------
  //strings
  //-------------------------
  public final static String GHETTO_SPADES = "Ghetto Spades";
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
  //Begin  - Private Methods
  //****************************************************************************************************
  private String[] getCommonRanks()
  {
    String[] value =
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
      };

    return value;
  }
  //****************************************************************************************************
  //End - Private Methods
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

    ranks.put(HEARTS, getCommonRanks());

    ranks.put(CLUBS, getCommonRanks());
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}