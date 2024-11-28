package twodimensionalshape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import rectangle.Rectangle;

class PolesCalculationsTest {

  Rectangle rectangle = new Rectangle(4, 6);

  // Tests for the 'getNumberOfPolesNeeded' method.

  /**
   * Test for the 'getNumberOfPolesNeeded' method.
   * It should succeed if the method returns the right number of poles.
   */
  @Test
  void getTheRightNumberOfPoles(){
    assertEquals(5, rectangle.getNumberOfPolesNeeded(20, 4));
  }

  /**
   *Test for the 'getNumberOfPolesNeeded' method.
   * It should succeed if the Arithmetic Exception clause is activated.
   * Here the perimeter is set to zero.
   */
  @Test
  void getTheArithmeticExceptionNumberOfPoles(){
    assertThrows(ArithmeticException.class, () -> rectangle.getNumberOfPolesNeeded(0,1));
  }

  /**
   *Test for the 'getNumberOfPolesNeeded' method.
   * It should succeed if the Arithmetic Exception clause is activated.
   * Here the distance between poles is set to zero.
   */
  @Test
  void getTheArithmeticExceptionNumberOfPoles2(){
    assertThrows(ArithmeticException.class, () -> rectangle.getNumberOfPolesNeeded(1,0));
  }

  // Tests for the 'getDistanceBetweenPoles' method.

  /**
   * Test for the 'getDistanceBetweenPoles' method.
   * It should succeed if it returns the right distance.
   */
  @Test
  void getTheRightDistanceBetweenPoles(){
    assertEquals(4, rectangle.getDistanceBetweenPoles(20,5));
  }

  /**
   * Test for the 'getDistanceBetweenPoles' method.
   * It should succeed if the Arithmetic Exception clause is activated.
   * Here the number of poles is set to zero.
   */
  @Test
  void getTheArithmeticExceptionDistanceBetweenPoles (){
    assertThrows(ArithmeticException.class, () -> rectangle.getDistanceBetweenPoles(1,0));
  }

  /**
   * Test for the 'getDistanceBetweenPoles' method.
   * It should succeed if the Arithmetic Exception clause is activated.
   * Here the perimeter is set to zero.
   */
  @Test
  void getTheArithmeticExceptionDistanceBetweenPoles2 (){
    assertThrows(ArithmeticException.class, () -> rectangle.getDistanceBetweenPoles(0,1));
  }
}