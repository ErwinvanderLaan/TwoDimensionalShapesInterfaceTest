package main;

import rectangle.Rectangle;

/**
 * The main class.
 */
public class Main {

  /**
   * The main method.
   *
   * @param args // nothing special.
   */
  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    System.out.println("Rectangle fits: " + rectangle.getTimesFitsIn(rectangle)
        + " times in Rectangle1");
    System.out.println("Number of poles needed: "
        + rectangle.getNumberOfPolesNeeded(12, 2));
    System.out.println("Distance between poles: "
        + rectangle.getDistanceBetweenPoles(12, 6));
  }

}
