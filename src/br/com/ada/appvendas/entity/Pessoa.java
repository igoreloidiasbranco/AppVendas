package br.com.ada.appvendas.entity;

public abstract class Pessoa {

    private String nome;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Cliente = " + nome;}
    }


