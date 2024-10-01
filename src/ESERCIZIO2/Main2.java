package ESERCIZIO2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        RandomNumberList lista = new RandomNumberList();
        StampaPosizioni stampaPosizioni = new StampaPosizioni();
        int N = 10;
        List<Integer> numeri = lista.generaNumeriCasuali(N);

        System.out.println("Lista ordinata di numeri casuali: ");
        System.out.println(numeri);

        ListaInvertita listaInvertita = new ListaInvertita();

        List<Integer> listaOriginale = new ArrayList<>();
        listaOriginale.add(1);
        listaOriginale.add(2);
        listaOriginale.add(3);
        listaOriginale.add(4);
        listaOriginale.add(5);
        listaOriginale.add(6);

        List<Integer> risultato = listaInvertita.Inverti(listaOriginale);

        System.out.println("Lista originale :" + listaOriginale);
        System.out.println("Lista invertita: " + risultato);

        System.out.println("Elementi in posizione pari: ");
        stampaPosizioni.stampaPosizioni(listaOriginale, true);

        System.out.println("Elementi in posizione dispari: ");
        stampaPosizioni.stampaPosizioni(listaOriginale, false);


    }

}
