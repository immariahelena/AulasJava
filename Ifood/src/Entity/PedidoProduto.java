package Entity;

public class PedidoProduto extends Base {

    private final String produto;
    private final int quantidade;
    private final double precoUnitario;

    public PedidoProduto(int id, int status, String produto, int quantidade, double precoUnitario) {
        super(id, status);
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "PedidoProduto{" + "produto='" + produto + '\'' + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + '}';
    }
}
