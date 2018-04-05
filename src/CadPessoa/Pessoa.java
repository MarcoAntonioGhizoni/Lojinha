/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadPessoa;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ealde
 */
public class Pessoa {
    private String nome;
    private int rg;
    private int cpf;
    private Date dataNac;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNacimento() {
        return dataNac;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNac = dataNac;
    }

    public Pessoa(String nome, int rg, int cpf, Date dataNacimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNac = dataNacimento;
    }
    
}
