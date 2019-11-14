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
public class ServicoPagamento {
    private Pagavel pagavel;
    private Pagador pagador;
    
    public ServicoPagamento(Pagador pagamento, Pagavel funcionario){
        this.pagador = pagamento;
        this.pagavel = funcionario;
        
        this.pagador.setPagavel(this.pagavel);
    }
    
    public float getPagamento(){
        return this.pagador.getSalario();
    }
}