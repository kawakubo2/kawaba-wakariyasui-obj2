package chapter18.first.q18_1_b;

record Member(int id, String name) {}

public class MyBiFunction implements BiFunction<Integer, Member, String> {
    @Override
    public String apply(Integer n, Member m) throws StringIndexOutOfBoundsException {
        return m.name().substring(n, n + 1);
    }
}
