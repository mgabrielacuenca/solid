/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip;

/**
 *
 * @author Gabriela
 */
public class Funcionario implements Pagavel {

    private String cargo;
    private float salario;
    private float comissao;

    public String getCargo() {
        return this.cargo;
    }

   
    public float getRemuneracao() {
        float remuneracao = this.salario;

        if (this.getCargo() != "Programador") {
            remuneracao = remuneracao + comissao;
        }

        return remuneracao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

}   