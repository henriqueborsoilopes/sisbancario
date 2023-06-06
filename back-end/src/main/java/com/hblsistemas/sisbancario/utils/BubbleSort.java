package com.hblsistemas.sisbancario.utils;

import com.hblsistemas.sisbancario.entidades.ContaBanco;

public class BubbleSort {

    public static void ordenationContaPorSaldo(ContaBanco[] contas) {
        boolean change;
        do {
            change = false;
            for (int i = 0; i < contas.length - 1; i++) {
            	if (contas[i] != null) {
            		if (contas[i].getSaldo() > contas[i + 1].getSaldo()) {
                        ContaBanco aux = contas[i];
                        contas[i] = contas[i + 1];
                        contas[i + 1] = aux;
                        change = true;
                    }
            	}
            }
        } while (change);
    }
    
    public static void ordenationContaPorNumConta(ContaBanco[] contas) {
        boolean change;
        do {
            change = false;
            for (int i = 0; i < contas.length - 1; i++) {
            	if (contas[i] != null) {
            		if (contas[i].getNumConta().hashCode() > contas[i + 1].getNumConta().hashCode()) {
                        ContaBanco aux = contas[i];
                        contas[i] = contas[i + 1];
                        contas[i + 1] = aux;
                        change = true;
                    }
            	}
            }
        } while (change);
    }
}
