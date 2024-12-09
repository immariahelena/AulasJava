package Entity;

import java.time.LocalDateTime;

public class Avaliacao extends Base {
    private int nota;
    private Pedido pedido;

    public Avaliacao(int id, int status, LocalDateTime dataCriacao, int nota, Pedido pedido) {
        super(id, status, dataCriacao);
        this.nota = nota;
        this.pedido = pedido;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
