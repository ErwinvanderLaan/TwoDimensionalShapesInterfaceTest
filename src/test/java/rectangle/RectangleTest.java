package rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

  // Tests for the getAreaMethod.
  /**
   * Test the 'getArea' method.
   * It should succeed if the method returns the right area.
   */
  @Test
  void areaIsTwentyFour () {
    Rectangle rectangle = new Rectangle(6, 4);
    assertEquals(24, rectangle.getArea());
  }

  /**
   * Test the getArithmetic exception from the if-clause.
   * It should succeed if the arithmetic exception is called.
   * Here the length is set to 0
   */
  @Test
  void objectHasNoArea () {
    Rectangle rectangle = new Rectangle(0, 4);
    assertThrows(ArithmeticException.class, () -> rectangle.getArea());
  }

  /**
   * Test the getArithmetic exception from the if-clause.
   * It should succeed if the arithmetic exception is called.
   * Here the width is set to 0
   */
  @Test
  void objectHasNoArea2 () {
    Rectangle rectangle = new Rectangle(4, 0);
    assertThrows(ArithmeticException.class, () -> rectangle.getArea());
  }

  /**
   * Test the getArithmetic exception from the else-if clause.
   * It should succeed if the arithmetic exception is called.
   * Here the length is set to 1
   */
  @Test
  void objectIsALine () {
    Rectangle rectangle = new Rectangle(1, 4);
    assertThrows(ArithmeticException.class, () -> rectangle.getArea());
  }

  /**
   * Test the getArithmetic exception from the else-if clause.
   * It should succeed if the arithmetic exception is called.
   * Here the width is set to 1
   */
  @Test
  void objectIsALine2 () {
    Rectangle rectangle = new Rectangle(4, 1);
    assertThrows(ArithmeticException.class, () -> rectangle.getArea());
  }

  /**
   * Test the getArithmetic exception from the second else-if clause.
   * It should succeed if the arithmetic exception is called.
   */
  @Test
  void ObjectIsASquare () {
    Rectangle rectangle = new Rectangle(2 ,2);
    assertThrows(ArithmeticException.class, () -> rectangle.getArea());
  }


  // Tests for the getPerimeter method.
  /**
   * Test the 'getPerimeter' method.
   * The test should succeed if the result is correct.
   */
  @Test
  void perimeterIsTwenty(){
    Rectangle rectangle = new Rectangle(6,4);
    assertEquals(20, rectangle.getPerimeter());
  }

}
