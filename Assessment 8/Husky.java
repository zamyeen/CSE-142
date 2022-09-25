import java.awt.*;
import java.util.*;

public class Husky extends Critter{
   private int move;
   private boolean corner;
   private int pastCornerMove;
   private Color color;
   
   public Husky(){
      corner = false;
      Random rand = new Random();
      int num = rand.nextInt(5);
      if (num == 0){
         color = Color.WHITE;
      } else if (num == 1){
         color = Color.BLACK;
      } else if (num == 2){
         color = Color.GRAY; 
      } else if (num == 3){
         color = Color.LIGHT_GRAY;
      } else {
         color = Color.DARK_GRAY;
      }
   }
         
   public Color getColor(){
      return color;
   }
   
   public String toString(){
      return "∆";
   }
   
   public Action getMove(CritterInfo info){
      move++;
      if (info.leftThreat()){
         return Action.HOP;
      } else if (info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY){
         if (info.getDirection() == Direction.SOUTH || info.getDirection() == Direction.EAST){
            return Action.HOP;
         } else{
            if (corner){
               if (pastCornerMove == 0){
                  pastCornerMove = 1;
                  return Action.LEFT;
               } else if (pastCornerMove == 1){
                  pastCornerMove = 2;
                  return Action.INFECT;
               }
               pastCornerMove = 0;
               return Action.RIGHT;
            } else if (info.getDirection() == Direction.WEST){
               return Action.LEFT;
            } else {
               return Action.RIGHT;
            }
         }
      } else if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME){
         if (info.getRight() == Neighbor.WALL || info.getRight() == Neighbor.SAME){
            if (info.getDirection() == Direction.NORTH){
               pastCornerMove = 0;
            } else if (info.getDirection() == Direction.WEST){
               pastCornerMove = 2;
            }
            corner = true;
            return Action.LEFT;
         }
         if (info.getDirection() == Direction.SOUTH || info.getDirection() == Direction.WEST){
            return Action.LEFT;
         }
         return Action.RIGHT;
      }
      return Action.HOP;
   }
  
}