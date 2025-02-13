package pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica (String id, String nome, String telefone, String endereco, String cnpj) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj () {
        return this.cnpj;
    }
}
