/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import static ezoombook.Utilitaire.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
//             normalement si le fichier n'existe pas, il est crée à la racine du projet
            writer.write("a");
            System.out.println("\n----------- CREATION DE LA PAGE DE GARDE -----------------");
            System.out.println("\n\nVeuillez rentrer le titre de votre eZoomBook\n");
            String titre = DemandeString();
            System.out.println("\n\nVeuillez donner un texte d'introduction\n");
            String intro = DemandeString();
            System.out.println("\n\nVeuillez donner un texte explicatif : comment utiliser un eZoomBook\n");
            String util = DemandeString();
            System.out.println("\n\nVeuillez rentrer le nombre de layers\n");
            int nbLayers = DemandeInt();
            
            System.out.println("\n\nOn va maintenant nommer les layers\n");
            ArrayList<String> nomLayers= new ArrayList<>();
            for (int k=1; k<=nbLayers; k++){
                System.out.println("\n\nVeuillez rentrer le nom du layer numéro "+ k);
                nomLayers.set(k, DemandeString());
            }
            
            System.out.println("\n\nVeuillez rentrer le nombre de chapitre\n");
            int nbChapitres = DemandeInt();
            
            System.out.println("\n\nOn va maintenant nommer les chapitres\n");
            ArrayList<String> nomChapitres= new ArrayList<>();
            for (int k=1; k<=nbChapitres; k++){
                System.out.println("\n\nVeuillez rentrer le nom du chapitre numéro "+ k);
                nomChapitres.set(k, DemandeString());
            }
            
            Page[][] pages = new Page[nbLayers][nbChapitres];
            for (int i=1; i<= nbLayers ; i++){
                for (int k =1; k<=nbChapitres; k++){
                    pages[i][k]= new Page();
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

