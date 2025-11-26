/**
 
 * This class represents a Rabbit Critter in the simulation.
 * The rabbit can evade foxes while managing its speed.
 * @author: Halleluya Almaw 
 * @version: 1.0 
 *
 */
 
import java.awt.*;

public class Rabbits extends Critter {
   private int speed;             //initial speed
   private int hoppingSpeed = 18; //hopping speed in mph
   private int runningSpeed = 38; //running speed in mph



   /**
    * Constructs a Rabbit critter with initial properties
    */
   public Rabbits() {
      this.speed = hoppingSpeed;
   }
   
   /**
    * Determines the Rabbit's movement based on its surroundings 
    * @param info Information regarding the Rabbit's surroundings
    * @return Returns the action of the Rabbit it'll take. either (LEFT, RIGHT, HOP)
    */
   @Override
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         this.speed = runningSpeed;
         return Action.LEFT;
      }
      
      else if (info.getFront() == Neighbor.WALL) {
         this.speed = hoppingSpeed;
         return Action.RIGHT;
      }
      
      else {
         this.speed = hoppingSpeed;
         return Action.HOP;
      }
   }
    
    /**
     * @return Returns the current speed of the rabbit (in mph)
     */
   public int getSpeed() {
      return speed;
   }
   
   /**
    * @return Returns a string representing the Rabbit as "R" in the simulation
    */
   @Override
   public String toString() {
      return "R";
   }
    
    /**
     * @returns Returns the color representing the Rabbit in the simulation
     */
   @Override
   public Color getColor() {
      return Color.WHITE;
   }
    

}
