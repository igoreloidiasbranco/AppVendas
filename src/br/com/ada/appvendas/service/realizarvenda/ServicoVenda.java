package br.com.ada.appvendas.service.realizarvenda;

import br.com.ada.appvendas.entity.Item;
import br.com.ada.appvendas.entity.Pessoa;
import br.com.ada.appvendas.entity.Produto;
import br.com.ada.appvendas.entity.Venda;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class ServicoVenda implements VendaService {

    private Map<String, Item> carrinhoCompras;


    @Override
    public Venda iniciarVenda(String dataHora, Pessoa cliente) {

        carrinhoCompras = new HashMap<>();

        Venda venda = new Venda();
        venda.setDataHora(dataHora);
        venda.setCliente(cliente);

        return venda;

    }


    @Override
    public void adicionaProduto(Produto produto) {

        Item item = new Item();
        item.setProduto(produto);
        item.setQtdeCompraProduto(1);

        if (item.getQtdeCompraProduto() <= produto.getQtdeEstoque()) {

            Item itemCarrinho = carrinhoCompras.get(produto.getCodigo());


            if (itemCarrinho == null) {
                carrinhoCompras.put(produto.getCodigo(), item);
                produto.setQtdeEstoque(produto.getQtdeEstoque() - 1);
                }

                else {

                  itemCarrinho.setQtdeCompraProduto(item.getQtdeCompraProduto() + 1);
                  produto.setQtdeEstoque(produto.getQtdeEstoque() - 1);
            }
        }

        else {
            throw new RuntimeException("Não há quantidade no estoque suficiente para esse produto");
        }
    }

    @Override
    public void finalizarVenda(Venda venda) {


        venda.setListaItens(carrinhoCompras.values().stream().toList());


        for (Item lista : venda.getListaItens()){
            venda.setTotal(venda.getTotal() + (lista.getQtdeCompraProduto() * lista.getProduto().getPrecoVenda()));
        }
    }

    @Override
    public void imprimirVenda(Venda venda) {

        System.out.println("Recibo");
        System.out.println("Data: " + venda.getDataHora());
        System.out.println(venda.getCliente());

        for (Item lista :(venda.getListaItens())){
            System.out.printf("Produto: %s, Qtde: %d, Preço unitário: %.2f, Total: %.2f \n",
                    lista.getProduto().getNome() , lista.getQtdeCompraProduto() , lista.getProduto().getPrecoVenda(),
                    (lista.getQtdeCompraProduto()*lista.getProduto().getPrecoVenda()));
        }


        System.out.printf("Total da venda: R$ %.2f" , venda.getTotal());

    }


    @Override
    public String toString() {
        return "AberturaVenda{" +
                "carrinhoCompras=" + carrinhoCompras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoVenda that = (ServicoVenda) o;
        return Objects.equals(carrinhoCompras, that.carrinhoCompras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrinhoCompras);
    }
}
