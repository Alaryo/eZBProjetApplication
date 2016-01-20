/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import java.io.IOException;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author pierre
 */
public class Utilitaire {

    public static int DemandeInt() {
        int i = 0;
        boolean b = false;
        Scanner saisieUtilisateur = new Scanner(System.in);

        while (!b) {
            try {
                i = saisieUtilisateur.nextInt();
                b = true;

                if (i < 0) {
                    System.out.println("entrez un nombre positif");
                    i = saisieUtilisateur.nextInt();
                    b = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("entrez un nombre correct!");
                String garbage = saisieUtilisateur.nextLine();
            }
        }

        return i;
    }

    public static String DemandeString() {
        String txt = "";
        boolean saisieOk = false;
        Scanner saisieUtilisateur = new Scanner(System.in);

        while (saisieOk == false) {
            txt = saisieUtilisateur.nextLine();
            /*System.out.println(txt);
            System.out.println("Est-ce que ce texte vous convient ? Si oui tapez 1.");
            if (saisieUtilisateur.next().equals("1")){
                saisieOk = true;
            } else {
                System.out.println("Entrez votre nouveau texte");
            }*/
            saisieOk = true;
        }
        return txt;
    }

    public static String changeRef(String a){
        //on ne peut avoir "?" ":"  
        a.replaceAll("é", "&eacute");
        a.replaceAll("è", "&egrave");
        a.replaceAll("à", "&agrave");
        a.replaceAll("ù", "&ugrave");
        a.replaceAll(" ", "&nbsp");
        a.replaceAll("ê", "&ecirc");
        a.replaceAll("ç", "&ccedil");
        a.replaceAll("oe", "&oelig");
        a.replaceAll("ï", "&iuml");
        a.replaceAll("&", "&amp");
    return a;
}
}