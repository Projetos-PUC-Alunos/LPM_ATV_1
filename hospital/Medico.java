package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Info_pessoal {
    private List<Consulta> calendarioDeConsultas;
    private String especialidade;
    private int anosExperiencia;

    public Medico(int id, String nome, Date data_nascimento, String tipo_sangue, String alergia,
            List<Consulta> calendarioDeConsultas, String especialidade, int anosExperiencia) {
        super(id, nome, data_nascimento, tipo_sangue, alergia);
        this.calendarioDeConsultas = calendarioDeConsultas;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getCalendarioDeConsultas() {
        return calendarioDeConsultas;
    }

    public void setCalendarioDeConsultas(List<Consulta> calendarioDeConsultas) {
        this.calendarioDeConsultas = calendarioDeConsultas;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

}
