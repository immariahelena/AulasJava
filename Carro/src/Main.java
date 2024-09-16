public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Davi Roque", 2, "155.486.789-00", "PE-56.785.678", "Rua Peixe, 15", "2593-4852", "davicrroque@gmail.com", "Brasileiro", "Solteiro", 0.75);
        Pessoa pessoa2 = new Pessoa("Cristiane Roque", 42, "557.264.321-15", "PE-91.852.371", "Rua Tubarão, 17", "9875-3642", "cristroque@gmail.com", "Brasileira", "Casada", 1.58);

        pessoa1.exibirInfo();
        pessoa2.exibirInfo();
    }
}