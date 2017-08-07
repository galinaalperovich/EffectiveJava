package com.galinaalperovich.item26;

import java.util.Objects;

public final class OrderedPair<E> {
  private final E myFirst;
  private final E mySecond;

  public OrderedPair(E first, E second) {
    myFirst = first;
    mySecond = second;
  }

  public static double sum(OrderedPair<Double> orderedPair) {
    return orderedPair.getFirst() + orderedPair.getSecond();
  }

  public static void main(String[] args) {
    OrderedPair<Double> firstPair = new OrderedPair<>(1.0, 0.0);
    OrderedPair<Double> secondPair = new OrderedPair<>(0.0, 1.0);
    System.out.println(sum(firstPair));
    System.out.println(String.format("%d != %d", firstPair.hashCode(), secondPair.hashCode()));
  }

  public E getFirst() {
    return myFirst;
  }

  public E getSecond() {
    return mySecond;
  }

  @Override
  public String toString() {
    return "OrderedPair {" +
        " myFirst=" + myFirst +
        ", mySecond=" + mySecond +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    OrderedPair<?> that = (OrderedPair<?>) o;
    return Objects.equals(myFirst, that.myFirst) && Objects.equals(mySecond, that.mySecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myFirst, mySecond);
  }
}

