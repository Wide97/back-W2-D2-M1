package ESERCIZIO1;

import java.util.ArrayList;
import java.util.Scanner;

public class ParolaManager {

    private ArrayList<String> parole;
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

    public void stampaParole() {
        System.out.println("Le parole inserite sono:");
        for (String parola : parole) {
            System.out.println(parola);
        }
    }
}
