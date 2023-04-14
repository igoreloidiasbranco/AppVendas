package br.com.ada.appvendas.main;

import br.com.ada.appvendas.entity.*;
import br.com.ada.appvendas.service.abrirvenda.AberturaVenda;
import br.com.ada.appvendas.service.criarproduto.CadastroProduto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AberturaVendaMain {
    public static void main(String[] args) {

        CadastroProduto novoProduto = new CadastroProduto();

        Produto leite = novoProduto.criarProduto( "001","Leite", 4.50, 20);

        Produto pao = novoProduto.criarProduto("002", "Pão", 0.50, 50);

        Produto cafe = novoProduto.criarProduto("003", "Café", 15.00, 30);

        Produto manteiga = novoProduto.criarProduto("004","Manteiga", 4.00,10);


        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(leite);
        listaProduto.add(pao);
        listaProduto.add(cafe);
        listaProduto.add(manteiga);



        PessoaFisica igor = new PessoaFisica();
        igor.setNome("Igor");



        AberturaVenda aberturaVenda = new AberturaVenda();

        String dataTempo = getDataTempo();

        Venda vendaIgor = aberturaVenda.iniciarVenda(dataTempo, igor);


        aberturaVenda.adicionaProduto(leite);
        aberturaVenda.adicionaProduto(leite);
        aberturaVenda.adicionaProduto(pao);
        aberturaVenda.adicionaProduto(cafe);
        aberturaVenda.adicionaProduto(manteiga);
        aberturaVenda.finalizarVenda(vendaIgor);
        aberturaVenda.imprimirVenda(vendaIgor);

    }

    public static String getDataTempo(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);}

}
