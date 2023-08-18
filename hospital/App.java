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
                    "********** Hospital **********\n1 - Cadastrar novo paciente\n2 - Cadastrar médico\n3 - Nova consulta\n4 - Visualizar consultas do médico\n5 - Cancelar consulta\n6 - Adicionar estoque\n7 - Visualizar estoque\n\t ESCOLHA UMA OPÇÃO: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    int pac_id;
                    String pac_nome;
                    String pac_nascimento;
                    String pac_sangue;
                    String pac_alergia;

                    System.out.println("Insira o nome completo: ");
                    pac_nome = input.nextLine();
                    pac_nome = input.nextLine();
                    System.out.print("Digite a data de nascimento (dd/mm/yyyy) :");
                    pac_nascimento = input.nextLine();
                    System.out.print("Digite o tipo sanguineo: ");
                    pac_sangue = input.nextLine();
                    System.out.println("Digite o tipo de alergia do paciente, caso não há precione enter");
                    pac_alergia = input.nextLine();

                    Date pac_nascimentoDate = new SimpleDateFormat("dd/MM/yyyy").parse(pac_nascimento);
                    pac_id = Math.abs(gerador.nextInt());

                    PerfilPaciente perfilPaciente = new PerfilPaciente(pac_id, pac_nome, pac_nascimentoDate, pac_sangue,
                            pac_alergia,
                            new Historico_medico("", "", new ArrayList<>()));
                    System.out
                            .println("\n----- INFORMAÇÃO Paciente-----\nID: " + perfilPaciente.getId() + "\nNome: "
                                    + perfilPaciente.getNome() + "\nNascimento: "
                                    + new SimpleDateFormat("dd'/'MMMM'/'yyyy")
                                            .format(perfilPaciente.getData_nascimento())
                                    + "\nTipo Sanguineo: " + perfilPaciente.getTipo_sangue() + "\nAlergias: "
                                    + perfilPaciente.getAlergia());
                    break;
                case 2:
                    int med_id;
                    String med_nome;
                    String med_nascimento;
                    String med_sangue;
                    String med_alergia;
                    String med_espec;
                    int med_exp;

                    System.out.println("Insira o nome completo: ");
                    med_nome = input.nextLine();
                    med_nome = input.nextLine();
                    System.out.print("Digite a data de nascimento (dd/mm/yyyy) :");
                    med_nascimento = input.nextLine();
                    System.out.print("Digite o tipo sanguineo: ");
                    med_sangue = input.nextLine();
                    System.out.println("Digite o tipo de alergia, caso não há precione enter");
                    med_alergia = input.nextLine();
                    System.out.println("Digite a especialidade: ");
                    med_espec = input.nextLine();
                    System.out.println("Digite o valor de anos de experiencia: ");
                    med_exp = input.nextInt();

                    Date med_nascimentoDate = new SimpleDateFormat("dd/MM/yyyy").parse(med_nascimento);
                    med_id = Math.abs(gerador.nextInt());

                    Medico perfilMedico = new Medico(med_id, med_nome, med_nascimentoDate, med_sangue, med_alergia,
                            new ArrayList<>(), med_espec, med_exp);
                    System.out
                            .println("\n----- INFORMAÇÃO Médico-----\nID: " + perfilMedico.getId() + "\nNome: "
                                    + perfilMedico.getNome() + "\nNascimento: "
                                    + new SimpleDateFormat("dd'/'MMMM'/'yyyy")
                                            .format(perfilMedico.getData_nascimento())
                                    + "\nTipo Sanguineo: " + perfilMedico.getTipo_sangue() + "\nAlergias: "
                                    + perfilMedico.getAlergia() + "\nEspecialidade: " + med_espec
                                    + "\nAnos de experiencia" + med_exp);
                    break;
                case 3:
                    
                    break;
            }
        }

    }
}