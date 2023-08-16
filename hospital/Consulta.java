package hospital;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Estudante.Aluno;

public class Consulta implements Serializable {
    private int id;
    private String medico;
    private Date data;
    private ArrayList<Consulta> consultasAnteriores;

    public Consulta(int id, String medico, Date data, ArrayList<Consulta> consultasAnteriores) {
        this.id = id;
        this.data = data;
        this.medico = medico;
        this.consultasAnteriores = consultasAnteriores;
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

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMedico() {
        return medico;
    }

    public void ConsultasAnterioresList() {
        consultasAnteriores = new ArrayList<Consulta>();
    }

    public Consulta getConsultaByID(int id) {
        for (Consulta consulta : consultasAnteriores) {
            if (consulta.getId() == id) {
                return consulta;
            }
        }
        return null;
    }

    public void updateInfo(String medico, Date data) {
        this.data = data;
        this.medico = medico;
    }

    public Consulta addConsulta(Consulta consulta) {
        consultasAnteriores.add(consulta);
        return consulta;
    }

    public void removeConsulta(int id) {
        Consulta consulta = getConsultaByID(id);
        if (consulta != null) {
            consultasAnteriores.remove(consulta);
        }
    }

    @Override
    public String toString() {
        return "Consulta:  Médico: " + medico + "\nData: " + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(data)
                + "\nID: " + id;
    }

}