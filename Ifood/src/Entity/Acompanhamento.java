package Entity;

import java.time.LocalDateTime;

public class Acompanhamento extends Base {
    private String nome;
    private String descricao;
    private double valor;

    public Acompanhamento(int id, int status, LocalDateTime dataCriacao, String nome, String descricao, double valor) {
        super(id, status, dataCriacao);
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
