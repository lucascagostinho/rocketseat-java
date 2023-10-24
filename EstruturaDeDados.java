import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Amanda");
        nomes.add("Clara");
        // 0 -
        // 1 -
        // 2 -
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));

        for (String nome : nomes) {
            System.out.println("O nome é: " + nome);
        }

        nomes.forEach(nome -> System.out.println("Novamente o nome é: " + nome));
    }
}
