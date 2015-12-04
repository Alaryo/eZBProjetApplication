/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pierre
 */
public class Utilitaire {
    
    public static int DemandeInt() {
        int i;
        Scanner saisieUtilisateur = new Scanner(System.in);

        try {
            i = saisieUtilisateur.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("entrez un nombre!");
            i = DemandeInt();
        }
        
        if (i<0){
        System.out.println("entrez un nombre positif");
            i = DemandeInt();
    }
        return i;
    }
    
    public static String DemandeString(){
        String txt;
        Scanner saisieUtilisateur = new Scanner(System.in);

        try {
            txt = saisieUtilisateur.next();

        } catch (InputMismatchException e) {
            System.out.println("entrez un nombre!");
            i = DemandeInt();
        }
        
        if (i<0){
        System.out.println("entrez un nombre positif");
            i = DemandeInt();
    }
        return i;
    } 
}
