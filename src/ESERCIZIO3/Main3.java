package ESERCIZIO3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = scanner.nextLine();
        System.out.println("inserisci il telefono: ");
        String telefono = scanner.nextLine();

        rubrica.aggiungiContatto(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " - " + telefono);

        System.out.println("Inserisci il nome del contatto da rimuovere: ");
        String nomeDaRimuovere = scanner.nextLine();
        rubrica.rimuoviContatto(nomeDaRimuovere);
        System.out.println("COntatto rimosso (se esistente) ");

        System.out.println("Inserisci il numero da cercare: ");
        String numeroDaCercare = scanner.nextLine();
        String nomeTrovato = rubrica.cercaPerTelefono(numeroDaCercare);
        if (nomeTrovato != null) {
            System.out.println("Il contatto con numero " + numeroDaCercare + " è " + nomeTrovato);
        } else {
            System.out.println("Nessun contatto trovato con numero: " + numeroDaCercare);
        }

        scanner.close();


    }
}
