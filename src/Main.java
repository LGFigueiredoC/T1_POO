import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;

import pessoa.*;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner (new File("src/01/pessoas.csv"), StandardCharsets.UTF_8.name());
            System.out.println("leu");
            scanner.useDelimiter("\n|;");

            String id = scanner.next();
            String tipoPessoa = scanner.next();
            PessoaFisica.LeitorPessoaFisica reader = new PessoaFisica.LeitorPessoaFisica("01/pessoas.csv", scanner);
            pessoa.PessoaFisica pf = reader.lePessoaFisica(id);
            id = scanner.next();
            tipoPessoa = scanner.next();
            pessoa.PessoaFisica pf2 = reader.lePessoaFisica(id);
            System.out.println(pf.getNome());
            System.out.println(pf2.getNome());
        }
        catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
        PessoaJuridica pj = new PessoaJuridica("id", "nome", "telefone", "endereco", "cnpj");

        System.out.println(pj.getId() + pj.getNome() + pj.getTelefone() + pj.getEndereco() + pj.getCnpj());
    }
}
