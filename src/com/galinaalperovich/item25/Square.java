package com.galinaalperovich.item25;

class Square extends Figure {
  private double myA;
  private double myXLeftTopCorner;
  private double myYLeftTopCorner;

  Square(double a, double xLeftTopCorner, double yLeftTopCorner) {
    myA = a;
    myXLeftTopCorner = xLeftTopCorner;
    myYLeftTopCorner = yLeftTopCorner;
  }

  @Override
  String getDescription() {
    return String.format(
        "Square: (a: %4.3f, x: %4.3f, y: %4.3f)",
        myA, myXLeftTopCorner, myYLeftTopCorner);
  }
}
