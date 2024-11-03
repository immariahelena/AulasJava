public class Cliente extends BaseEntity {
    private String nome;
    private String email;

    public Cliente(int id, String status, String nome, String email) {
        super(id, status);
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Cliente ID: " + getId() + ", Nome: " + nome + ", Email: " + email + ", Status: " + getStatus());
    }
}
