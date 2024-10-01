package ESERCIZIO2;

import java.util.ArrayList;
import java.util.List;

public class ListaInvertita {

    public List<Integer> Inverti(List<Integer> listaOriginale) {
        List<Integer> nuovaLista = new ArrayList<>();
        for (int i = listaOriginale.size() - 1; i >= 0; i--) {
            nuovaLista.add(listaOriginale.get(i));
        }
        return nuovaLista;
    }
}
