package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Deck
{
  //-------------------------
  //collections
  //-------------------------
  protected String[] suits;

  protected HashMap<String,Character> symbols;

  protected HashMap<String,String[]> ranks;
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public Deck()
  {
    preInitialize();
    initialize();
  }
  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Get/Set Methods
  //****************************************************************************************************
  protected String name;
  public String getName() {return name;}

  protected int totalCards;
  public int getTotalCards(){return totalCards;}

  protected Card[] cards;
  public Card[] getCards(){return cards;}

  public String getCardsToString()
  {
    String value = Arrays.toString(cards);

    return value;
  }

  public Card[] getCardsBySuit(String suit)
  {
    ArrayList<Card> list = new ArrayList<Card>();

    for(Card card : cards)
    {
      if(card.getSuitName().equalsIgnoreCase(suit))list.add(card);
    }

    Card[] value = list.toArray(new Card[list.size()]);

    return value;
  }
  //****************************************************************************************************
  //End - Get/Set Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Private Methods
  //****************************************************************************************************
  private Card[] mergeCards(Card[] sourceA, Card[] sourceB)
  {
    int l = sourceB.length;

    Card[] value = Arrays.copyOf(sourceB, l+sourceA.length);

    for(Card card : sourceA)
    {
      value[l++] = card;
    }

    return value;
  }
  //****************************************************************************************************
  //End - Private Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Protected Methods
  //****************************************************************************************************
  protected void preInitialize()
  {
    createCardSuits();

    createCardRanks();
  }

  protected void initialize()
  {
    createCards();
  }

  protected abstract void createCardSuits();

  protected abstract void createCardRanks();

  protected void createCards()
  {
    char symbol;

    String[] rankValue;

    ArrayList<Card> temp;

    cards = new Card[0];

    for (String suit : suits)
    {
      symbol = symbols.get(suit);

      rankValue = ranks.get(suit);

      if (rankValue == null)
      {
        rankValue = ranks.get(Card.ALL_SUITS);
      }

      temp = new ArrayList<Card>();

      for (String rank : rankValue)
      {
        temp.add(new Card(rank, suit, symbol));
      }

      cards = mergeCards(temp.toArray(new Card[temp.size()]), cards);
    }

    totalCards = cards.length;
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Public Methods
  //****************************************************************************************************
  public void shuffleCards()
  {
    int i;

    int l = cards.length;

    ArrayList<Integer> randomList = new ArrayList<Integer>();

    while (randomList.size()<l)
    {
      i = (int) Math.floor(Math.random()*l);

      if(!randomList.contains(i))randomList.add(i);
    }

    Card[] old = Arrays.copyOf(cards, cards.length);

    for(i = 0; i < l; i++)
    {
      cards[i] = old[randomList.get(i)];
    }
  }

  public String toString()
  {
    StringBuilder value = new StringBuilder(name+" Deck: ");

    Card[] suitCards;

    for (String suit : suits)
    {
      value.append("\n   " + suit + ": ");

      suitCards = getCardsBySuit(suit);

      if(suitCards!=null&&suitCards.length>0)value.append(Arrays.toString(suitCards));
    }

    value.append("\n   All Cards: " + getCardsToString());

    return value.toString();
  }
  //****************************************************************************************************
  //End - Public Methods
  //****************************************************************************************************			
}