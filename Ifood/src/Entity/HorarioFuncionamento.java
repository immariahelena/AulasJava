package Entity;

import java.time.LocalTime;

public class HorarioFuncionamento {

    private final LocalTime abertura;
    private final LocalTime fechamento;

    public HorarioFuncionamento(LocalTime abertura, LocalTime fechamento) {
        this.abertura = abertura;
        this.fechamento = fechamento;
    }

    public LocalTime getAbertura() {
        return abertura;
    }

    public LocalTime getFechamento() {
        return fechamento;
    }

    @Override
    public String toString() {
        return "HorarioFuncionamento{" + "abertura=" + abertura + ", fechamento=" + fechamento + '}';
    }
}
