package Entity;

import java.util.List;

public class Restaurante extends Base {

    private String nome;
    private String telefone;
    private double valorMinimoEntrega;
    private boolean aceitaRetirada;
    private HorarioFuncionamento horarioFuncionamento;
    private Endereco endereco;
    private Categoria categoria;
    private List<Produto> produtos;

    public Restaurante(int id, int status, String nome, String telefone, double valorMinimoEntrega,
                       boolean aceitaRetirada, HorarioFuncionamento horarioFuncionamento,
                       Endereco endereco, Categoria categoria, List<Produto> produtos) {
        super(id, status);
        this.nome = nome;
        this.telefone = telefone;
        this.valorMinimoEntrega = valorMinimoEntrega;
        this.aceitaRetirada = aceitaRetirada;
        this.horarioFuncionamento = horarioFuncionamento;
        this.endereco = endereco;
        this.categoria = categoria;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorMinimoEntrega() {
        return valorMinimoEntrega;
    }

    public boolean isAceitaRetirada() {
        return aceitaRetirada;
    }

    public HorarioFuncionamento getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nome='" + nome + '\'' + ", telefone='" + telefone + '\'' +
                ", valorMinimoEntrega=" + valorMinimoEntrega + ", endereco=" + endereco + '}';
    }
}
