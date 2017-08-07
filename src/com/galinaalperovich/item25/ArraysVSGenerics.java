package com.galinaalperovich.item25;

import java.util.ArrayList;
import java.util.List;

public class ArraysVSGenerics {

  private static void printFiguresArray(Figure[] figures) {
    for (Figure figure : figures) {
      System.out.println(figure.getDescription());
    }
  }

  private static void printFiguresList(List<Figure> figures) {
    for (Figure figure : figures) {
      System.out.println(figure.getDescription());
    }
  }

  private static void replaceFirstWithSquaresInArray(Figure[] figures) {
    figures[0] = new Square(4, 0, 0);
  }

  private static void replaceFirstWithSquaresInList(List<Figure> figures) {
    figures.set(0, new Square(4, 0, 0));
  }

  public static void main(String[] args) {
    // 1
    System.out.println("Arrays are covariant -> prints well");
    Circle[] circlesArray = new Circle[4];
    circlesArray[0] = new Circle(1.5, 0, 0);
    circlesArray[1] = new Circle(2.5, 0, 1);
    circlesArray[2] = new Circle(3.5, 1, 0);
    circlesArray[3] = new Circle(4.5, 1, 1);
    printFiguresArray(circlesArray);

    // 2
    try {
      replaceFirstWithSquaresInArray(circlesArray);
    } catch (ArrayStoreException e) {
      System.out.println("Arrays are reified -> java.lang.ArrayStoreException");
    }

    // 3
    System.out.println("Generics are invariant -> Compilation error java: incompatible types");
    List<Circle> circlesList = new ArrayList<>();
    circlesList.add(new Circle(1.5, 0, 0));
    circlesList.add(new Circle(2.5, 0, 1));
    circlesList.add(new Circle(3.5, 1, 0));
    circlesList.add(new Circle(4.5, 1, 1));
    //printFiguresList(circlesList);

    // 4
    System.out.println("Generic array creation -> can't use new List<Circle>[10]");
    //List<Circle>[] arrayOfListsOfCircles = new List<Circle>[10];

  }
}
