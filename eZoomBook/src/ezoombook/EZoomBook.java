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
import java.util.Scanner;

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
//        System.setProperty( "file.encoding", "UTF-8" );
//        Scanner saisieUtilisateur = new Scanner(System.in);
//        String txt = saisieUtilisateur.nextLine();
//        System.out.println(txt);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("intro.xhtml")));
            //             normalement si le fichier n'existe pas, il est crée à la racine du projet
            System.out.println("\n----------- CREATION DE LA PAGE DE GARDE -----------------");
            System.out.println("\n\nVeuillez rentrer le nombre de layers\n");
            int nbLayers = DemandeInt();
            System.out.println("\n\nOn va maintenant nommer les layers\n");
            ArrayList<String> nomLayers = new ArrayList<>();
            for (int k = 1; k <= nbLayers; k++) {
                System.out.println("\n\nVeuillez rentrer le nom du layer numéro " + k);
                nomLayers.add(DemandeString());
            }
            System.out.println("\n\nVeuillez rentrer le nombre de chapitre\n");
            int nbChapitres = DemandeInt();
            System.out.println("\n\nOn va maintenant nommer les chapitres\n");
            ArrayList<String> nomChapitres = new ArrayList<>();
            for (int k = 1; k <= nbChapitres; k++) {
                System.out.println("\n\nVeuillez rentrer le nom du chapitre numéro " + k);
                nomChapitres.add(DemandeString());
            }
            Page[][] pages = new Page[nbLayers][nbChapitres];
            for (int i = 0; i <= nbLayers - 1; i++) {
                for (int k = 0; k <= nbChapitres - 1; k++) {
                    pages[i][k] = new Page();
                    BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File(nomChapitres.get(k) + "_" + nomLayers.get(i) + ".xhtml")));
                    pages[i][k].pageVierge(nomChapitres, nomLayers, k, i);
                    writer1.write(pages[i][k].getTexte());
                    writer1.close();
                }
            }
            Page intro = new Page();
            intro.creerIntro(nomLayers, nomChapitres);
            writer.write(intro.getTexte());
            
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("style.css")));
            Page styleCss = new Page();
            styleCss.ecrireStyle();
            writer2.write(styleCss.getTexte());
            
            writer.close();
            writer2.close();
            //System.out.println(pages[1][2].getTexte());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
