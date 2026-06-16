package hora_de_codar;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe responsável por armazenar vários personagens.
 *
 * Um grupo pode:
 * - adicionar personagens
 * - listar personagens
 * - realizar batalhas individuais
 */
public class Grupo {

    // Lista de membros do grupo
    private ArrayList<Personagem> membros;

    /**
     * Construtor.
     * Inicializa a lista de personagens.
     */
    public Grupo() {
        membros = new ArrayList<>();
    }

    /**
     * Adiciona um personagem ao grupo.
     *
     * @param p Personagem que será inserido
     */
    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    /**
     * Exibe todos os personagens do grupo.
     *
     * Antes de listar, os personagens são ordenados por nível.
     */
    public void listarPersonagens() {

        Collections.sort(membros);

        System.out.println("\n=== MEMBROS DO GRUPO ===");

        for (Personagem p : membros) {
            System.out.println(p);
        }
    }

    /**
     * Retorna a lista de personagens.
     *
     * @return membros
     */
    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    /**
     * Realiza uma batalha entre dois personagens.
     *
     * O vencedor é definido pelo maior poder total.
     *
     * @param a Primeiro personagem
     * @param b Segundo personagem
     */
    public void batalhar(Personagem a, Personagem b) {

        int poderA = a.calcularPoderTotal();
        int poderB = b.calcularPoderTotal();

        System.out.println("\n-------------------------");
        System.out.println(a.getNome() + " VS " + b.getNome());

        if (poderA > poderB) {

            System.out.println(
                    a.getNome()
                    + " venceu! Poder total: "
                    + poderA);

        } else if (poderB > poderA) {

            System.out.println(
                    b.getNome()
                    + " venceu! Poder total: "
                    + poderB);

        } else {

            System.out.println(
                    "Empate! Ambos possuem poder total: "
                    + poderA);
        }
    }
}