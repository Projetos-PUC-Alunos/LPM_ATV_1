package hospital;
// import jLPM_ATV_1.hospitalList;
// import java.util.Scanner;

import LPM_ATV_1.hospital.Departamento;
import Professor.Professor;
import Serializer.DataDeserializer;
// import Serializer.PopulateData;
import Usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        // PopulateData.populate();
        ArrayList<Departamento> Departamentos = DataDeserializer.deserialize("data_Departamentos.ser");
        ArrayList<Aluno> alunos = DataDeserializer.deserialize("data_alunos.ser");
        ArrayList<Aluno> alunosList = alunos;
        ArrayList<Professor> professores = DataDeserializer.deserialize("data_professores.ser");
        ArrayList<Usuario> usuarios = new ArrayList<>() {
            {
                addAll(alunosList);
                addAll(professores);
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        String id = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = null;
        for (Usuario usuario : usuarios) {
            if (String.valueOf(usuario.getId()).equals(id) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                break;
            }
        }

        if (usuarioLogado == null) {
            System.out.println("Erro ao fazer login!");
        } else {
            System.out.println("Bem vindo, " + usuarioLogado.getNome() + "! \n");
            if (usuarioLogado instanceof Aluno) {
                Aluno aluno = (Aluno) usuarioLogado;
                System.out.println("Creditos: " + aluno.getCreditos() + " / " + aluno.getTotalCreditos() + "\n");
                aluno.listarDepartamentos(Departamentos, professores);

                int op = 2;

                do {
                    System.out.println("1 - Matricular em Departamento");
                    System.out.println("0 - Sair");
                    System.out.print("Opcao: ");
                    op = scanner.nextInt();
                    scanner.nextLine();
                    if (op == 1) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out
                                .println("Creditos: " + aluno.getCreditos() + " / " + aluno.getTotalCreditos() + "\n");
                        System.out.println("Departamentos disponiveis:");
                        for (Departamento Departamento : Departamentos) {
                            System.out.println("  - " + Departamento.getId() + ": " + Departamento.getNome() + " ("
                                    + Departamento.getCreditos()
                                    + " Creditos)");
                        }
                        System.out.print("Id da Departamento: ");
                        int DepartamentoId = scanner.nextInt();
                        scanner.nextLine();
                        aluno.matricularDepartamento(DepartamentoId, Departamentos, alunos);
                        Departamentos = DataDeserializer.deserialize("data_Departamentos.ser");
                        alunos = DataDeserializer.deserialize("data_alunos.ser");

                        for (Usuario usuario : usuarios) {
                            if (String.valueOf(usuario.getId()).equals(id) && usuario.getSenha().equals(senha)) {
                                usuarioLogado = usuario;
                                break;
                            }
                        }
                    }
                } while (op != 0);
            } else if (usuarioLogado instanceof Professor) {
                Professor professor = (Professor) usuarioLogado;
                professor.listarDepartamentos(Departamentos, alunos);
            }
        }

        scanner.close();
    }
}