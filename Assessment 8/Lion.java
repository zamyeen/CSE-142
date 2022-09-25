// 3.8.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 8
// Lion Critter that alternates between different colors
// Infects, goes left if wall, turns right if also lion, otherwise hops

import java.awt.*;
import java.util.*;

//Defines function for the Lion critter
public class Lion extends Critter{
   //int field that stores the number of moves the lion has made
   private int move;
   //Random object rand that generates random number to dictate color of lion
   private Random rand;
   //Color object that stores what the color of the lion is at a specific moment in time
   private Color color;
   
   //Lion constructor that instantiates a new random object and sets a random color
   public Lion(){
      rand = new Random();
      color = newColor();
   }
   
   //Returns color of the lion (which is predetermined in the getMove method or the constructor)
   public Color getColor(){
      return color;
   }
   
   //Returns string of the lion (which is always L)
   public String toString(){
      return "L";
   }
   
   //Gets move of Lion from given info
   //Either infects, turns left, turns right or goes straight
   public Action getMove(CritterInfo info){
      move++;
      if (move % 3 == 0){
         color = newColor();
      }
      if (info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
         return Action.LEFT;
      }else if (info.getFront() == Neighbor.SAME){
         return Action.RIGHT;
      }
      return Action.HOP;
   }
   
   //Determines Color of Lion which only changes in the constructor or every third move
   private Color newColor(){
      int num = rand.nextInt(3);
      if (num == 0){
         return Color.RED;
      } else if (num == 1){
         return Color.GREEN;
      }
      return Color.BLUE;
   }
}