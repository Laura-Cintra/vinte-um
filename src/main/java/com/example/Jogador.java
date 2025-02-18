package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0; // padrão = 0
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false; // padrão = false

    // se você não faz um construtor, o java cria um construtor padrão
    // sempre um objeto java tem um construtor

    public void receberCarta(Carta carta) {
        cartas.add(carta); // adicionando um objeto na lista
        pontos += carta.getNumero(); // lê o número da carta e soma a pontuação dele
    }

    public void parar() {
        parou = true;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    // isParou - is - porque é um estado
    public boolean parou() { // chamamos de parou para deixar o código legível
        return parou;
    }

}
