package br.com.ada.appvendas.service.realizarvenda;

import br.com.ada.appvendas.entity.Pessoa;
import br.com.ada.appvendas.entity.Produto;
import br.com.ada.appvendas.entity.Venda;


public interface VendaService {

     Venda iniciarVenda(String dataHora, Pessoa cliente);
     void  adicionaProduto(Produto produto);
     void finalizarVenda (Venda venda);
     void imprimirVenda (Venda venda);



}
