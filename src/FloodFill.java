import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FloodFill {
    private BufferedImage image;
    private int width;
    private int height;
    private ImgLoader imgLoader;

    public FloodFill(String caminho) throws IOException  {
        image = ImageIO.read(new File(caminho));
        width = image.getWidth();
        height = image.getHeight();
        this.imgLoader = new ImgLoader();
        imgLoader.display(image);
    }

    public void floodFillStack(int xInicial, int yInical, int corNova){
        int corInicial = image.getRGB(xInicial, yInical);
        Stack<Object> stack = new Stack<>();
        stack.push(new int[]{xInicial, yInical});
        System.out.println(corInicial);
    }

    public void teste(){
        imgLoader.display(image);
    }
}
