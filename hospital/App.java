package hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
        private static List<Consulta> doctorCalender = new ArrayList<>();
        private static List<Consulta> appointments = new ArrayList<>();
        private static Historico_medico patientHistory = new Historico_medico("", "", new ArrayList<>());
        private static Medico doctor;
        private static PerfilPaciente patient;
        private static Random gerador = new Random(19700621);
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
                int op = -1;

                while (op != 0) {
                        System.out.printf(
                                        "********** Hospital **********\n1 - Cadastrar novo paciente\n2 - Cadastrar médico\n3 - Nova consulta e Visualizar consultas do médico\n4 - Cancelar consulta\n5 - Adicionar estoque\n6 - Visualizar estoque\n\t ESCOLHA UMA OPÇÃO: ");
                        op = input.nextInt();
                        switch (op) {
                                case 1:
                                        registerPatient();
                                        break;
                                case 2:
                                        registerDoctor();
                                        break;
                                case 3:
                                        newAppointmentAndViewConsultations();
                                        break;
                                case 4:
                                        cancelAppointment();
                                        break;
                                case 5:
                                        manageInventory();
                                        break;
                        }
                }

        }

        private static void registerPatient() throws Exception {
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
                System.out.println("Digite o tipo de alergia do paciente, caso não há pressione enter");
                pac_alergia = input.nextLine();

                Date pac_nascimentoDate = new SimpleDateFormat("dd/MM/yyyy").parse(pac_nascimento);
                pac_id = Math.abs(gerador.nextInt());

                patient = new PerfilPaciente(pac_id, pac_nome, pac_nascimentoDate, pac_sangue, pac_alergia,
                                patientHistory);
                System.out.println("\n----- INFORMAÇÃO Paciente-----\nID: " + patient.getId() + "\nNome: "
                                + patient.getNome()
                                + "\nNascimento: "
                                + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(patient.getData_nascimento())
                                + "\nTipo Sanguineo: " + patient.getTipo_sangue() + "\nAlergias: "
                                + patient.getAlergia());
        }

        private static void registerDoctor() throws Exception {
                int med_id;
                String med_nome;
                String med_nascimento;
                String med_sangue;
                String med_alergia;
                String med_espec;
                int med_exp;
                List<Consulta> med_cal = new ArrayList<>();

                System.out.println("Insira o nome completo: ");
                med_nome = input.nextLine();
                med_nome = input.nextLine();
                System.out.print("Digite a data de nascimento (dd/mm/yyyy) :");
                med_nascimento = input.nextLine();
                System.out.print("Digite o tipo sanguineo: ");
                med_sangue = input.nextLine();
                System.out.println("Digite o tipo de alergia, caso não há pressione enter");
                med_alergia = input.nextLine();
                System.out.println("Digite a especialidade: ");
                med_espec = input.nextLine();
                System.out.println("Digite o valor de anos de experiencia: ");
                med_exp = input.nextInt();

                Date med_nascimentoDate = new SimpleDateFormat("dd/MM/yyyy").parse(med_nascimento);
                med_id = Math.abs(gerador.nextInt());

                doctor = new Medico(med_id, med_nome, med_nascimentoDate, med_sangue, med_alergia, med_cal, med_espec,
                                med_exp);
                System.out.println("\n----- INFORMAÇÃO Médico-----\nID: " + doctor.getId() + "\nNome: "
                                + doctor.getNome()
                                + "\nNascimento: "
                                + new SimpleDateFormat("dd'/'MMMM'/'yyyy").format(doctor.getData_nascimento())
                                + "\nTipo Sanguineo: " + doctor.getTipo_sangue() + "\nAlergias: " + doctor.getAlergia()
                                + "\nEspecialidade: " + med_espec + "\nAnos de experiencia: " + med_exp
                                + "\n Calendario consultas: " + med_cal);
        }

        private static void newAppointmentAndViewConsultations() {
                // Create and add appointments
                Consulta appointment1 = new Consulta(101, doctor, new Date(), patient);
                Consulta appointment2 = new Consulta(102, doctor, new Date(), patient);

                appointments.add(appointment1);
                appointments.add(appointment2);
                doctorCalender.add(appointment1);
                doctorCalender.add(appointment2);

                // Print doctor's calendar
                System.out.println("Doctor's Calendar:");
                for (Consulta consulta : doctorCalender) {
                        System.out.println(consulta);
                }

                // Print patient's medical history
                System.out.println("\nPatient's Medical History:");
                for (Consulta consulta : patientHistory.getConsultasAnteriores()) {
                        System.out.println(consulta);
                }
        }

        private static void cancelAppointment() {
                // Cancel an appointment
                if (!appointments.isEmpty()) {
                        Consulta cancelledAppointment = appointments.get(0);
                        cancelledAppointment.cancelAppointment();
                        appointments.remove(cancelledAppointment);

                        // Print doctor's updated calendar
                        System.out.println("\nDoctor's Updated Calendar:");
                        for (Consulta consulta : doctorCalender) {
                                System.out.println(consulta);
                        }

                        // Print patient's updated medical history
                        System.out.println("\nPatient's Updated Medical History:");
                        for (Consulta consulta : patientHistory.getConsultasAnteriores()) {
                                System.out.println(consulta);
                        }
                } else {
                        System.out.println("No appointments to cancel.");
                }
        }

        private static void manageInventory() throws ParseException {
                List<Equipamento> equipmentList = new ArrayList<>();
                List<Medicamentos> medicationList = new ArrayList<>();
                List<Departamento> departmentList = new ArrayList<>();

                // Create and add departments to the departmentList
                departmentList.add(new Departamento(1, "Emergência", "Hospitalar"));
                departmentList.add(new Departamento(2, "Cardiologia", "Hospitalar"));
                departmentList.add(new Departamento(3, "Neurologia", "Hospitalar"));
                departmentList.add(new Departamento(4, "Pediatria", "Hospitalar"));

                int op = -1;
                while (op != 0) {
                        System.out.printf("\n********** Gerenciamento de Estoque **********\n");
                        System.out.printf("1 - Adicionar Equipamento\n");
                        System.out.printf("2 - Adicionar Medicamento\n");
                        System.out.printf("3 - Visualizar Equipamentos\n");
                        System.out.printf("4 - Visualizar Medicamentos\n");
                        System.out.printf("0 - Voltar\n");
                        System.out.print("\t ESCOLHA UMA OPÇÃO: ");
                        op = input.nextInt();

                        switch (op) {
                                case 1:
                                        System.out.println(
                                                        "Lista de departamentos: emergência, cardiologia, neurologia e pediatria");
                                        System.out.print("Digite a classe do equipamento: ");
                                        String eqClasse = input.nextLine();
                                        eqClasse = input.nextLine();

                                        System.out.print("Digite a data da última manutenção (dd/mm/yyyy): ");
                                        String eqManutencao = input.nextLine();
                                        Date eqManutencaoDate = new SimpleDateFormat("dd/MM/yyyy").parse(eqManutencao);

                                        System.out.print("Digite o ID do departamento: ");
                                        int depId = input.nextInt();

                                        Departamento selectedDepartment = null;
                                        for (Departamento dep : departmentList) {
                                                if (dep.getId() == depId) {
                                                        selectedDepartment = dep;
                                                        break;
                                                }
                                        }

                                        if (selectedDepartment != null) {
                                                System.out.print("Digite o status: ");
                                                String eqStatus = input.nextLine();

                                                Equipamento equipamento = new Equipamento(eqClasse, eqManutencaoDate,
                                                                selectedDepartment, eqStatus);
                                                equipmentList.add(equipamento);
                                        } else {
                                                System.out.println("Departamento não encontrado.");
                                        }
                                        break;
                                case 2:
                                        System.out.print("Digite o nome do medicamento: ");
                                        String medNome = input.nextLine();
                                        medNome = input.nextLine();
                                        System.out.print("Digite a dosagem: ");
                                        String medDosagem = input.nextLine();
                                        System.out.print("Digite a data de validade (dd/mm/yyyy): ");
                                        String medValidade = input.nextLine();
                                        Date medValidadeDate = new SimpleDateFormat("dd/MM/yyyy").parse(medValidade);
                                        System.out.print("Digite a quantidade: ");
                                        int medQuantidade = input.nextInt();

                                        Medicamentos medicamento = new Medicamentos(medNome, medDosagem,
                                                        medValidadeDate, medQuantidade);
                                        medicationList.add(medicamento);
                                        break;
                                case 3:
                                        System.out.println("\nEquipamentos:");
                                        for (Equipamento eq : equipmentList) {
                                                System.out.println("Classe: " + eq.getClasse() +
                                                                "\nÚltima Manutenção: " + eq.getUltima_manutencao() +
                                                                "\nDepartamento: " + eq.getDepartamento().getNome() +
                                                                "\nStatus: " + eq.getStatus() + "\n");
                                        }
                                        break;
                                case 4:
                                        System.out.println("\nMedicamentos:");
                                        for (Medicamentos med : medicationList) {
                                                System.out.println("Nome: " + med.getNome() +
                                                                "\nDosagem: " + med.getDosagem() +
                                                                "\nValidade: " + med.getValidade() +
                                                                "\nQuantidade: " + med.getQuantidade() + "\n");
                                        }
                                        break;
                        }
                }
        }
}
