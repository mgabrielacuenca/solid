/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Retangulo r = new Retangulo();
        r.setAltura(5);
        r.setLargura(10);
        System.out.println("A área do retângulo é:" +r.getArea());
        
        Quadrado q = new Quadrado();
        q.setAltura(5);
        q.setLargura(10);
        System.out.println("A área do quadrado é:" +q.getArea());
    }
    
}
