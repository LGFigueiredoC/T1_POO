package casamento;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Festa {
    private String id_festa;
    private String id_casamento;
    private String local;
    private Float preco;
    private Integer parcelas;
    private LocalDate data;
    private LocalTime hora;
    private List<String> convidados;

    public Festa(String id_festa, String id_casamento, String local, Float preco, Integer parcelas, LocalDate data, LocalTime hora, List<String> convidados) {
        this.id_festa = id_festa;
        this.id_casamento = id_casamento;
        this.local = local;
        this.preco = preco;
        this.parcelas = parcelas;
        this.data = data;
        this.hora = hora;
        this.convidados = convidados;
    }

    public void imprimeFesta() {
        System.out.println("ID da festa: " + this.id_festa);
        System.out.println("ID do casamento: " + this.id_casamento);
        System.out.println("Local: " + this.local);
        System.out.println("Preco: " + this.preco);
        System.out.println("Parcelas: " + this.parcelas);
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Convidados:" + this.convidados);
    }

    
    static public class LeitorFesta {
        private String path;
        private Scanner reader;
        
        public LeitorFesta (String path, Scanner reader) {
            this.path = path;
            this.reader = reader;
        }

        public Festa leFesta() {
            String id_festa = this.reader.next();
            String id_casamento = this.reader.next();
            String local = this.reader.next();
            String strData = this.reader.next();
            String strHora = this.reader.next();
            Float preco = this.reader.nextFloat();
            Integer parcelas = this.reader.nextInt();               // caso de teste trocou parcelas por num_convidados
            Integer num_convidados = this.reader.nextInt();
            List<String> convidados = new ArrayList<String>();
            
            for(int i=0; i<num_convidados; i++){
                convidados.add(this.reader.next());
            }                

            int dia = Integer.parseInt(strData.substring(0, 2));
            int mes = Integer.parseInt(strData.substring(3, 5));
            int ano = Integer.parseInt(strData.substring(6, 10));

            int hora_int = Integer.parseInt(strHora.substring(0, 2));
            int minuto_int = Integer.parseInt(strHora.substring(3, 5));

            LocalDate data = LocalDate.of(ano, mes, dia);
            LocalTime horario = LocalTime.of(hora_int, minuto_int);

            return new Festa(id_festa, id_casamento, local, preco, parcelas, data, horario, convidados);
        }
            
    

        
    }
}
