package hora_de_codar;

import java.util.Collections;

/**
 * Classe responsável por organizar batalhas
 * entre dois grupos de personagens.
 */
public class Arena {

    /**
     * Realiza batalhas entre dois grupos.
     *
     * Os personagens são ordenados por nível.
     * Em seguida ocorre:
     *
     * Personagem 1 VS Personagem 1
     * Personagem 2 VS Personagem 2
     * Personagem 3 VS Personagem 3
     *
     * @param g1 Grupo 1
     * @param g2 Grupo 2
     */
    public void batalharGrupos(Grupo g1, Grupo g2) {

        Collections.sort(g1.getMembros());
        Collections.sort(g2.getMembros());

        int quantidade = Math.min(
                g1.getMembros().size(),
                g2.getMembros().size());

        System.out.println("\n===============================");
        System.out.println("INÍCIO DAS BATALHAS");
        System.out.println("===============================");

        for (int i = 0; i < quantidade; i++) {

            Personagem p1 = g1.getMembros().get(i);
            Personagem p2 = g2.getMembros().get(i);

            g1.batalhar(p1, p2);
        }
    }
}