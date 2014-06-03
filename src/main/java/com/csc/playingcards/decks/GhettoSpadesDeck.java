package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Rank;
import com.csc.playingcards.suits.Suit;
import com.csc.playingcards.suits.SuitType;

public class GhettoSpadesDeck extends StandardDeck
{
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
  private Rank[] getRank(SuitType type)
  {
    Rank[] value = {
      Rank.BIG_JOKER,
      Rank.LITTLE_JOKER,
      Rank.DEUCE,
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
      Rank.THREE
    };

    switch (type)
    {
      case Hearts:
      case Clubs:
        value = new Rank[]
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
            Rank.THREE
          };
        break;
    }

    return value;
  }

  private void updateSuitRank(Suit suit)
  {
    if(null==suit)return;

    Rank[] faceValue = getRank(suit.getSuitType());

    suit.setRanks(faceValue);
  }
  //****************************************************************************************************
  //End - Private Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Protected Methods
  //****************************************************************************************************

  @Override
  protected void initialize()
  {
    super.initialize();

    Suit[] updateList =
      {
        getSuitByType(SuitType.Spades),
        getSuitByType(SuitType.Hearts),
        getSuitByType(SuitType.Clubs)
      };

    for (Suit suit : updateList)
    {
      updateSuitRank(suit);
    }
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
}