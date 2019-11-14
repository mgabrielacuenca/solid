/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp;

/**
 *
 * @author Gabriela
 */
public class Requisicao {

    private String requerente;
    private String documento;

    public Requisicao(String requerente, String documento) {
        this.requerente = requerente;
        this.documento = documento;
    }

    public String getRequerente() {
        return requerente;
    }

    public void setRequerente(String requerente) {
        this.requerente = requerente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Requisicao{" + "requerente=" + requerente + ", documento=" + documento + '}';
    }

     public static void Requisicao(Requisicao r) {
        System.out.println(r.toString());
    }
     
}
