import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        if (!medico.isDisponivel()) {
            throw new IllegalArgumentException("Médico não está disponível para consulta");
        }

        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        medico.setDisponivel(false);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        if (dataHora.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("A data da consulta não pode ser no passado");
        }
        this.dataHora = dataHora;
    }
}
