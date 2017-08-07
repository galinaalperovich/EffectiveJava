package com.galinaalperovich.item25;

final class Circle extends Figure {
  private final double myRadius;
  private final double myX;
  private final double myY;

  Circle(double radius, double x, double y) {
    myRadius = radius;
    myX = x;
    myY = y;
  }

  @Override
  String getDescription() {
    return String.format(
        "Circle: (Radius: %4.3f, x: %4.3f, y: %4.3f)",
        myRadius, myX, myY);
  }
}
