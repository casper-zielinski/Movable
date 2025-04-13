package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MovablePointTest {

      private MovablePoint mv;

      @BeforeEach
      void setUp() {
            mv = new MovablePoint(3, 3, 2, 2);
      }
      
@Test
@DisplayName("Test MovablePoint toString")
public void testMovablePointToString() {
    assert(mv.toString().equals("(3, 3) speed = (2, 2) \n"));
}      

@Test
@DisplayName("Test MovablePoint Change Position")
public void testMovablePoint() {
    mv.moveDown();
    mv.moveLeft();
    System.out.println(mv.toString());
    assert(mv.toString().equals("(1, 1) speed = (2, 2) \n"));
}

}