package ESERCIZIO2;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        RandomNumberList lista = new RandomNumberList();
        int N = 10;
        List<Integer> numeri = lista.generaNumeriCasuali(N);

        System.out.println("Lista ordinata di numeri casuali: ");
        System.out.println(numeri);
    }
}
