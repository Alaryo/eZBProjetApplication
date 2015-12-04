/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pierre
 */
public class EZoomBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //permet de créer un fichier avec "a" dedans
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("tonfichier.xhtml")));
            // normalement si le fichier n'existe pas, il est crée à la racine du projet
            writer.write("a");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        int NombreLayers;
        System.out.println("entrez le nombre de Layers");
        
        
        
    }
}
