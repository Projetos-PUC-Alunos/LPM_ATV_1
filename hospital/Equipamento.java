package hospital;

import java.util.Date;

public class Equipamento {
    private String classe;
    private Date ultima_manutencao;
    private Departamento departamento;
    private String status;

    public Equipamento(String classe, Date ultima_manutencao, Departamento departamento, String status) {
        this.classe = classe;
        this.departamento = departamento;
        this.status = status;
        this.ultima_manutencao = ultima_manutencao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUltima_manutencao() {
        return ultima_manutencao;
    }

    public void setUltima_manutencao(Date ultima_manutencao) {
        this.ultima_manutencao = ultima_manutencao;
    }
}
