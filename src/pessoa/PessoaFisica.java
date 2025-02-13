package pessoa;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.String;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private LocalDate data;
    private Conta conta;


    private class Conta {
        private double saldo;
        private double gastos;
        private double salario;

        Conta (double saldo, double salario, double gastos) {
            this.saldo = saldo;
            this.salario = salario;
            this.gastos = gastos;
        }

        public double getSaldo () {
            return this.saldo;
        }

        public double getSalario () {
            return this.salario;
        }

        public double getGastos () {
            return this.gastos;
        }

    }


    static public class LeitorPessoaFisica {
        private String path;
        private Scanner reader;
        
        public LeitorPessoaFisica (String path, Scanner reader) {
            this.path = path;
            this.reader = reader;
        }

        public PessoaFisica lePessoaFisica (String id) {
            String nome = this.reader.next();
            String telefone = this.reader.next();
            String endereco = this.reader.next();
            String cpf = this.reader.next();
            String strData = this.reader.next();
            double saldo = this.reader.nextDouble();
            double salario  = this.reader.nextDouble();
            double gastos = this.reader.nextDouble();

            int dia = Integer.parseInt(strData.substring(0, 2));
            int mes = Integer.parseInt(strData.substring(3, 5));
            int ano = Integer.parseInt(strData.substring(6, 10));
            
            LocalDate data = LocalDate.of(ano, mes, dia);

            return new PessoaFisica(id, nome, telefone, endereco, cpf, data, saldo, salario, gastos);
            
        }
    }


    public PessoaFisica (String id, String nome, String telefone, String endereco,
                        String cpf, LocalDate data, double saldo, double salario, double gastos) {

        super(id, nome, telefone, endereco);
        this.cpf = cpf;
        this.data = data;
        this.conta = new Conta(saldo, salario, gastos);
    }
}
