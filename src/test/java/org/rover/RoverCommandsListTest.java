package org.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class RoverCommandsListTest {

    @Test
     void noCommands() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("");

        assertEquals(new Rover(0, 0, "N"), rover);
    }

    @Test
     void twoCommands() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("lf");

        assertEquals(new Rover(-1, 0, "W"), rover);
    }

    @Test
     void manyCommands() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("ffrbbrfflff");

        assertEquals(new Rover(0, 0, "E"), rover);
    }
}