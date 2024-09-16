public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;
    private String nacionalidade;
    private String estadoCivil;
    private double altura;

    public Pessoa(String nome, int idade, String cpf, String rg, String endereco, String telefone, String email, String nacionalidade, String estadoCivil, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida.");
        }
        this.altura = altura;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf + ", RG: " + rg);
        System.out.println("Endereço: " + endereco + ", Telefone: " + telefone + ", Email: " + email);
        System.out.println("Nacionalidade: " + nacionalidade + ", Estado Civil: " + estadoCivil + ", Altura: " + altura);
    }
}

