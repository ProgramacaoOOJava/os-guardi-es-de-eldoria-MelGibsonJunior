package desafio;

public class Main {
    public static void main(String[] args) {
        
        // --- Instanciação e configuração do Primeiro Personagem ---
        Personagem heroi1 = new Personagem();
        heroi1.nome = "Arthemis";
        heroi1.classe = "Arqueira";
        heroi1.nivel = 5;
        heroi1.pontosDeVida = 80;
        heroi1.poderBase = 12.5;

        // --- Instanciação e configuração do Segundo Personagem ---
        Personagem heroi2 = new Personagem();
        heroi2.nome = "Ragnar";
        heroi2.classe = "Guerreiro";
        heroi2.nivel = 8;
        heroi2.pontosDeVida = 150;
        heroi2.poderBase = 22.0;

        // --- Exibição dos dados dos heróis no console ---
        System.out.println("--- STATUS DOS PERSONAGENS ---");
        System.out.println();
        
        heroi1.exibirStatus(); // Chama o método para a Arqueira
        heroi2.exibirStatus(); // Chama o método para o Guerreiro
    }
}

