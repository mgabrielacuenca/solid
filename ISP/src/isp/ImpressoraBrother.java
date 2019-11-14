/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author Gabriela
 */
public class ImpressoraBrother implements ImpressoraMultifuncional {

    @Override
    public void ImprimePB() {
        System.out.println("Imprimindo Preto e Branco...");
    }

    @Override
    public void ImprimeColorido() {
        System.out.println("Imprimindo Colorido...");
    }

    @Override
    public void Scanneia() {
        System.out.println("Scaneando...");
    }

}
