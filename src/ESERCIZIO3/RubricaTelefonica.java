package ESERCIZIO3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);

    }
}
