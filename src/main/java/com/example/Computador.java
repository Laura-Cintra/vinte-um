package com.example;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        /*
         * if (this.getPontos() > 16) {
         * return true;
         * }
         * return false;
         */

        return getPontos() > 16; // this. -> quando tiver variáveis de mesmo nome em contexto diferentes
    }

}
