// CSE 142 Homework 8 (Critters)
// Authors: Stuart Reges and Marty Stepp
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // uncomment each of these lines as you complete these classes
        frame.add(5, Bear.class);
        frame.add(5, Lion.class);
        frame.add(5, Giant.class);
        frame.add(5, Husky.class);

        frame.add(5, FlyTrap.class);
        frame.add(5, Food.class);

        frame.start();
    }
}
