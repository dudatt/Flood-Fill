import javax.swing.*;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {

            // Imagem com Stack
            FloodFill stackFloadFill = new FloodFill("src/base.png");
            stackFloadFill.floodFillQueue(100, 100, -65536);
            stackFloadFill.salvarImagem("src/output/stack-output.png");

            //Imagem com Queue
            //FloodFill queueFloaFill = new FloodFill("src/base.png");
            //queueFloaFill.floodFillQueue(100, 100, -65536);
            //queueFloaFill.salvarImagem("src/output/queue-output.png");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}