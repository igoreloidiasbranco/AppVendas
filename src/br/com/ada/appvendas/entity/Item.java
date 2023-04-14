package br.com.ada.appvendas.entity;

public class Item {

    private int qtdeCompraProduto;
   private Produto produto;




    public int getQtdeCompraProduto() {
        return qtdeCompraProduto;
    }

    public void setQtdeCompraProduto(int qtdeCompraProduto) {
        this.qtdeCompraProduto = qtdeCompraProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    @Override
    public String toString() {
        return "Item{" +
                "qtdeCompraProduto = " + qtdeCompraProduto +
                ", produto = " + produto +
                '}';
    }
}
