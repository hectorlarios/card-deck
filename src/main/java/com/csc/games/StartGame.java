package com.csc.games;

import com.csc.playingcards.decks.Deck;
import com.csc.playingcards.decks.GhettoSpadesDeck;
import com.csc.playingcards.decks.PinochleDeck;
import com.csc.playingcards.decks.StandardDeck;
import com.csc.playingcards.decks.PiquetDeck;
import com.csc.playingcards.decks.MagicTheGatheringDeck;

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
    System.out.println(deck+"\n");

    System.out.println("All Cards:\n" + deck.getCardsToString()+"\n");

    deck.shuffleCards();

    System.out.println("Shuffled Cards:\n" + deck.getCardsToString()+"\n");

    System.out.println("Total cards: " + deck.getTotalCards() + "\n");
  }
  //****************************************************************************************************
  //End - Private Methods
  //****************************************************************************************************
}