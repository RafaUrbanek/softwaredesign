package models;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private String cnpj;
    private String telefone;
    private String contato;

    // Construtor
    public Cliente(String nome, String email, String cpf, String cnpj, String telefone, String contato) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.contato = contato;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    @Override
    public String toString() {
        return "Cliente :" + "\n" +
                "nome = " + nome + "\n" +
                "email = " + email + "\n" +
                "cpf = " + cpf + "\n" +
                "cnpj = " + cnpj + "\n" +
                "telefone = " + telefone + "\n" +
                "contato = " + contato;
    }
}
