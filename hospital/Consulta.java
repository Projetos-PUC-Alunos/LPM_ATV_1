package hospital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public int getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public PerfilPaciente getPaciente() {
        return paciente;
    }

    public void cancelAppointment() {
        medico.getCalendarioDeConsultas().remove(this);
        paciente.getHistoricoMedico().getConsultasAnteriores().remove(this);
    }

    @Override
    public String toString() {
        return "Consulta:\nMédico: " + medico.getNome() + "\nData: " +
                new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(data) + "\nID: " + id;
    }
}