package Estudante;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String name;
    private Date birth;
    private int registration;

    public Aluno(String name, Date data, int registration) {
        this.name = name;
        this.birth = data;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public int getRegistration() {
        return registration;
    }

    public void updateInfo(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nNascimento: " + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(birth) + "\nMatricula: " + registration;
    }
}
