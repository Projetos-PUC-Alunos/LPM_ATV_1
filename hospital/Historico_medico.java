package hospital;

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

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

}
