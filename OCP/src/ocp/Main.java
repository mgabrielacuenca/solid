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
public class Main {

    public static void main(String[] args) {
        
        
        ArrayList<Musica> musicas = new ArrayList();
        
        MusicaMP3 mp3 = new MusicaMP3();
        musicas.add(mp3);
        
        MusicaWAV wav = new MusicaWAV();
        musicas.add(wav);     
        
        MusicaWMA wma = new MusicaWMA();
        musicas.add(wma); 
        
        new Reprodutor().ReproduzirMusicas(musicas);
    }
    
}
