package desafio;

// A classe agora é abstrata. Ela não pode ser instanciada diretamente com "new Personagem()".
public abstract class Personagem {
    
    // Visibilidade protected permite que as subclasses acessem os atributos diretamente.
    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    // Construtor da superclasse para inicializar os atributos de forma segura e padronizada.
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método abstrato: não possui corpo. 
    // Ele obriga que toda subclasse concreta implemente sua própria versão deste ataque.
    public abstract void usarHabilidadeEspecial();

    // Método concreto: reaproveitado por todas as subclasses para exibir as informações.
    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
    }
}