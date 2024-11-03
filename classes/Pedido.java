public class Pedido extends BaseEntity {
    private Cliente cliente;
    private double valorTotal;

    public Pedido(int id, String status, Cliente cliente, double valorTotal) {
        super(id, status);
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pedido ID: " + getId() + ", Valor Total: " + valorTotal + ", Status: " + getStatus());
        if (cliente != null) {
            cliente.exibirDetalhes();
        }
    }
}
