/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builderexemplo;

import java.time.LocalDate;


public class ProdutoBuilder {

    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private String vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder id(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder vendedor(String vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public ProdutoBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder altura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder largura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder profundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto build() {
        if(this.preco != Double.NaN && this.preco > 0 && this.titulo != null
                && this.descricao != null && this.categoria != null
                && this.vendedor != null && this.dataCadastro.compareTo(LocalDate.now())>=0 
                && this.dataUltimaAtualizacao.compareTo(LocalDate.now())>=0
                ){
            if(this.marca == null && this.modelo == null){
                return new Produto(id, titulo, descricao,
                    marca, modelo, estoque, preco, dataCadastro,
                    dataUltimaAtualizacao, urlFoto, categoria, 
                    vendedor, peso, altura, largura, profundidade);
            }else{
                marca = null;
                modelo = null;
                return new Produto(id, titulo, descricao,
                    marca, modelo, estoque, preco, dataCadastro,
                    dataUltimaAtualizacao, urlFoto, categoria, 
                    vendedor, peso, altura, largura, profundidade);
            }
            
          
        }else{
            System.out.println(preco + titulo + dataCadastro + dataUltimaAtualizacao);
            return null;
        }
    
    }
}
