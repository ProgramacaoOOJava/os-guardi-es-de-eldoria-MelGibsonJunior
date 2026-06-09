package desafio;

public class Mago extends Personagem {
    
    // Atributo específico do Mago
    private String magia;

    // Construtor do Mago
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, String magia) {
        // Inicializa a superclasse definindo a classe como "Mago"
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.magia = magia;
    }

    // Sobrescrita do método com o comportamento específico do Mago.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + this.nome + " lança " + this.magia + "!");
    }
}