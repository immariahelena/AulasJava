package Entity;

import java.time.LocalDateTime;
import java.util.List;

public class HistoricoPagamento extends Base {

    private final double valorTotal;
    private final LocalDateTime dataPagamento;
    private final List<FormaPagamento> formasPagamento;

    public HistoricoPagamento(int id, int status, double valorTotal, LocalDateTime dataPagamento, List<FormaPagamento> formasPagamento) {
        super(id, status);
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.formasPagamento = formasPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public List<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    @Override
    public String toString() {
        return "HistoricoPagamento{" + "valorTotal=" + valorTotal + ", dataPagamento=" + dataPagamento + '}';
    }
}
