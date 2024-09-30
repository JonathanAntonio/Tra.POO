public class Especialidade {
    private String nome;

    public Especialidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome da especialidade não pode ser vazio");
        }
        this.nome = nome;
    }
}
