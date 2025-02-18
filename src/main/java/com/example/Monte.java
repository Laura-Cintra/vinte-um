package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte() { // criar 52 cartas
        for(int numero = 1; numero <= 13; numero++){ // de 1 a 13 ---- criando 13 cartas sem repetição

            for (Naipe naipe : Naipe.values()) { // foreach - para cada || .values() - pega o array de valores do enum
                cartas.add(new Carta(numero, naipe));
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas); // Collections - classe util do Java com métodos estáticos para manipular listas
        // shuffle - embaralhar
    }

    public Carta virar(){
        return cartas.remove(0); // índice 0 - remove a carta do topo
    }

}
