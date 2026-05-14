package org.example;

public class Main {

    public static void main(String[] args) {

        Aeronave aNave = new Aeronave();
        Aeroporto aPorto = new Aeroporto();
        Piloto p = new Piloto();
        Passageiro x = new Passageiro();
        
        aPorto.aeronave[1] = aNave;
        aNave.passageiros[1] = x;

    }

}
