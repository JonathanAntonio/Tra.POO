public class Paciente extends Pessoa {
    private String endereco;
    private int idade;

    public Paciente(String nome, String cpf, String telefone, String endereco, int idade) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio");
        }
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }
}
