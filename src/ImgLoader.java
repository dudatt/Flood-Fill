import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgLoader {
    private static JFrame frame;
    private static JPanel painel;
    private BufferedImage image;

    public void display(BufferedImage newImage) {
        this.image = newImage;
        if (frame == null) {
            frame = new JFrame("Imagem Flood Fill");
            painel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (image != null) {
                        g.drawImage(image, 0, 0, null);
                    }
                }
            };
            frame.add(painel);
            frame.setSize(image.getWidth(), image.getHeight());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } else {
            painel.repaint();
        }
    }

    public void carregarImg(String caminho) {
        try {
            File file = new File(caminho);
            BufferedImage newImage = ImageIO.read(file);

            if (newImage != null) {
                System.out.println("Imagem carregada com sucesso!");
                display(newImage); // Exibe a imagem automaticamente
            } else {
                System.out.println("Falha ao carregar a imagem.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }
}
