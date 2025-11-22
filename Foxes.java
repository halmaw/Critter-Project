/**
 *
 * This class represents a Fox Critter in the simulation.
 * The fox can chase and eat(infect) rabbits, while increasing it's speed & managing its hunger level.
 * @author: Halleluya Almaw 
 * @version: 1.0 (11/2/2024)
 *
 */
 
import java.awt.*;

public class Foxes extends Critter {
   private int speed;             //initial speed
   private int walkingSpeed = 22; //walking speed in mph 
   private int chasingSpeed = 40; //chasing speed in mph

   private int hungerlvl;

   /**
    * Constructs a Fox critter with initial properties 
    * initial speed is set to walking speed, hunger level is set to 0
    */
   public Foxes() {
      this.speed = walkingSpeed;
      this.hungerlvl = 0;
   
   }
   /**
    * Determines the Fox's movement based on its surroundings 
    * hunger level will increase if it does not infect a Rabbit
    * @param info Information regarding the Fox's surroundings
    * @return Returns the action of the Fox it'll take. either (INFECT, LEFT, RIGHT, or HOP)
    */
   @Override
   public Action getMove(CritterInfo info) {
   
   
      if (info.getFront() == Neighbor.OTHER) {
         this.speed = chasingSpeed;   //speed increased because it is infront of a rabbit
         this.hungerlvl = 0;
         return Action.INFECT;
      }
      
      else if (info.getFront() == Neighbor.WALL) {
         this.speed = walkingSpeed; //speed decreased 
         this.hungerlvl++;          //hunger level increased
         return Action.RIGHT;
      }
      
      else if (info.getFront() == Neighbor.SAME) {
         this.speed = walkingSpeed; //speed decreased
         this.hungerlvl++;          //hunger level increased
         return Action.LEFT;
      
      }
      
      else {
         this.speed = walkingSpeed;
         this.hungerlvl++;
         return Action.HOP;
      }
   
   } 

   /**
    * @return Returns the current speed of the fox
    */
   public int getSpeed() {
      return this.speed;
   }
   
   /**
    * @return Returns the current hunger level of the fox
    */ 
   public int getHungerlvl() {
      return this.hungerlvl;
   }
    
  /**
    * @return Returns a string representing the Fox as "F" in the simulation
    */
   @Override
   public String toString() {
      return "F";
   }
  
  /**
    * @returns Returns the color representing the Fox in the simulation
    */
   @Override
     public Color getColor() {
      return Color.ORANGE;
   }
  
   
}

