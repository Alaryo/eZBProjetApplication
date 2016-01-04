/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import static ezoombook.Utilitaire.DemandeInt;
import static ezoombook.Utilitaire.DemandeString;
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
         //TODO code application logic here

        //permet de créer un fichier avec "a" dedans
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("tonfichier.xhtml")));
             //normalement si le fichier n'existe pas, il est crée à la racine du projet
            
            System.out.println("\n----------- CREATION DE LA PAGE DE GARDE -----------------");
            System.out.println("\n\nVeuillez rentrer le titre de votre eZoomBook\n");
            String titre = DemandeString();
            System.out.println("\n\nVeuillez donner un texte d'introduction\n");
            String intro = DemandeString();
            System.out.println("\n\nVeuillez donner un texte explicatif : comment utiliser un eZoomBook\n");
            String util = DemandeString();
            System.out.println("\n\nVeuillez rentrer le nombre de layers\n");
            int nbLayers = DemandeInt();
            
            writer.write("a");

            writer.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
        }
    }

