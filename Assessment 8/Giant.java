// Zareef Amyeen
// 3.8.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 8
// Giant Critter that alternates between "fee" "fie" "foe" "fum"
// Infects, goes straight or turns right

import java.awt.*;
import java.util.*;

//Defines function for the Giant critter
public class Giant extends Critter{
   //int field that stores the number of moves the bear has made
   private int move;
   
   //Returns color of Giant (which is always Gray)
   public Color getColor(){
      return Color.GRAY;
   }
   
   //Alternates between fee fie foe fum every 6 moves
   public String toString(){
      String response = "feefiefoefum";
      return response.substring(move%24/6*3,(move%24/6+1)*3);
   }
   
   //gets Move of Giant from given info
   //Either infects, goes forward, or turns right
   public Action getMove(CritterInfo info){
      move++;
      if (info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY){
         return Action.HOP;
      }
      return Action.RIGHT;
   }
}