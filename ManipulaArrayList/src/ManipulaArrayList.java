import java.util.ArrayList;

public class ManipulaArrayList {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Icaro");
        nomes.add("Talles");
        nomes.add("Helena");

        nomes.remove(1);

        System.out.println("Nomes após remover o segundo nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(2);

        System.out.println("\nNomes após remover o terceiro nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (!nomes.isEmpty() && "Talles".equals(nomes.get(0))) {
            System.out.println("\nO primeiro nome é Talles.");
        } else {
            System.out.println("\nO primeiro nome não é Talles.");
        }
    }
}