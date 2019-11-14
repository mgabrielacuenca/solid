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
public class Pagamento implements Pagador {
 
    private Pagavel pagavel;
 
    public void setPagavel(Pagavel pagavel){
        this.pagavel = pagavel;
    }

    @Override
    public float getSalario() {
        return this.getSalario();
    }
    
    
}
