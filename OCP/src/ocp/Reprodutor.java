/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.ArrayList;

/**
 *
 * @author Gabriela
 */
public class Reprodutor {

    public void ReproduzirMusicas(ArrayList<Musica> musicas) {
        for (Musica musica : musicas) {
            musica.Reproduzir();
        }
    }
}
