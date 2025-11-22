/**
 
 * This class represents a Rabbit Critter in the simulation.
 * The rabbit can evade foxes while managing its speed.
 * @author: Halleluya Almaw 
 * @version: 1.0 (11/2/2024)
 *
 */   


public class CritterMain {
   public static void main(String[] args) {
      CritterFrame frame = new CritterFrame(60, 40);
   
        // sub classes added here
        //30 critters from each species will be inside the grid
      frame.add(30, Rabbits.class);
      frame.add(30, Foxes.class);
   
      frame.start();
   }
}
