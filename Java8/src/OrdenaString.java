import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        /*
         * Ordena a partir do length com expressão lambda
         */
        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(palavras + "\n");

        /*
         * Imprime com expressão lambda
         */
        palavras.forEach(System.out::println);

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}