/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

/**
 *
 * @author Ealde
 */
public enum Menu {
    CadCliente(1,"Cadastrar Cliente"),InfProdut(2,"Informação de produto"),InfPreco(3,"Informação de preços"),StaProdut(4,"Status Produtos"),Sair(5,"Sair");
    
    private int codigo;
    private String nome;

    public static Menu getCadCliente() {
        return CadCliente;
    }

    public static Menu getInfProdut() {
        return InfProdut;
    }

    public static Menu getInfPreco() {
        return InfPreco;
    }

    public static Menu getStaProdut() {
        return StaProdut;
    }

    public static Menu getSair() {
        return Sair;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    private Menu(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n" + this.getCodigo() + this.getNome();
    }
    
}
