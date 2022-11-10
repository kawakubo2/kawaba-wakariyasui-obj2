package chapter04.sample4;

public final class Member {
    private final IdNumber id;
    private final String name;
    public Member(IdNumber id, String name) {
        this.id = new IdNumber((id.getNumber()));
        this.name = name;
    }
    public IdNumber getId() {
        return new IdNumber(id.getNumber());
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }
}
