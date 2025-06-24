package org.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class RoverPositionTest {

    @Test
     void facingNorthMoveForward() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("f");

        assertEquals(new Rover(0, 1, "N"), rover);
    }

    @Test
     void facingNorthMoveBackward() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("b");

        assertEquals(new Rover(0, -1, "N"), rover);
    }

    @Test
     void facingSouthMoveForward() {
        Rover rover = new Rover(0, 0, "S");

        rover.receive("f");

        assertEquals(new Rover(0, -1, "S"), rover);
    }

    @Test
     void facingSouthMoveBackward() {
        Rover rover = new Rover(0, 0, "S");

        rover.receive("b");

        assertEquals(new Rover(0, 1, "S"), rover);
    }

    @Test
     void facingWestMoveForward() {
        Rover rover = new Rover(0, 0, "W");

        rover.receive("f");

        assertEquals(new Rover(-1, 0, "W"), rover);
    }

    @Test
     void facingWestMoveBackward() {
        Rover rover = new Rover(0, 0, "W");

        rover.receive("b");

        assertEquals(new Rover(1, 0, "W"), rover);
    }

    @Test
     void facingEastMoveForward() {
        Rover rover = new Rover(0, 0, "E");

        rover.receive("f");

        assertEquals(new Rover(1, 0, "E"), rover);
    }

    @Test
     void facingEastMoveBackward() {
        Rover rover = new Rover(0, 0, "E");

        rover.receive("b");

        assertEquals(new Rover(-1, 0, "E"), rover);
    }
}