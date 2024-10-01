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

        scanner.close();


    }
}
