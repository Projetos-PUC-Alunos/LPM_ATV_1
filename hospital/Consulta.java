package hospital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Estudante.Aluno;

public class Consulta implements Serializable {
    private int id;
    private Medico medico;
    private PerfilPaciente paciente;
    private Date data;

    public Consulta(int id, Medico medico, Date data, PerfilPaciente paciente) {
        this.id = id;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setPaciente(PerfilPaciente paciente) {
        this.paciente = paciente;
    }

    public PerfilPaciente getPaciente() {
        return paciente;
    }

    public void updateInfo(Medico medico, Date data, PerfilPaciente paciente) {
        this.medico = medico;
        this.data = data;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta:  Médico: " + medico + "\nData: " + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(data)
                + "\nID: " + id;
    }

}