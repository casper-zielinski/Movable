package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RobotTest {
      Robot robot;

      @BeforeEach
      void setUp() {
            robot = new Robot(10, 10, 3);
      }

      @Test
      @DisplayName("Test moveUp()")
      void testMoveUp() {
            robot.moveUp();
            assert(robot.toString().equals("Robot #0 (10, 13) \n"));
      }

      @Test
      @DisplayName("Test moveDown()")
      void testMoveDown() {
            robot.moveDown();
            assertEquals(robot.toString(), "Robot #0 (10, 7) \n");
      }

      @Test
      @DisplayName("Test moveLeft()")
      void testMoveLeft() {
            robot.moveLeft();
            assert(robot.toString().equals("Robot #0 (7, 10) \n"));
      }

      @Test
      @DisplayName("Test moveRight()")
      void testMoveRight() {
            robot.moveRight();
            assertEquals("Robot #0 (13, 10) \n", robot.toString());
      }




}
