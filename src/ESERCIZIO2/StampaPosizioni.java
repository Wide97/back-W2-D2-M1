package ESERCIZIO2;

import java.util.List;

public class StampaPosizioni {

    public void stampaPosizioni(List<Integer> lista, boolean pari) {
        if (pari) {
            System.out.println("Elementi in posizioni pari : ");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("Elementi in posizioni dispari: ");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
