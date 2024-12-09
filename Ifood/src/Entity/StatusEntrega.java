package Entity;

public class StatusEntrega extends Base {

    private StatusEntregaEnum status;
    private final Pedido pedido;

    public StatusEntrega(int id, int statusBase, StatusEntregaEnum status, Pedido pedido) {
        super(id, statusBase);
        this.status = status;
        this.pedido = pedido;
    }

    public StatusEntregaEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEntregaEnum status) {
        this.status = status;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "StatusEntrega{" + "status=" + status + ", pedidoId=" + pedido.getId() + '}';
    }
}
