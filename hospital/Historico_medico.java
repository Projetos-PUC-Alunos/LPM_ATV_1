package hospital;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Historico_medico {
    private ArrayList<Consulta> consultasAnteriores;
    private String cirurgias;
    private String medicamentos;

    public Historico_medico(String cirurgias, String medicamentos, ArrayList<Consulta> consultasAnteriores) {
        this.cirurgias = cirurgias;
        this.medicamentos = medicamentos;
        this.consultasAnteriores = consultasAnteriores;
    }

    public ArrayList<Consulta> getConsultasAnteriores() {
        return consultasAnteriores;
    }

    public Consulta getConsultaByID(int id) {
        for (Consulta consulta : consultasAnteriores) {
            if (consulta.getId() == id) {
                return consulta;
            }
        }
        return null;
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
}