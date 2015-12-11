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
        int i = 0;
        boolean b = false;
        Scanner saisieUtilisateur = new Scanner(System.in);

        while (!b) {
            try {
                i = saisieUtilisateur.nextInt();
                b = true;

                if (i < 0) {
                    System.out.println("entrez un nombre positif");
                    b = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("entrez un nombre!");
            }
        }

        return i;
    }

}
