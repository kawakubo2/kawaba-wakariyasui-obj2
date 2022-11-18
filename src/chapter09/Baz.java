package chapter09;

public class Baz extends Foo {
  @Override
  public double calc() {
    return getX() / 2;
  }
}
