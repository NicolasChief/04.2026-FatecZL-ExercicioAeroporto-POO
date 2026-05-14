package org.example;

public class Aeronave {

    private String nome;
    private String modelo;
    private int assentos;
    private double peso;
    private double altura;
    protected Passageiro[] passageiros = new Passageiro[200];

    public void voar(){
        System.out.println("Voando...");
    }

}
