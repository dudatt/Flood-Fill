import javax.swing.*;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            FloodFill stack = new FloodFill("src/base.png");
//            stack.floodFillStack(100, 100, -65536);
            stack.floodFillQueue(100, 100, -65536);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}