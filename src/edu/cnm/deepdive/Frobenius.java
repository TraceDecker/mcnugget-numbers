package edu.cnm.deepdive;

public class Frobenius {

  // Pack sizes are 6, 9, 20.
  public static boolean isMcNugget(int value) {
    // TODO Return value true if value can be expressed as the dum of integral multiples (including multiplication by zero.
    if (value < 0) {
      return false;
    }
    if (value == 0) {
      return true;
    }
    return isMcNugget(value - 20)
        || isMcNugget(value - 9)
        || isMcNugget(value - 6);
  }

  /**
   * Return true if the stated value can be formed as a sum of non-negative integral multiples of the elements of packSizes.
   * @param value target/goal number.
   * @param packSizes array of distinct positive pack sizes, in descending order.
   * @return true if value is a mcnugget number using the specified pack izes, false otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    return false; // TODO complete implementation for extra credit.
  }

}
