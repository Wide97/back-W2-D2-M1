package ESERCIZIO2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumberList {

    public List<Integer> generaNumeriCasuali(int N) {
        List<Integer> numeriCasuali = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int numero = random.nextInt(101);
            numeriCasuali.add(numero);
        }

        Collections.sort(numeriCasuali);
        return numeriCasuali;
    }
}
