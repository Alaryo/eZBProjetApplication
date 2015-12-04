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
    
    public static int Demande() {
        int i;
        Scanner saisieUtilisateur = new Scanner(System.in);

        try {
            i = saisieUtilisateur.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("entrez un nombre!");
            i = Demande();
        }
        
        if (i<0){
        System.out.println("case hors champ,entrez un autre nombre");
            i = Demande();
    }
        return i;
    }
    
}
