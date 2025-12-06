package models;

public class Ecomper {

    private String nome;
    private String cpf;
    private String email;
    private String cargo;

    // Construtor
    public Ecomper(String nome, String cpf, String email, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public String toString() {
        return "Ecomper :" + "\n" +
                "nome = " + nome + "\n" +
                "cpf = " + cpf + "\n" +
                "email = " + email + "\n" +
                "cargo = " + cargo;
    }
}
