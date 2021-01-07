/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builderexemplo;

import java.time.LocalDate;

/**
 *
 * @author auriv
 */
public class Main {
    
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder().
                preco(5000).titulo("Xbox Series X").descricao("Console Videogame").
                categoria("Console").vendedor("Maria").marca("Xbox").
                dataCadastro(LocalDate.now()).dataUltimaAtualizacao(LocalDate.now()).
                build();
        if(produto != null){
            System.err.println(produto.toString());
        }else{
            System.err.println("Produto é null");
        }
                
    }
}
