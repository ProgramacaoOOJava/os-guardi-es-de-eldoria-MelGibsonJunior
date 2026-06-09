package desafio;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        // Estrutura de dados genérica que armazena objetos da superclasse Personagem
        ArrayList<Personagem> grupoDeHerois = new ArrayList<>();

        // Instanciando as subclasses específicas
        Personagem arthus = new Guerreiro("Arthus", 10, 150, 45.5, "Espada Flamejante");
        Personagem elenara = new Mago("Elenara", 12, 90, 80.0, "Bola de Fogo");

        // Adicionando os personagens na lista
        grupoDeHerois.add(arthus);
        grupoDeHerois.add(elenara);

        System.out.println("=== INÍCIO DA BATALHA ===\n");

        // Iterando sobre a estrutura genérica (Polimorfismo na prática)
        for (Personagem heroi : grupoDeHerois) {
            
            // Reaproveita o código comum para mostrar dados
            heroi.exibirStatus();
            
            // O Java sabe exatamente qual método "usarHabilidadeEspecial" chamar
            // dependendo de qual objeto foi instanciado (Guerreiro ou Mago)
            heroi.usarHabilidadeEspecial();
            
            System.out.println("\n-----------------------------------\n");
        }
        
        System.out.println("=== FIM DA BATALHA ===");
    }
}