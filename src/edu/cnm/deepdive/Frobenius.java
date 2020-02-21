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
}
