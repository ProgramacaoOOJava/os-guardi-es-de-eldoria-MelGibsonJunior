package desafio;

public class Personagem {
    // Atributos que representam as características do herói
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Método para imprimir as informações formatadas no console
    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
        System.out.println(); // Linha em branco para separar os personagens na saída
    }
}
