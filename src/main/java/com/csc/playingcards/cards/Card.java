package com.csc.playingcards.cards;

public class Card
{
  //-------------------------
  //strings
  //-------------------------
  public final static String ALL_SUITS = "AllSuits";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public Card(String rank, String suitName, char symbol)
  {
    setRank(rank);

    setSuitName(suitName);

    setSymbol(symbol);
  }
  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Get/Set Methods
  //****************************************************************************************************
  private String rank = "n/a";
  public String getRank(){return rank;}
  public void setRank(String value)
  {
    if(null==value||value.equalsIgnoreCase(rank))return;

    rank = value;
  }

  private String suitName = "n/a";
  public String getSuitName(){return suitName;}
  public void setSuitName(String value)
  {
    if(null==value||value.equalsIgnoreCase(suitName))return;

    suitName = value;
  }

  private char symbol = ' ';
  public char getSymbol(){return symbol;}
  public void setSymbol(char value)
  {
    if('\u0000'==value||symbol==value)return;

    symbol = value;
  }
  //****************************************************************************************************
  //End - Get/Set Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Public Methods
  //****************************************************************************************************
  public String toString()
  {
    String value = rank+symbol;

    return value;
  }
  //****************************************************************************************************
  //End - Public Methods
  //****************************************************************************************************
}