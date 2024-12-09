package Entity;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido extends Base {

    private final LocalDateTime dataPedido;
    private final double valorTotal;
    private final double taxaEntrega;
    private final String observacoes;
    private final String enderecoEntrega;
    private final List<PedidoProduto> produtos;

    public Pedido(int id, int status, LocalDateTime dataPedido, double valorTotal, double taxaEntrega, String observacoes, String enderecoEntrega, List<PedidoProduto> produtos) {
        super(id, status);
        this.dataPedido = dataPedido != null ? dataPedido : LocalDateTime.now();
        this.valorTotal = valorTotal;
        this.taxaEntrega = taxaEntrega;
        this.observacoes = observacoes;
        this.enderecoEntrega = enderecoEntrega;
        this.produtos = produtos;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public List<PedidoProduto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "dataPedido=" + dataPedido + ", valorTotal=" + valorTotal + ", enderecoEntrega='" + enderecoEntrega + '\'' + '}';
    }
}
