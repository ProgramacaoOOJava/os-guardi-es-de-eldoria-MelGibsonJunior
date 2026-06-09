package desafio;

public class Guerreiro extends Personagem {
    
    // Atributo específico do Guerreiro
    private String arma;

    // Construtor do Guerreiro
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String arma) {
        // Chamada ao construtor da superclasse (Personagem) usando super()
        // Repare que já passamos a string "Guerreiro" direto para o atributo "classe".
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    // A anotação @Override indica que estamos sobrescrevendo o método abstrato da superclasse.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + this.nome + " ataca com " + this.arma + "!");
    }
}