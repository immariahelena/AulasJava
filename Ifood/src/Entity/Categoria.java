package Entity;

import java.time.LocalDateTime;
import java.util.List;

public class Categoria extends Base {
    private String nome;
    private String descricao;
    private String tipo;
    private List<Produto> produtos;

    public Categoria(int id, int status, LocalDateTime dataCriacao, String nome, String descricao, String tipo) {
        super(id, status, dataCriacao);
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
