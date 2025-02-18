package com.example;

public class Carta {
    private int numero;
    private Naipe naipe; // em nenhum lugar vai ser possível preencher esse atributo com outro valor

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {
        String numeroCarta = numero + "";

        // pode usar um array de Strings
        if (numero == 1) numeroCarta = "Ace";
        if (numero == 11) numeroCarta = "Jack";
        if (numero == 12) numeroCarta = "Queen";
        if (numero == 13) numeroCarta = "King";

        return "classic-cards/" + numeroCarta + naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
