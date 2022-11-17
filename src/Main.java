import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Integer> n =new Box<>(23);

        Box box = Box.toBox("nsndfks");
        System.out.println(box);
        System.out.println(Box.toBox(n));
    }
}