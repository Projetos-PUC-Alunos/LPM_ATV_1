package hospital;

import java.util.Date;

public class Medicamentos {
    private String nome;
    private String dosagem;
    private Date validade;
    private Integer quantidade;

    public Medicamentos(String nome, String dosagem, Date validade, Integer quantidade) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

}
