package hospital;
import java.util.Date;

public class Info_pessoal {
    private int id;
    protected String nome;
    protected Date data_nascimento;
    protected String tipo_sangue;
    protected String alergia;

    public Info_pessoal(int id, String nome, Date data_nascimento, String tipo_sangue, String alergia) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.tipo_sangue = tipo_sangue;
        this.alergia = alergia;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_sangue() {
        return tipo_sangue;
    }

    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }

}
