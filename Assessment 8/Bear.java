// Zareef Amyeen
// 3.8.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 8
// Bear Critter that can either be a polar bear or normal bear
// Alternates backslash and forward slash
// Infects, goes straight or turns left

import java.awt.*;

//Defines function for the Bear Critter
public class Bear extends Critter{
   //boolean field that stores if the bear is polar or not
   private boolean polar;
   //int field that stores the number of moves the bear has made
   private int move;
   
   //Instantiates the object by declaring whether or not the object is polar
   public Bear(boolean polar){
      this.polar = polar;
   }
   
   //Gets color of Bear, white if polar, black if normal
   public Color getColor(){
      if (polar){
         return Color.WHITE;
      }
      return Color.BLACK;
   }
   
   //gets String of Bear which alternates between back slash and forward slash
   public String toString(){
      if (move % 2 == 0){
         return "/";
      }
      return "\\";
   }
   
   //gets Move of Bear from given info
   //Either infects, goes forward, or turns left
   public Action getMove(CritterInfo info){
      move++;
      if (info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY){
         return Action.HOP;
      }
      return Action.LEFT;
   }
}