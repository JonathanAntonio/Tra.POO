public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!telefone.matches("\\d{10,11}")) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }
}
