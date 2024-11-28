package twodimensionalshape;

/**
 * Contains all calculations about poles.
 * The calculations are default methods, because the calculations are the same for each shape.
 */
public interface PolesCalculations {

  /**
   * Calculates the distance between the poles given a number of poles and a perimeter.
   *
   * @param perimeter  // The perimeter of the shape.
   * @param numberOfPoles // The number of available poles.
   * @return // The distance between the poles needed to divide them evenly.
   */
  default double getDistanceBetweenPoles(int perimeter, int numberOfPoles) {
    if (perimeter <= 0 || numberOfPoles <= 0) {
      throw new ArithmeticException("Can't divide by zero!");
    }
    return (double) perimeter / numberOfPoles;
  }


  /**
   *Calculates the number of poles needed given a perimeter and a distance between the poles.
   *
   * @param perimeter  // The perimeter of the shape.
   * @param distanceBetweenPoles // The distance between the poles needed to divide them evenly.
   * @return // The number of poles needed.
   */
  default double getNumberOfPolesNeeded(int perimeter, double distanceBetweenPoles) {
    if (perimeter <= 0 || distanceBetweenPoles <= 0) {
      throw new ArithmeticException("Can't divide by zero!");
    }
    return perimeter / distanceBetweenPoles;
  }

}
