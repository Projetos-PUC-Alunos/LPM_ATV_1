package hospital;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.Date;
// import LPM_ATV_1.hospital.Info_pessoal;
// import LPM_ATV_1.hospital.Historico_medico;

public class PerfilPaciente extends Info_pessoal {
    private Historico_medico historicoMedico;

    public PerfilPaciente(int id, String nome, Date data_nascimento, String tipo_sangue, String alergia,
            Historico_medico historicoMedico) {
        super(id, nome, data_nascimento, tipo_sangue, alergia);
        this.historicoMedico = new Historico_medico("", "", new ArrayList<>());
    }

    public Historico_medico getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(Historico_medico historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void updatePerfilPaciente(String nome, Date data_nascimento, String tipo_sangue, String alergia) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.tipo_sangue = tipo_sangue;
        this.alergia = alergia;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nNascimento: " + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(getData_nascimento())
                + "\nId: " + getId() +
                "\nTipo sanguineo: " + getTipo_sangue()
                + "\nAlergias: " + getAlergia();
    }

}
