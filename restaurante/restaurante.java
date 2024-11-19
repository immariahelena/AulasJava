import java.util.ArrayList;
import java.util.Scanner;

public class restaurante {
    static class Prato {
        private String nome;
        private double preco;

        public Prato(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return nome + " - R$ " + String.format("%.2f", preco);
        }
    }

    public static void main(String[] args) {
        ArrayList<Prato> cardapio = new ArrayList<>();
        ArrayList<Prato> carrinho = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        cardapio.add(new Prato("Hambúrguer", 15.00));
        cardapio.add(new Prato("Pizza", 30.00));
        cardapio.add(new Prato("Salada", 12.00));
        cardapio.add(new Prato("Refrigerante", 5.00));
        cardapio.add(new Prato("Sobremesa", 10.00));

        int opcao;
        do {
            System.out.println("\n--- Bem-vindo ao Restaurante ---");
            System.out.println("1. Ver Cardápio");
            System.out.println("2. Selecionar Pedido");
            System.out.println("3. Ver Carrinho");
            System.out.println("4. Finalizar Pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cardápio ---");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i + 1) + ". " + cardapio.get(i));
                    }
                    break;

                case 2:
                    System.out.println("\n--- Selecionar Pedido ---");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println((i + 1) + ". " + cardapio.get(i));
                    }
                    System.out.print("Digite o número do prato que deseja adicionar ao carrinho (0 para voltar): ");
                    int escolha = scanner.nextInt();
                    if (escolha > 0 && escolha <= cardapio.size()) {
                        carrinho.add(cardapio.get(escolha - 1));
                        System.out.println(cardapio.get(escolha - 1).getNome() + " adicionado ao carrinho!");
                    } else if (escolha != 0) {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Carrinho ---");
                    if (carrinho.isEmpty()) {
                        System.out.println("O carrinho está vazio.");
                    } else {
                        double total = 0;
                        for (Prato prato : carrinho) {
                            System.out.println(prato);
                            total += prato.getPreco();
                        }
                        System.out.println("Total: R$ " + String.format("%.2f", total));
                    }
                    break;

                case 4:
                    System.out.println("\n--- Finalizar Pedido ---");
                    if (carrinho.isEmpty()) {
                        System.out.println("O carrinho está vazio. Não é possível finalizar o pedido.");
                    } else {
                        System.out.println("Seu pedido foi finalizado com sucesso!");
                        double total = 0;
                        for (Prato prato : carrinho) {
                            total += prato.getPreco();
                        }
                        System.out.println("Valor total: R$ " + String.format("%.2f", total));
                        carrinho.clear();
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por visitar nosso restaurante!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
