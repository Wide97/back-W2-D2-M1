package ESERCIZIO1;

import java.util.*;

public class ParolaManager {

    private List<String> parole;
    private Scanner scanner;

    public ParolaManager() {
        parole = new ArrayList<>();
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

    public void stampaParoleDuplicate() {
        Map<String, Integer> conteggio = new HashMap<>();
        for (String parola : parole) {
            conteggio.put(parola, conteggio.getOrDefault(parola, 0) + 1);
        }
        System.out.println("Parole duplicate: ");
        boolean trovatoDuplicati = false;

        for (Map.Entry<String, Integer> entry : conteggio.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                trovatoDuplicati = true;
            }
        }

        int numeroPaoleDistinte = conteggio.size();
        System.out.println("Numero di parole distinte: " + numeroPaoleDistinte);

        if (!trovatoDuplicati) {
            System.out.println("Nessun duplicato trovato");
        }
    }
}
