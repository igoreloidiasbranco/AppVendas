package br.com.ada.appvendas.entity;

import java.security.Key;
import java.time.LocalDate;
import java.util.Map;

public class Venda {
   private LocalDate data;
   private Pessoa cliente;
   private Map<Key, Item> listaItens;





    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Map<Key, Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(Map<Key, Item> listaItens) {
        this.listaItens = listaItens;
    }
}
