package rectangle;

import twodimensionalshape.PolesCalculations;
import twodimensionalshape.ShapeCalculations;
import twodimensionalshape.TwoDimensionalShape;

/**
 * Creates the rectangle shape.
 */
public class Rectangle extends TwoDimensionalShape implements ShapeCalculations, PolesCalculations {

  /**
   * The Rectangle constructors.
   *
   * @param length // The length of the rectangle.
   * @param width // The width of the rectangle.
   */

  public Rectangle(double length, double width) {
    super(length, width);
  }


  @Override
  public double getArea() {
    if (getLength() <= 0 || getWidth() <= 0) {
      throw new ArithmeticException(
          "Calculation cancelled. Object has no area.");
    } else if (getLength() <= 1 || getWidth() <= 1) {
      throw new ArithmeticException(
          "Calculation cancelled. Object is not a rectangle, but a line.");
    } else if (getLength() == getWidth()) {
      throw new ArithmeticException(
          "Calculation cancelled. Object is not a rectangle, but a square.");
    }
    return getLength() * getWidth();
  }

  @Override
  public double getPerimeter() {
    if (getLength() <= 1 || getWidth() <= 1) {
      throw new ArithmeticException(
          "Calculation cancelled. Object is not a rectangle, but a line.");
    } else if (getLength() == getWidth()) {
      throw new ArithmeticException(
          "Calculation cancelled. Object is not a rectangle, but a square.");
    }
    return 2 * (getLength() + getWidth());
  }

  /**
   *The calculation to determine how many times a rectangle fits into another rectangle.
   *
   * @param rectangle  // The current rectangle.
   * @return // the number of times the current rectangle fits in rectangle 1.
   */
  public double getTimesFitsIn(Rectangle rectangle) {
    Rectangle rectangle1 = new Rectangle(6, 8);
    double areaRectangle = rectangle.getArea();
    double areaRectangle1 = rectangle1.getArea();
    return areaRectangle1 / areaRectangle;
  }
}
