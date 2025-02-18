package com.example;

public class Jogo {

    // protected - porque tanto o computador quanto o jogador vão ser acessados pelo controller
    // só quem tá dentro do pacote pode acessar esses atributos

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    // parâmetro polimorfo - esse método recebe jogador e computador // assume diversas formas
    public Carta distribuirCartaParaJogador(Jogador jogador){
        if(jogador.parou()){  // não posso entregar uma carta a um jogador que parou
            return null;
        }

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }

    public String resultado(){ // ganhei, perdi ou empatou
        if (jogadorEstourou() && computadorEstourou() || empatou()){
            return "Empatou";
        }

        if (computadorEstourou() || !jogadorEstourou() && ganhou()){
            return "Você ganhou!";
        }

        return "Você perdeu :(";
    }

    private boolean empatou(){
        return jogador.getPontos() == computador.getPontos();
    }

    private boolean ganhou(){
        return jogador.getPontos() > computador.getPontos();
    }

    public boolean acabou(){
        return jogadorEstourou() || computadorEstourou() || osDoisPararam();

        /*
        if(jogadorEstourou() || computadorEstourou() || osDoisPararam()){ // alguém estourou ou os dois pararam
            return true;
        }
        return false;
         */
    }

    private boolean jogadorEstourou(){
        return jogador.getPontos() > 21;
    }

    private boolean computadorEstourou(){
        return computador.getPontos() > 21;
    }

    private boolean osDoisPararam(){
        return jogador.parou() && computador.parou();
    }
}
