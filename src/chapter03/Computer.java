package chapter03;

public class Computer {
    private String name;
    private int cores;
    public Computer(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }
    public Computer(String name) {
        this(name, 32);
    }
    public Computer() {
        this("M200");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        this.cores = cores;
    }
    @Override
    public String toString() {
        return "Computer [name=" + name + ", cores=" + cores + "]";
    }
}
