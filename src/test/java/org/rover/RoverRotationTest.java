package org.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class RoverRotationTest {

    @Test
     void facingNorthRotateLeft() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("l");

        assertEquals(new Rover(0, 0, "W"), rover);
    }

    @Test
     void facingNorthRotateRight() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("r");

        assertEquals(new Rover(0, 0, "E"), rover);
    }

    @Test
     void facingSouthRotateLeft() {
        Rover rover = new Rover(0, 0, "S");

        rover.receive("l");

        assertEquals(new Rover(0, 0, "E"), rover);
    }

    @Test
     void facingSouthRotateRight() {
        Rover rover = new Rover(0, 0, "S");

        rover.receive("r");

        assertEquals(new Rover(0, 0, "W"), rover);
    }

    @Test
     void facingWestRotateLeft() {
        Rover rover = new Rover(0, 0, "W");

        rover.receive("l");

        assertEquals(new Rover(0, 0, "S"), rover);
    }

    @Test
     void facingWestRotateRight() {
        Rover rover = new Rover(0, 0, "W");

        rover.receive("r");

        assertEquals(new Rover(0, 0, "N"), rover);
    }

    @Test
     void facingEastRotateLeft() {
        Rover rover = new Rover(0, 0, "E");

        rover.receive("l");

        assertEquals(new Rover(0, 0, "N"), rover);
    }

    @Test
     void facingEastRotateRight() {
        Rover rover = new Rover(0, 0, "E");

        rover.receive("r");

        assertEquals(new Rover(0, 0, "S"), rover);
    }
}