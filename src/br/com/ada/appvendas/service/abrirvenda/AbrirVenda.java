package br.com.ada.appvendas.service.abrirvenda;

import br.com.ada.appvendas.entity.Pessoa;
import br.com.ada.appvendas.entity.Produto;
import br.com.ada.appvendas.entity.Venda;


public interface AbrirVenda {

     Venda iniciarVenda(String dataHora, Pessoa cliente);
     void  adicionaProduto(Produto produto);
     void finalizarVenda (Venda venda);
     void imprimirVenda (Venda venda);



}
