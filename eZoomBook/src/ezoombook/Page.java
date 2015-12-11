/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezoombook;

import static ezoombook.Utilitaire.DemandeString;
import java.util.ArrayList;

/**
 *
 * @author pierre
 */
public class Page {

    private String titreChapitre;

    private String layer;

    private String texte;

    public Page() {
        this.titreChapitre = "Sans Titre";
        this.layer = "Sans Layer";
        this.texte = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\"\n"
                + "    \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<title></title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<p>&#160;</p>\n"
                + "</body>\n"
                + "</html>";

    }

    public void creerIntro(ArrayList<String> nomLayers,ArrayList<String> nomChapitres) {
        this.layer = "Intro";
        this.titreChapitre = "Intro";
        
        System.out.println("\n\nVeuillez rentrer le titre de votre eZoomBook\n");
            String titre = DemandeString();
            
            System.out.println("\n\nVeuillez donner un texte d'introduction\n");
            String intro = DemandeString();

            System.out.println("\n\nVeuillez donner un texte explicatif : comment utiliser un eZoomBook\n");
            String util = DemandeString();

            
        this.texte = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n"
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\"\n"
                + "  \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "  <title>ENTRER LE TITRE DU COURS</title>\n"
                + "  <link href=\"../Styles/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "  <p><a id=\"i1\"></a></p>\n"
                + "\n"
                + "  <h1>"+titre+"</h1>\n"
                + "\n"
                + "  <p style=\"text-align: center;\"><img alt=\"\" height=\"240\" src=\"../Images/head.png\" width=\"240\" /><br /></p>\n"
                + "\n"
                + "  <p style=\"text-align: center;\"><b>Responsable du cours</b></p>\n"
                + "\n"
                + "  <p>"+intro+"</p><!--StartFragment--><!--EndFragment-->\n"
                + "\n"
                + "  <h3 id=\"sigil_toc_id_1\" style=\"text-align: center;\">Comment utiliser ce livre</h3>\n"
                + "\n"
                + "  <p>"+util+"<br /></p><!--StartFragment--><!--EndFragment-->\n"
                + "\n"
                + "  <center>\n"
                + "    <table id=\"table\">\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Niveau</td>\n"
                + "\n"
                + "        <td id=\"td\">ENTRER LE TITRE 1</td>\n"
                + "\n"
                + "        <td id=\"td\">ENTRER LE TITRE 2</td>\n"
                + "\n"
                + "        <td id=\"td\">ENTRER LA TITRE 3</td>\n"
                + "\n"
                + "        <td id=\"td\">ENTRER LA TITRE 4</td>\n"
                + "      </tr>\n"
                + "\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Notions</td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/notions1.xhtml#n1\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/notions2.xhtml#n2\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/notions3.xhtml#n3\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/notions4.xhtml#n4\">Allez-y</a></td>\n"
                + "      </tr>\n"
                + "\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Synthèse</td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/synthese1.xhtml#s1\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/synthese2.xhtml#s2\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/synthese3.xhtml#s3\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/synthese4.xhtml#s4\">Allez-y</a></td>\n"
                + "      </tr>\n"
                + "\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Approfondi</td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/approfondi1.xhtml#a1\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/approfondi2.xhtml#a2\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/approfondi3.xhtml#a3\">Allez-y</a></td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/approfondi4.xhtml#a4\">Allez-y</a></td>\n"
                + "      </tr>\n"
                + "\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Expert</td>\n"
                + "\n"
                + "        <td id=\"td\"><a href=\"../Text/expert.xhtml#e1\">Allez-y</a></td>\n"
                + "      </tr>\n"
                + "    </table>\n"
                + "  </center>\n"
                + "</body>\n"
                + "</html>";
        
    }
}
