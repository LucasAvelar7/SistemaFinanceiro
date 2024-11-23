import java.io.Serializable;

public class Transacao implements Serializable {
    private String descricao;
    private double valor;
    private String tipo;
    private String data;

    public Transacao(String descricao, double valor, String tipo, String data) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }
}
