package twodimensionalshape;

/**
 * This class defines the general features of each 2D object.
 */
public abstract class TwoDimensionalShape {
  private final double length;
  private final double width;

  /**
   *The shape class constructor.
   *
   * @param length  // The length of the shape.
   * @param width  // The width of the shape.
   */

  protected TwoDimensionalShape(double length, double width) {
    this.length = length;
    this.width = width;
  }


  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }
}
