package chapter24.first.q24_1;

public class TShirt {
    public enum ItemSize { BIG, MEDIUM, SMALL }
    public enum Color { WHITE, GRAY, BLACK }
    private ItemSize size;
    private Color color;
    public TShirt(ItemSize size, Color color) {
        this.size = size;
        this.color = color;
    }
    public ItemSize getSize() {
        return size;
    }
    public void setSize(ItemSize size) {
        this.size = size;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "TShirt [size=" + size + ", color=" + color + "]";
    }
}
