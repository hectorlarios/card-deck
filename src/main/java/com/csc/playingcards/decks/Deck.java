package com.csc.playingcards.decks;

import com.csc.playingcards.cards.Card;
import com.csc.playingcards.cards.Rank;
import com.csc.playingcards.suits.Suit;
import com.csc.playingcards.suits.SuitType;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Deck
{
  //-------------------------
  //custom classes
  //-------------------------
  protected Suit[] suits;

  protected Rank[] cardRanks;
  //-------------------------
  //strings
  //-------------------------
  public final static String STANDARD = "Standard";
  public final static String PIQUET = "Piquet";
  public final static String PINOCHLE = "Pinochle";
  public final static String GHETTO_SPADES = "Ghetto Spades";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public Deck()
  {
    preInitialize();
    initialize();
    postInitialize();
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

  protected int totalSuits;
  public int getTotalSuits(){return totalSuits;}

  protected SuitType[] suitTypes;
  public SuitType[] getSuitTypes(){return suitTypes;}

  protected Card[] cards;
  public Card[] getCards(){return cards;}

  public String getCardsToString()
  {
    String value = Arrays.toString(cards);

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
    int i;

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
    createSuiteTypes();

    createCardRanks();
  }

  protected void initialize()
  {
    createSuites();
  }

  protected void postInitialize()
  {
    updateCards();
  }

  protected abstract void createSuiteTypes();

  protected abstract void createCardRanks();

  protected void createSuites()
  {
    int i;

    totalSuits = suitTypes.length;

    suits = new Suit[totalSuits];

    totalCards = totalSuits* cardRanks.length;

    SuitType suitName;

    Suit suit;

    cards = new Card[0];

    for (i = 0; i < totalSuits; i++)
    {
      suitName = suitTypes[i];

      suit = new Suit(suitName,cardRanks);

      suits[i] = suit;
    }
  }

  protected void updateCards()
  {
    cards = new Card[0];

    for (Suit suit : suits)
    {
      cards = mergeCards(suit.getCards(), cards);
    }
  }

  protected Suit getSuitByType(SuitType type)
  {
    Suit value = null;

    for (Suit suit : suits )
    {
      if(suit.getSuitType()==type)
      {
        value = suit;

        break;
      }
    }

    return value;
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

    for (Suit suit : suits)
    {
      value.append("\n   " + suit.getName()+": " + Arrays.toString(suit.getCards()));
    }

    value.append("\n   All Cards: " + getCardsToString());

    return value.toString();
  }
  //****************************************************************************************************
  //End - Public Methods
  //****************************************************************************************************			
}