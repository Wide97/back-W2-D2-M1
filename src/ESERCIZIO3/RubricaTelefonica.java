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

    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    public String cercaPerTelefono(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaPersone(String nome) {
        return contatti.get(nome);
    }
}
