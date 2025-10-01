package br.gov.sp.cps.pizzariadojunin;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {
        Pedido() {}
        Pedido(String sabor, String tamanho, String borda, List<Boolean> extras) {
                this.sabor = sabor;
                this.tamanho = tamanho;
                this.borda = borda;
                this.extras = extras;
        }
        String sabor;
        String tamanho;
        String borda;
        List<Boolean> extras;
}
