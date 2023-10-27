package primeirasaulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Dani", 9);
        notas.put("Vini", 10);
        notas.put("Elias", 10);
        notas.put("Elias", 5);

        var nota = notas.get("Dani");
        Integer nota2 = notas.get("Vini");
        System.out.println(nota);
        System.out.println(nota2);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + "e o valor é " + value);
        }
    }
}
