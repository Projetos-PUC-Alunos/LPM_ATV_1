package Estudante;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlunoList {
    private List<Aluno> alunos;

    public AlunoList() {
        alunos = new ArrayList<>();
    }

    public Aluno addStudent(Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public Aluno getStudentByRegistrationNumber(int registrationNumber) {
        for (Aluno aluno : alunos) {
            if (aluno.getRegistration() == registrationNumber) {
                return aluno;
            }
        }
        return null;
    }

    public void updateStudentInfo(int registrationNumber, String name, Date dateOfBirth) {
        Aluno aluno = getStudentByRegistrationNumber(registrationNumber);
        if (aluno != null) {
            aluno.updateInfo(name, dateOfBirth);
        }
    }

    public void removeStudent(int registrationNumber) {
        Aluno aluno = getStudentByRegistrationNumber(registrationNumber);
        if (aluno != null) {
            alunos.remove(aluno);
        }
    }

    public List<Aluno> getAllStudents() {
        return alunos;
    }
}
