package hospital;

// import jLPM_ATV_1.hospitalList;
import java.util.Scanner;

import Estudante.Aluno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int op = -1;
        int paciente_id;
        Random gerador = new Random(19700621);
        Scanner input = new Scanner(System.in);

        while (op != 0) {
            System.out.printf(
                    "********** Hospital **********\n1 - Cadastrar novo paciente\n2 - Atualizar dados do paciente\n3 - Cadastrar médico\n4 - Nova consulta\n5 - Visualizar consultas do médico\n6 - Cancelar consulta\n7 - Adicionar estoque\n8 - Visualizar estoque\n\t ESCOLHA UMA OPÇÃO: ");
            op = input.nextInt();
            switch (op) {
            case 1:
            int pac_id;
            String pac_nome;
            String pac_nascimento;
            String pac_sangue;
            String pac_alergia;

            System.out.print("Insira o nome completo: ");
            pac_nome = input.nextLine();
            System.out.print("Digite a data de nascimento: (dd/mm/yyyy) ");
            pac_nascimento = input.nextLine();
            System.out.print("Digite o tipo sanguineo");
            pac_sangue = input.nextLine();
            System.out.println("Digite o tipo de alergia do paciente, caso não há precione enter");
            pac_alergia = input.nextLine();

            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(pac_nascimento);
            pac_id = Math.abs(gerador.nextInt());

            PerfilPaciente perfilPaciente = new PerfilPaciente(pac_id, pac_nome, pac_nascimento, pac_sangue, pac_alergia);
            perfilPaciente.toString();
            break;
            case 2:
            // System.out.print("Matricula do aluno: ");
            // matricula = input.nextInt();

            // Aluno infoAluno = alunoList.getStudentByRegistrationNumber(matricula);
            // if (infoAluno != null) {
            // System.out.print("Insira o nome completo: ");
            // name = input.nextLine();
            // name = input.nextLine();

            // System.out.print("Digite a data de nascimento (dd/mm/yyyy): ");
            // nascimento = input.nextLine();

            // alunoList.updateStudentInfo(matricula, name,
            // (new SimpleDateFormat("dd/MM/yyyy").parse(nascimento)));
            // System.out.println("\n--- Informação de aluno atualizado com sucesso!
            // ---\n");
            // } else {
            // System.out.println("\n--- Aluno com a matricula " + matricula + " não foi
            // encontrado. ---\n");
            // }
            break;
            case 3:
            // System.out.print("Digite o número de matrícula do aluno: ");
            // matricula = input.nextInt();
            // alunoList.removeStudent(matricula);
            // break;
            // case 4:
            // List<Aluno> alunosList = alunoList.getAllStudents();
            // for (Aluno estudante : alunosList) {
            // System.out.println(estudante);
            // System.out.println("--------------------");
            // }
            break;
            }
        }

    }
}