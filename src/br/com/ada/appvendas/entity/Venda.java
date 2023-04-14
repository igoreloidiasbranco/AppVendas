package br.com.ada.appvendas.entity;

import java.util.List;


public class Venda {
   private String dataHora;
   private Pessoa cliente;
   private List<Item> listaItens;
   private double totalVenda;


    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double getTotal() {
        return totalVenda;
    }

    public void setTotal(double total) {
        this.totalVenda = total;
    }


    @Override
    public String toString() {
        return "Venda{" +
                "data = " + dataHora +
                ", cliente = " + cliente +
                ", listaItens = " + listaItens +
                ", total = " + totalVenda +
                '}';
    }

    }


