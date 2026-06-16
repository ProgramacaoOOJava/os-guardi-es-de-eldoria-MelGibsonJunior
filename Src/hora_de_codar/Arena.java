package hora_de_codar;

import java.util.Collections;

public class Arena {

    public void batalharGrupos(Grupo g1, Grupo g2) {

        Collections.sort(g1.getMembros());
        Collections.sort(g2.getMembros());

        int quantidade = Math.min(
                g1.getMembros().size(),
                g2.getMembros().size()
        );

        System.out.println("\n================================");
        System.out.println("INÍCIO DAS BATALHAS");
        System.out.println("================================");

        for (int i = 0; i < quantidade; i++) {

            Personagem p1 = g1.getMembros().get(i);
            Personagem p2 = g2.getMembros().get(i);

            g1.batalhar(p1, p2);
        }
    }
}