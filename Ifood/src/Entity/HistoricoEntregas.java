package Entity;

import java.time.LocalDateTime;

public class HistoricoEntregas extends Base {

    private final LocalDateTime dataHora;
    private final String statusEntrega;

    public HistoricoEntregas(int id, int status, LocalDateTime dataHora, String statusEntrega) {
        super(id, status);
        this.dataHora = dataHora;
        this.statusEntrega = statusEntrega;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    @Override
    public String toString() {
        return "HistoricoEntregas{" + "dataHora=" + dataHora + ", statusEntrega='" + statusEntrega + '\'' + '}';
    }
}
