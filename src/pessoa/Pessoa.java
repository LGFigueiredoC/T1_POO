package pessoa;

public class Pessoa {
    String id;
    String nome;
    String telefone;
    String endereco;

    Pessoa (String id, String nome, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getId () {
        return this.id;
    }

    public String getNome () {
        return this.nome;
    }

    public String getTelefone () {
        return this.telefone;
    }

    public String getEndereco () {
        return this.endereco;
    }
}
