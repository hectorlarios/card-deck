package com.csc.playingcards.decks;

import java.util.HashMap;

public class MagicTheGatheringDeck extends Deck
{
  //-------------------------
  //strings
  //-------------------------
  public final static String INSTANT = "Ins";
  public final static String SORCERY = "Sor";
  public final static String CREATURE = "Cre";
  public final static String ENCHANTMENT = "Enc";

  public final static String RED = "Red";
  public final static String BLUE = "Blue";
  public final static String WHITE = "White";
  public final static String BLACK = "Black";
  public final static String GREEN = "Green";

  private final String MAGIC_THE_GATHERING = "Magic: The Gathering";
  //****************************************************************************************************
  //Begin - Constructor
  //****************************************************************************************************	
  public MagicTheGatheringDeck()
  {
    name = MAGIC_THE_GATHERING;
  }

  //****************************************************************************************************
  //End  - Constructor
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Protected Methods
  //****************************************************************************************************
  @Override
  protected void createCardSuits()
  {
    suits = new String[]
      {
        RED,
        BLUE,
        WHITE,
        BLACK,
        GREEN
      };

    symbols = new HashMap<String, Character>();
    symbols.put(RED,'→');
    symbols.put(BLUE,'←');
    symbols.put(WHITE,'↑');
    symbols.put(BLACK,'↓');
    symbols.put(GREEN,'↘');
  }

  @Override
  protected void createCardRanks() {
    ranks = new HashMap<String, String[]>();
    ranks.put(RED,
      new String[]
        {
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT)
        }
    );
    ranks.put(BLUE,
      new String[]
        {
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT)
        }
    );
    ranks.put(WHITE,
      new String[]
        {
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT)
        }
    );
    ranks.put(BLACK,
      new String[]
        {
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT)
        }
    );
    ranks.put(GREEN,
      new String[]
        {
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT),
          getRandomRank(INSTANT),getRandomRank(SORCERY),getRandomRank(CREATURE),getRandomRank(ENCHANTMENT)
        }
    );
  }

  private String getRandomRank(String name)
  {
    String value = name + (int)(Math.random()*9999);

    return value;
  }
  //****************************************************************************************************
  //End - Protected Methods
  //****************************************************************************************************
  //****************************************************************************************************
  //Begin  - Public Methods
  //****************************************************************************************************

  //****************************************************************************************************
  //End - Public Methods
  //****************************************************************************************************			
}