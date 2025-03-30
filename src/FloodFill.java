public class FloodFill {

<<<<<<< Updated upstream
=======
    public FloodFill(String caminho) throws IOException  {
        image = ImageIO.read(new File(caminho));
        this.imgLoader = new ImgLoader();
        imgLoader.display(image);
    }

    public void floodFillStack(int xInicial, int yInical, int corNova){
        int corInicial = image.getRGB(xInicial, yInical);
        System.out.println("Cor inicial: " + corInicial);

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{xInicial, yInical});
        int contPixel = 0;

        while (!stack.isEmpty()) {
            int[] pixel = stack.pop();
            int x = pixel[0];
            int y = pixel[1];

            if (limiteImagem(x, y) && corInicial == image.getRGB(x, y)) {
                image.setRGB(x, y, corNova);
                imgLoader.display(image);
                contPixel++;

                if (contPixel % 100 == 0) {
                    imgLoader.display(image);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                stack.push(new int[]{x, y + 1}); //Cima
                stack.push(new int[]{x, y -1}); //Baixo
                stack.push(new int[]{x + 1, y}); //Direita
                stack.push(new int[]{x - 1, y}); //Esquerda
            }
        }
    }

    public void floodFillQueue(int xInicial, int yInical, int corNova){
        int corInicial = image.getRGB(xInicial, yInical);
        System.out.println("Cor inicial: " + corInicial);

        Queue<int[]> queue = new Queue<>();
        queue.enqueue(new int[]{xInicial, yInical});
        int contPixel = 0;

        final int UPDATE_THRESHOLD = 500; // Atualiza a imagem a cada 500 pixels preenchidos

        while (!queue.isEmpty()) {
            int[] pixel = queue.dequeue();
            int x = pixel[0];
            int y = pixel[1];
            
            if (limiteImagem(x, y) && corInicial == image.getRGB(x,y)) {
                image.setRGB(x, y, corNova);
                contPixel++;

                if (contPixel % UPDATE_THRESHOLD == 0) {
                    imgLoader.display(image);
                    try {
                        Thread.sleep(10); // Atraso para visualização
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                queue.enqueue(new int[]{x, y + 1}); //Cima
                queue.enqueue(new int[]{x, y -1}); //Baixo
                queue.enqueue(new int[]{x + 1, y}); //Direita
                queue.enqueue(new int[]{x - 1, y}); //Esquerda
            }
        }
        imgLoader.display(image);
    }

    private boolean limiteImagem(int x, int y) {
        return x >= 0 && x < image.getWidth() &&
                y >= 0 && y < image.getHeight();
    }

    public void salvarImagem(String caminhoSaida) {
        try {
            File arquivoSaida = new File(caminhoSaida);
            ImageIO.write(image, "png", arquivoSaida);
            System.out.println("Imagem salva com sucesso em: " + caminhoSaida);
        } catch (IOException e) {
            System.out.println("Erro ao salvar a imagem: " + e.getMessage());
        }
    }
>>>>>>> Stashed changes
}
