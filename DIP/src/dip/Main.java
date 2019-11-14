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
public class Main {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setCargo("Programador");
        f.setSalario(2000);
        f.setComissao(300);
        System.out.println("Cargo:" + f.getCargo() + "\n" + "Salário:" + f.getRemuneracao());

    }

}
