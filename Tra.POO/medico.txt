public class Medico extends Pessoa {
    private Especialidade especialidade;
    private boolean disponivel;

    public Medico(String nome, String cpf, String telefone, Especialidade especialidade) {
        super(nome, cpf, telefone);
        this.especialidade = especialidade;
        this.disponivel = true;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        if (especialidade == null) {
            throw new IllegalArgumentException("Especialidade inválida");
        }
        this.especialidade = especialidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
