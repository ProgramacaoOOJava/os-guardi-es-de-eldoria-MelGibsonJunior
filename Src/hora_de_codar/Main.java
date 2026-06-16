package hora_de_codar;

/**
 * Classe principal do sistema.
 *
 * Responsável por:
 * - criar os personagens
 * - criar os grupos
 * - adicionar personagens aos grupos
 * - iniciar as batalhas
 */
public class Main {

    /**
     * Método principal do programa.
     *
     * @param args argumentos da aplicação
     */
    public static void main(String[] args) {

        // Criação dos grupos
        Grupo grupoLuz = new Grupo();
        Grupo grupoSombras = new Grupo();

        // ==========================
        // PERSONAGENS DO GRUPO LUZ
        // ==========================

        grupoLuz.adicionarPersonagem(
                new Personagem("Elenara", 10, 30));

        grupoLuz.adicionarPersonagem(
                new Personagem("Arthas", 8, 25));

        grupoLuz.adicionarPersonagem(
                new Personagem("Luna", 7, 20));

        // =============================
        // PERSONAGENS DO GRUPO SOMBRAS
        // =============================

        grupoSombras.adicionarPersonagem(
                new Personagem("Drako", 9, 28));

        grupoSombras.adicionarPersonagem(
                new Personagem("Morgana", 11, 22));

        grupoSombras.adicionarPersonagem(
                new Personagem("Zarg", 6, 18));

        // Exibe os personagens do Grupo Luz
        System.out.println("GRUPO LUZ");
        grupoLuz.listarPersonagens();

        // Exibe os personagens do Grupo Sombras
        System.out.println("\nGRUPO SOMBRAS");
        grupoSombras.listarPersonagens();

        // Cria a arena
        Arena arena = new Arena();

        // Inicia as batalhas
        arena.batalharGrupos(
                grupoLuz,
                grupoSombras);
    }
}