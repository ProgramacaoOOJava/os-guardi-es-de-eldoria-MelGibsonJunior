package hora_de_codar;

public class Personagem implements Comparable<Personagem> {

    private String nome;
    private int nivel;
    private int poderBase;

    public Personagem(String nome, int nivel, int poderBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public int calcularPoderTotal() {
        return nivel * poderBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               " | Nível: " + nivel +
               " | Poder Base: " + poderBase;
    }

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