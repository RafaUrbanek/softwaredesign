package models;

import java.time.LocalDate;

public class Projeto {

    private String cliente;
    private LocalDate dataInicio;
    private LocalDate prazo;
    private String descricao;
    private String contrato;

    // Construtor
    public Projeto(String cliente, LocalDate dataInicio, LocalDate prazo, String descricao, String contrato) {
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.descricao = descricao;
        this.contrato = contrato;
    }

    // Getters e Setters
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getPrazo() { return prazo; }
    public void setPrazo(LocalDate prazo) { this.prazo = prazo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getContrato() { return contrato; }
    public void setContrato(String contrato) { this.contrato = contrato; }

    @Override
    public String toString() {
        return "Projeto :" +
                "cliente = " + cliente + "\n" +
                "dataInicio = " + dataInicio + "\n" +
                "prazo = " + prazo + "\n" +
                "descricao = " + descricao + "\n" +
                "contrato = " + contrato;
    }
}
