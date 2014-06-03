package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Rank;
import com.csc.playingcards.suits.SuitType;

public class StandardDeck extends Deck
{
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
  protected void createSuiteTypes() {
    suitTypes = new SuitType[]
      {
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
        Rank.KING,
        Rank.QUEEN,
        Rank.JACK,
        Rank.TEN,
        Rank.NINE,
        Rank.EIGHT,
        Rank.SEVEN,
        Rank.SIX,
        Rank.FIVE,
        Rank.FOUR,
        Rank.THREE,
        Rank.DEUCE
      };
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}