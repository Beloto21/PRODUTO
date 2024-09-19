package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoas {
    private String nomeCompleto;
    private double altura;
    private LocalDate dataNascimento;
    private String email;

    // Construtor
    public Pessoas(String nomeCompleto, double altura, String dataNascimentoStr) {
        this.nomeCompleto = nomeCompleto;
        this.altura = altura;

        // para verificar se a data de nascimento é válida
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de nascimento não pode ser posterior à data atual.");
        }
        this.dataNascimento = dataNascimento;

        
        this.email = criarEmail();
    }

    // para criar o email
    private String criarEmail() {
        String[] partesNome = nomeCompleto.split(" ");
        String nome = partesNome[0];
        String sobrenome = partesNome[partesNome.length - 1];
        return nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@dominio.com";
    }

    // Getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public double getAltura() {
        return altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", altura=" + altura +
                ", dataNascimento=" + dataNascimento +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        try {
            Pessoas pessoa = new Pessoas("Nicolas Beloto", 1.71, "21/06/2006");
            System.out.println(pessoa);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
