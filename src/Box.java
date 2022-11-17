import java.util.Objects;

public class Box <T>{
    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    static   <E> Box toBox(E n){
            Box<E> newBox = new Box<>(n);
            return newBox;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
