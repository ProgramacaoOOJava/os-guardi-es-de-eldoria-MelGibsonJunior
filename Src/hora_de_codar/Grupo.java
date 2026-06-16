package hora_de_codar;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo {

    private ArrayList<Personagem> membros;

    public Grupo() {
        membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    public void listarPersonagens() {

        Collections.sort(membros);

        System.out.println("\n=== MEMBROS DO GRUPO ===");

        for (Personagem p : membros) {
            System.out.println(p);
        }
    }

    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    public void batalhar(Personagem a, Personagem b) {

        int poderA = a.calcularPoderTotal();
        int poderB = b.calcularPoderTotal();

        System.out.println("\n---------------------------");
        System.out.println(a.getNome() + " VS " + b.getNome());

        if (poderA > poderB) {

            System.out.println(
                a.getNome() +
                " venceu! Poder total: " + poderA
            );

        } else if (poderB > poderA) {

            System.out.println(
                b.getNome() +
                " venceu! Poder total: " + poderB
            );

        } else {

            System.out.println(
                "Empate! Ambos possuem poder total: "
                + poderA
            );
        }
    }
}