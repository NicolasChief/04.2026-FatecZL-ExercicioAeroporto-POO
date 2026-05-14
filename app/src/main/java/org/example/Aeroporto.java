package org.example;

public class Aeroporto {

    private String nome;
    private String local;
    private int qtdFuncionarios;
    private String gerente;
    private double espaco;
    protected Aeronave[] aeronave = new Aeronave[5];

    public void adicionarAeronave(){
        System.out.println("Adicionando...");
    }

}
