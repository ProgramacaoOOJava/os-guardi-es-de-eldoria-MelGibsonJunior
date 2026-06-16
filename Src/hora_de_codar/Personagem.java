package hora_de_codar;

/**
 * Classe responsável por representar um personagem do jogo.
 *
 * Cada personagem possui:
 * - nome
 * - nível
 * - poder base
 *
 * Implementa Comparable para permitir ordenação por nível.
 */
public class Personagem implements Comparable<Personagem> {

    // Nome do personagem
    private String nome;

    // Nível do personagem
    private int nivel;

    // Poder base utilizado no cálculo de batalha
    private int poderBase;

    /**
     * Construtor da classe Personagem.
     *
     * @param nome Nome do personagem
     * @param nivel Nível do personagem
     * @param poderBase Poder base do personagem
     */
    public Personagem(String nome, int nivel, int poderBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.poderBase = poderBase;
    }

    /**
     * Retorna o nome do personagem.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o nível do personagem.
     *
     * @return nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Retorna o poder base do personagem.
     *
     * @return poderBase
     */
    public int getPoderBase() {
        return poderBase;
    }

    /**
     * Calcula o poder total do personagem.
     *
     * Fórmula exigida pelo exercício:
     *
     * poderTotal = nivel * poderBase
     *
     * @return poder total calculado
     */
    public int calcularPoderTotal() {
        return nivel * poderBase;
    }

    /**
     * Define como o objeto será exibido ao usar System.out.println().
     */
    @Override
    public String toString() {
        return "Nome: " + nome
                + " | Nível: " + nivel
                + " | Poder Base: " + poderBase;
    }

    /**
     * Método utilizado pela interface Comparable.
     *
     * Permite ordenar personagens pelo nível.
     *
     * Retorna:
     * -1 -> menor
     *  0 -> igual
     *  1 -> maior
     */
    @Override
    public int compareTo(Personagem outro) {

        if (this.nivel < outro.nivel) {
            return -1;
        } else if (this.nivel > outro.nivel) {
            return 1;
        }

        return 0;
    }
}