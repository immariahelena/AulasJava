package Entity;

import java.time.LocalDateTime;

public class Endereco extends Base {
    private String rua;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;

    public Endereco(int id, int status, LocalDateTime dataCriacao, String rua, String bairro, String numero,
                    String cidade, String estado, String complemento, String cep) {
        super(id, status, dataCriacao);
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s - %s/%s (%s)", rua, bairro, numero, cidade, estado, cep);
    }
}
