/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadPessoa;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author Ealde
 */
public class Cliente {
    private int ID;
    private Date dataCadastro;
    private char status;
    private int idade;

    public Cliente(int ID, Date dataCadastro, char status, int idade) {
        this.ID = ID;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.idade = idade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "ID=" + ID + ", dataCadastro=" + dataCadastro + ", status=" + status + ", idade=" + idade + '}';
    }
    
    
}
