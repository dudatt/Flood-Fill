# FloodFill Algorithm Implementation

## Sobre o Projeto

Este projeto implementa o algoritmo FloodFill em Java utilizando duas estruturas de dados diferentes: pilha (Stack) e fila (Queue). O algoritmo FloodFill é amplamente utilizado em editores gráficos para preencher áreas conectadas com uma cor específica, similar à ferramenta "balde de tinta".

## Algoritmo FloodFill

O FloodFill é um algoritmo que determina a área conectada a um determinado nó em uma matriz multidimensional. Começando de um ponto inicial, o algoritmo "inunda" a área conectada até encontrar limites definidos.

### Aplicações Comuns:
- Editores de imagem (ferramenta de preenchimento)
- Coloração de mapas e gráficos

## Implementações

Este projeto contém duas implementações do algoritmo FloodFill:

### 1. Implementação com Pilha (Stack)

A implementação baseada em pilha usa o princípio LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser processado.

### 2. Implementação com Fila (Queue)

A implementação baseada em fila usa o princípio FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser processado.


```java
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
```

## Diferenças entre Pilha e Fila em Java

### Pilha (Stack)
- **Princípio**: LIFO (Last In, First Out)
- **Operações principais**: `push()` (adicionar), `pop()` (remover), `peek()` (consultar topo)
- **Implementação em Java**: Classe `Stack` ou `Deque` interface
- **Comportamento**: Processa os vizinhos mais recentes primeiro, resultando em uma busca em profundidade (DFS)

### Fila (Queue)
- **Princípio**: FIFO (First In, First Out)
- **Operações principais**: `offer()/add()` (adicionar), `poll()/remove()` (remover), `peek()` (consultar início)
- **Implementação em Java**: Interface `Queue` implementada por classes como `LinkedList`, `ArrayDeque` 
- **Comportamento**: Processa os vizinhos na ordem em que foram descobertos, resultando em uma busca em largura (BFS)

### Impacto no FloodFill

A escolha entre pilha e fila afeta o padrão de preenchimento do algoritmo:

- **Pilha (Stack)**: O preenchimento tende a seguir um caminho único até o fim antes de retroceder (busca em profundidade). Isso pode resultar em um padrão de preenchimento mais "serpenteante".

- **Fila (Queue)**: O preenchimento ocorre em "ondas" a partir do ponto inicial, preenchendo primeiro todos os pontos adjacentes antes de avançar (busca em largura). Isso resulta em um padrão de preenchimento mais uniforme e concêntrico.

## Contribuidores
- [Jun](https://github.com/julia-tatim)
- [Dudão](https://github.com/dudatt)
- [Lau](https://github.com/kyoulau)


## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
