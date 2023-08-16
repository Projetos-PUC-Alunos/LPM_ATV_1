package Estudante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Aplicacao {
    public static void main(String[] args) throws ParseException {
        int op = -1;
        int matricula;
        String name;
        String nascimento;
        
        AlunoList alunoList = new AlunoList();
        Random gerador = new Random(19700621);
        Scanner input = new Scanner(System.in);

        while(op != 0){
            System.out.printf("********** MATRICULA DO ALUNO **********\n1 - Cadastrar novo aluno\n2 - Atualizar dados do usuário\n3 - Remover aluno\n4 - Listar alunos\n\t ESCOLHA UMA OPÇÃO: ");
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.print("Insira o nome completo: ");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.print("Digite a data de nascimento: (dd/mm/yyyy) ");
                    nascimento = input.nextLine();

                    Date data = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
                    matricula = Math.abs(gerador.nextInt());

                    Aluno aluno = new Aluno(name, data, matricula);
                    Aluno resultado = alunoList.addStudent(aluno);
                    System.out.println("\n----- INFORMAÇÃO -----\nMatricula: " + matricula + "\nNome: " + resultado.getName() + "\nNascimento: " + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(resultado.getBirth()) + "\n");
                break;
                case 2:
                    System.out.print("Matricula do aluno: ");
                    matricula = input.nextInt();

                    Aluno infoAluno = alunoList.getStudentByRegistrationNumber(matricula);
                    if (infoAluno != null) {
                        System.out.print("Insira o nome completo: ");
                        name = input.nextLine();
                        name = input.nextLine();

                        System.out.print("Digite a data de nascimento (dd/mm/yyyy): ");
                        nascimento = input.nextLine();

                        alunoList.updateStudentInfo(matricula, name, (new SimpleDateFormat("dd/MM/yyyy").parse(nascimento)));
                        System.out.println("\n--- Informação de aluno atualizado com sucesso! ---\n");
                    } else {
                        System.out.println("\n--- Aluno com a matricula " + matricula + " não foi encontrado. ---\n");
                    }
                break;
                case 3:
                    System.out.print("Digite o número de matrícula do aluno: ");
                    matricula = input.nextInt();
                    alunoList.removeStudent(matricula);
                break;
                case 4:
                    List<Aluno> alunosList = alunoList.getAllStudents();
                    for (Aluno estudante : alunosList) {
                        System.out.println(estudante);
                        System.out.println("--------------------");
                    }
                break;
            }
        }
    }
}
