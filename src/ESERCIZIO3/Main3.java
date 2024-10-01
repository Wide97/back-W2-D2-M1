package ESERCIZIO3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Inserisci il nome (oppure premi 0 per terminare): ");
            String nome = scanner.nextLine();
            if (nome.equals("0")) {
                break;
            }

            System.out.print("Inserisci il numero di telefono: ");
            String telefono = scanner.nextLine();

            rubrica.aggiungiContatto(nome, telefono);
            System.out.println("Contatto aggiunto: " + nome + " - " + telefono);
        }


        while (true) {
            System.out.print("Vuoi rimuovere un contatto? (S/N): ");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("N")) {
                break;
            }
            System.out.print("Inserisci il nome del contatto da rimuovere: ");
            String nomeDaRimuovere = scanner.nextLine();
            rubrica.rimuoviContatto(nomeDaRimuovere);
            System.out.println("Contatto rimosso (se esistente).");
        }


        System.out.print("Inserisci il numero di telefono da cercare: ");
        String numeroDaCercare = scanner.nextLine();
        String nomeTrovato = rubrica.cercaPerTelefono(numeroDaCercare);
        if (nomeTrovato != null) {
            System.out.println("Il contatto con numero " + numeroDaCercare + " è " + nomeTrovato);
        } else {
            System.out.println("Nessun contatto trovato con il numero " + numeroDaCercare);
        }


        System.out.print("Inserisci il nome da cercare per il numero di telefono: ");
        String nomeDaCercare = scanner.nextLine();
        String numeroTrovato = rubrica.cercaPersone(nomeDaCercare);
        if (numeroTrovato != null) {
            System.out.println("Il numero di telefono di " + nomeDaCercare + " è " + numeroTrovato);
        } else {
            System.out.println("Nessun numero trovato per " + nomeDaCercare);
        }

        
        rubrica.stampaContatti();

        scanner.close();
    }
}
