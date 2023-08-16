package LPM_ATV_1.hospital;

import java.util.Date;

public class Historico_medico {
    class Consulta {
        String medico;
        String paciente;
        Date data;
        String motivo;

        public Consulta(String medico, String paciente, Date data, String motivo) {
            this.medico = medico;
            this.paciente = paciente;
            this.data = data;
            this.motivo = motivo;
        }
        
    }
}
