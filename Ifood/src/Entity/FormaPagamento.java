package Entity;

public class FormaPagamento extends Base {

    private String descricao;

    public FormaPagamento(int id, int status, String descricao) {
        super(id, status);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "descricao='" + descricao + '\'' + '}';
    }
}
