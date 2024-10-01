package ESERCIZIO1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ParolaManager {

    private HashSet<String> parole;
    private Scanner scanner;

    public ParolaManager() {
        parole = new HashSet<>();
        scanner = new Scanner(System.in);
    }

    public void raccogliParole() {
        System.out.println("Inserisci un numero N intero per specificare quante parole inserire:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci la parola: " + (i + 1) + ":");
            String parola = scanner.nextLine();
            parole.add(parola);
        }
    }

    public void stampaParole() {
        Map<String, Integer> conteggio = new HashMap<>();
        boolean trovatoDuplicati = false;


        for (String parola : parole) {
            conteggio.put(parola, conteggio.getOrDefault(parola, 0) + 1);
        }


        System.out.println("Parole duplicate:");
        for (Map.Entry<String, Integer> entry : conteggio.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                trovatoDuplicati = true;
            }
        }

        int numeroPaoleDistinte = conteggio.size();
        System.out.println("Numero di parole distinte: " + numeroPaoleDistinte);

        System.out.println("Elenco delle parole distinte: ");
        for (String parola : parole) {
            System.out.println(parola);
        }

        if (!trovatoDuplicati) {
            System.out.println("Nessun duplicato trovato");
        }
    }
}
