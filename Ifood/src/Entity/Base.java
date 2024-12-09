package Entity;

import java.time.LocalDateTime;

public abstract class Base {
    public static final int DISABLED = 0;
    public static final int ENABLED = 1;
    public static final int REMOVED = 2;

    private int id;
    private int status = ENABLED;
    private LocalDateTime dataCriacao;

    public Base(int id, int status, LocalDateTime dataCriacao) {
        this.id = id;
        this.status = status;
        this.dataCriacao = dataCriacao != null ? dataCriacao : LocalDateTime.now();
    }

    public boolean isActive() {
        return this.status == ENABLED;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
