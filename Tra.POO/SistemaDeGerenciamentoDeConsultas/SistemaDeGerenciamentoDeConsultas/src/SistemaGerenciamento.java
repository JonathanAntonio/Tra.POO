import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {

    private static List<Consulta> consultas = new ArrayList<>();

    public static void main(String[] args) {
        Especialidade cardiologia = new Especialidade("Cardiologia");
        Especialidade dermatologia = new Especialidade("Dermatologia");

        Medico medico1 = new Medico("Dr. Vinicius", "12345678901", "11987654321", cardiologia);
        Medico medico2 = new Medico("Dr. Jonathan", "10987654321", "11912345678", dermatologia);

        Paciente paciente1 = new Paciente("Richard da Madeira", "98765432101", "87999999999", "Rua Madeirada, 10", 30);
        Paciente paciente2 = new Paciente("Talles do pacheco", "12312312312", "876756565", "Rua Brasil, 12", 25);

        agendarConsulta(paciente1, medico1, LocalDateTime.of(2024, 10, 1, 10, 0));
        agendarConsulta(paciente2, medico2, LocalDateTime.of(2024, 10, 2, 14, 30));

        exibirConsultas();
    }

    public static void agendarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        try {
            Consulta consulta = new Consulta(paciente, medico, dataHora);
            consultas.add(consulta);
            System.out.println("Consulta agendada com sucesso: " + medico.getNome() + " com " + paciente.getNome());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao agendar consulta: " + e.getMessage());
        }
    }

    public static void exibirConsultas() {
        for (Consulta consulta : consultas) {
            String especialidade = consulta.getMedico().getEspecialidade().getNome();
            String enderecoPaciente = consulta.getPaciente().getEndereco();
            String telefonePaciente = consulta.getPaciente().getTelefone();

            System.out.println("Consulta: " + consulta.getMedico().getNome() +
                    " (Especialidade: " + especialidade + ")" +
                    " com " + consulta.getPaciente().getNome() +
                    " (Endereço: " + enderecoPaciente + ")" +
                    " (Telefone: " + telefonePaciente + ")" +
                    " em " + consulta.getDataHora());
        }
    }
}
