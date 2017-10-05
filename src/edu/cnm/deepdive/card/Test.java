package edu.cnm.deepdive.card;

import java.util.Comparator;

public class Test {

  public static void main(String[] args) {

    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    deck.sort(new Comparator<Card>() {  @Override
      public int compare(Card card1, Card card2) {
        if (card1.rank != card2.rank) {
          return card1.rank.compareTo(card2.rank);
        }
        return card1.suit.compareTo(card2.suit);      }
    });;
    System.out.println(deck);

/*
lamabda expression explicit body and return
deck.sort((card1, card2) ->{
if (card1.rank != card2.rank) {
return card1.rank.compareTo(card2.rank);
}
return card1suit.compareTo(card2.suit);)};
deck.sort((card1, card2) -> (card1.rank != card2rank)
  ? card1.rank.compareTo(card2.rank)
  : card1suit.compareTo(card2.suit));
  system.out.print;(deck)
 ]


*/

  }};



////
//
//
//

// class AlternateSorter implements Comparator<Card> {
//
//
//  @Override
//  public int compare(Card card1, Card card2) {
//    if (card1.rank != card2.rank) {
//      return card1.rank.compareTo(card2.rank);
//    }
//    return card1.suit.compareTo(card2.suit);
//  }


