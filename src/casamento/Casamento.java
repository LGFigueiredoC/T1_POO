package casamento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Casamento {
    private String id;
    // private Casal casal;
    private LocalDate data;
    private LocalTime hora;
    private String local;
    private Festa festa;

    public Casamento(String id, LocalDate data, LocalTime hora, String local, Festa festa) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.festa = festa;
    }

    public static class LeitorCasamento{
        private String path;
        private Scanner reader;

        public LeitorCasamento(String path, Scanner reader) {
            this.path = path;
            this.reader = reader;
        }


    }
}
