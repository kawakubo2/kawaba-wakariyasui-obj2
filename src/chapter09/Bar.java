package chapter09;

public class Bar extends Foo {
  @Override
  public double calc() {
    return getX() * 2;
  }
}
