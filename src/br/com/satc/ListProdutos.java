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
public enum ListProdutos {
Pcura(1,"Poção de Cura","Cura 100HP",'T',(float) 100.00),
Pmana(2,"Poção de Mana","Restaura 100MP",'T',(float) 100.00),
Pvit(3,"Poção de Estamina","Restaura 100EP",'T',(float) 100.00),
Pfrio(4,"Poção de Frio","Cura status de Congelado",'T',(float) 250.00),
Pqueima(5,"Poção de Queimadura","Cura status de Queimadura",'T',(float) 250.00),
Pinvi(6,"Poção de Invisibilidade","Da ao usuario invisibilidade",'T',(float) 1000.00),
Pvene(7,"Poção de Veneno","-10Hp segundo a vitima",'T',(float) 780.00),
Ppara(8,"Poção de Paralizia","Paraliza o Alvo",'T',(float) 780.00),
Pant(9,"Antidoto","Cura o alvo de algum maleficio",'T',(float) 400.00),
Pdes(10,"Poção de Destreza","Aumenta a velocidade e o acerto",'T',(float) 320.00);

private int id;
private String nome;
private String descrição;
private char status;
private float valor;

    public static ListProdutos getPcura() {
        return Pcura;
    }

    public static ListProdutos getPmana() {
        return Pmana;
    }

    public static ListProdutos getPvit() {
        return Pvit;
    }

    public static ListProdutos getPfrio() {
        return Pfrio;
    }

    public static ListProdutos getPqueima() {
        return Pqueima;
    }

    public static ListProdutos getPinvi() {
        return Pinvi;
    }

    public static ListProdutos getPvene() {
        return Pvene;
    }

    public static ListProdutos getPpara() {
        return Ppara;
    }

    public static ListProdutos getPant() {
        return Pant;
    }

    public static ListProdutos getPdes() {
        return Pdes;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public char getStatus() {
        return status;
    }

    public float getValor() {
        return valor;
    }

    private ListProdutos(int id, String nome, String descrição, char status, float valor) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.status = status;
        this.valor = valor;
    }


}
