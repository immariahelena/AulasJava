public class Carro {

        private String marca;
        private String modelo;
        private int ano;
        private String cor;
        private double preco;
        private int velocidadeMaxima;
        private boolean automatico;
        private int numeroPortas;

        public Carro() {
        }

        public Carro(String marca, String modelo, int ano, String cor) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.cor = cor;
        }

        public Carro(String marca, String modelo, int ano, String cor, double preco, int velocidadeMaxima, boolean automatico, int numeroPortas) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.cor = cor;
            this.preco = preco;
            this.velocidadeMaxima = velocidadeMaxima;
            this.automatico = automatico;
            this.numeroPortas = numeroPortas;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            if (marca == null || marca.isEmpty()) {
                throw new IllegalArgumentException("Marca não pode ser vazia.");
            }
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            if (modelo == null || modelo.isEmpty()) {
                throw new IllegalArgumentException("Modelo não pode ser vazio.");
            }
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            if (ano <= 1885 || ano > 2024) { // Primeiro carro foi criado em 1885
                throw new IllegalArgumentException("Ano inválido.");
            }
            this.ano = ano;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            if (preco < 0) {
                throw new IllegalArgumentException("Preço não pode ser negativo.");
            }
            this.preco = preco;
        }

        public int getVelocidadeMaxima() {
            return velocidadeMaxima;
        }

        public void setVelocidadeMaxima(int velocidadeMaxima) {
            if (velocidadeMaxima < 0) {
                throw new IllegalArgumentException("Velocidade máxima não pode ser negativa.");
            }
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public boolean isAutomatico() {
            return automatico;
        }

        public void setAutomatico(boolean automatico) {
            this.automatico = automatico;
        }

        public int getNumeroPortas() {
            return numeroPortas;
        }

        public void setNumeroPortas(int numeroPortas) {
            if (numeroPortas <= 0) {
                throw new IllegalArgumentException("Número de portas deve ser maior que zero.");
            }
            this.numeroPortas = numeroPortas;
        }

        public void exibirInfo() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
            System.out.println("Preço: R$ " + preco + ", Velocidade Máxima: " + velocidadeMaxima + " km/h, Automático: " + (automatico ? "Sim" : "Não") + ", Portas: " + numeroPortas);
        }

        public double calcularDesconto(double porcentagem) {
            if (porcentagem < 0 || porcentagem > 100) {
                throw new IllegalArgumentException("Porcentagem de desconto inválida.");
            }
            return preco - (preco * porcentagem / 100);
        }

        public boolean isAntigo() {
            return ano < 2000;
        }

        public void acelerar() {
            System.out.println("O carro está acelerando.");
        }
        public void frear() {
            System.out.println("O carro está freando.");
        }
    }
