package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Rank;
import com.csc.playingcards.suits.SuitType;

public class PinochleDeck extends Deck
{
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
  protected void createSuiteTypes() {
    suitTypes = new SuitType[]
      {
        SuitType.Spades,
        SuitType.Hearts,
        SuitType.Diamonds,
        SuitType.Clubs,
        SuitType.Spades,
        SuitType.Hearts,
        SuitType.Diamonds,
        SuitType.Clubs
      };
  }

  @Override
  protected void createCardRanks()
  {
    cardRanks = new Rank[]
      {
        Rank.ACE,
        Rank.TEN,
        Rank.KING,
        Rank.QUEEN,
        Rank.JACK,
        Rank.NINE
      };
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}