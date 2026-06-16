package hora_de_codar;

public class Main {

    public static void main(String[] args) {

        Grupo grupoLuz = new Grupo();
        Grupo grupoSombras = new Grupo();

        // Grupo Luz

        grupoLuz.adicionarPersonagem(
                new Personagem("Elenara", 10, 30));

        grupoLuz.adicionarPersonagem(
                new Personagem("Arthas", 8, 25));

        grupoLuz.adicionarPersonagem(
                new Personagem("Luna", 7, 20));

        // Grupo Sombras

        grupoSombras.adicionarPersonagem(
                new Personagem("Drako", 9, 28));

        grupoSombras.adicionarPersonagem(
                new Personagem("Morgana", 11, 22));

        grupoSombras.adicionarPersonagem(
                new Personagem("Zarg", 6, 18));

        System.out.println("GRUPO LUZ");
        grupoLuz.listarPersonagens();

        System.out.println("\nGRUPO SOMBRAS");
        grupoSombras.listarPersonagens();

        Arena arena = new Arena();

        arena.batalharGrupos(
                grupoLuz,
                grupoSombras
        );
    }
}