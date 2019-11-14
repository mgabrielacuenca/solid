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
public class Main {
    
     public static void main(String[] args) {
         ImpressoraEpson ie = new ImpressoraEpson();
         ie.ImprimePB();
         
         ImpressoraBrother ib = new ImpressoraBrother();
         ib.ImprimeColorido();
         ib.ImprimePB();
         ib.Scanneia();
         
         
     }
    
}
