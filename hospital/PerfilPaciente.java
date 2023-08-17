package hospital;

import java.util.ArrayList;
import java.util.Date;
import LPM_ATV_1.hospital.Info_pessoal;
import LPM_ATV_1.hospital.Historico_medico;

public class PerfilPaciente extends Info_pessoal {
    private Historico_medico historicoMedico;

    public PerfilPaciente(int id, String nome, Date data_nascimento, String tipo_sangue, String alergia,
            Historico_medico historicoMedico) {
        super(id, nome, data_nascimento, tipo_sangue, alergia);
        this.historicoMedico = historicoMedico;
    }

    public Historico_medico getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(Historico_medico historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

}
