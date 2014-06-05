package com.csc.games;

import com.csc.playingcards.decks.*;

public class StartGame
{
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public static void main(String[] args)
  {
    Deck[] decks =
      {
        new GhettoSpadesDeck(),
        new StandardDeck(),
        new PinochleDeck(),
        new PiquetDeck(),
        new MagicTheGatheringDeck()
      };

    for (Deck deck : decks)
    {
      printDeck(deck);
    }
  }
  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Private Methods
  //****************************************************************************************************
  private static void printDeck(Deck deck)
  {
    System.out.println(deck);

    deck.shuffleCards();

    System.out.println("   Shuffled:  " + deck.getCardsToString());

    System.out.println("   Total cards: " + deck.getTotalCards() + "\n");
  }
  //****************************************************************************************************
  //End - Private Methods
  //****************************************************************************************************
}