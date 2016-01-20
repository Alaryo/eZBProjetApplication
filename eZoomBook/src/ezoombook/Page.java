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

    public String getTitreChapitre() {
        return titreChapitre;
    }

    public String getLayer() {
        return layer;
    }

    public String getTexte() {
        return texte;
    }

    public void setTitreChapitre(String titreChapitre) {
        this.titreChapitre = titreChapitre;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void pageCSS() {

    }

    public Page() {
        this.titreChapitre = "Sans Titre";
        this.layer = "Sans Layer";
        this.texte = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n"
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

    public void creerIntro(ArrayList<String> nomLayers, ArrayList<String> nomChapitres) {
        this.layer = "Intro";
        this.titreChapitre = "Intro";

        System.out.println("\n\nVeuillez rentrer le titre de votre eZoomBook\n");
        String titre = DemandeString();

        this.texte = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>\n"
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\"\n"
                + "  \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "  <title>ENTRER LE TITRE DU COURS</title>\n"
                + "  <link href=\"../Styles/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n"
                + "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "  <p><a id=\"i1\"></a></p>\n"
                + "\n"
                + "  <h1>" + titre + "</h1>\n"
                + "\n"
                + "  <p style=\"text-align: center;\"><img alt=\"\" height=\"240\" src=\"../Images/head.png\" width=\"240\" /><br /></p>\n"
                + "\n"
                + "  <p style=\"text-align: center;\"><b>Responsable du cours</b></p>\n"
                + "\n"
                + "  <p>Entrer texte d'introduction</p><!--StartFragment--><!--EndFragment-->\n"
                + "\n"
                + "  <h3 id=\"sigil_toc_id_1\" style=\"text-align: center;\">Comment utiliser ce livre</h3>\n"
                + "\n"
                + "  <p>Entrer texte explicatif (comment utiliser l'eZoomBook)<br /></p><!--StartFragment--><!--EndFragment-->\n"
                + "\n"
                + "  <center>\n"
                + "    <table id=\"table\">\n"
                + "      <tr id=\"tr\">\n"
                + "        <td id=\"td\">Niveau</td>\n"
                + "\n";
        for (int k = 0; k < nomLayers.size(); k++) {
            this.texte += "        <td id=\"td\">" + nomLayers.get(k) + "</td>\n"
                    + "\n";
        }
        texte += "      </tr>\n"
                + "\n";

        for (int j = 0; j < nomChapitres.size(); j++) {
            this.texte += "      <tr id=\"tr\">\n"
                    + "        <td id=\"td\">" + nomChapitres.get(j) + "</td>\n";
            for (int i = 0; i < nomLayers.size(); i++) {
                this.texte += "\n"
                        + "        <td id=\"td\"><a href=\"../eZoomBook/" + nomChapitres.get(j) + "_" + nomLayers.get(i) + ".xhtml#n1\">Allez-y</a></td>\n";
            }
            this.texte += "      </tr>\n";
        }

        this.texte += "    </table>\n"
                + "  </center>\n"
                + "</body>\n"
                + "</html>";

    }

    public void pageVierge(ArrayList<String> nomChapitres, ArrayList<String> nomLayers, int i, int j) {

        this.texte = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>\n"
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\"\n"
                + "  \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "  <meta content=\"NOARCHIVE\" name=\"ROBOTS\" />\n"
                + "  <meta content=\"text/javascript\" http-equiv=\"content-script-type\" />\n"
                + "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n"
                + "  <link href=\"../Styles/style.css\" media=\"all\" rel=\"stylesheet\" type=\"text/css\" />\n"
                + "\n"
                + "  <title></title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "  <p><a id=\"s1\"></a></p>\n"
                + "\n"
                + "<td id=\"td\"><a href=\"../eZoomBook/intro.xhtml#n1\">Retour à l'introduction</a></td>"
                + "  <center>\n"
                + "    <table id=\"table\">\n"
                + "<tr id=\"tr\">";
        if (j == 0) {
            this.texte += "        <td id=\"td\">Niveau </td>\n"
                    + "\n"
                    + "        <td colspan=\""
                    + (nomLayers.size() - 1)
                    + "\">Aller au niveau   </td>\n"
                    + "      </tr>\n";
        } else if (j == nomLayers.size() - 1) {
            this.texte += "        <td colspan=\""
                    + (nomLayers.size() - 1)
                    + "\">Aller au niveau</td>\n"
                    + "        <td id=\"td\">Niveau </td>\n"
                    + "      </tr>\n";
        } else {
            this.texte += "        <td colspan=\""
                    + (j)
                    + "\">Aller au niveau</td>\n"
                    + "        <td id=\"td\">Niveau </td>\n"
                    + "\n"
                    + "        <td colspan=\""
                    + (nomLayers.size() - j - 1)
                    + "\">Aller au niveau</td>\n"
                    + "      </tr>\n";
        }

        this.texte += "<tr id=\"tr\">";

        for (int l = 0; l < nomLayers.size(); l++) {
            if (l == j) {
                this.texte += "\n"
                        + "        <td id=\"td\">"
                        + nomLayers.get(l)
                        + "</td>\n";
            } else {
                this.texte += "\n"
                        + "<td id=\"td\"><a href=\"../eZoomBook/" + nomChapitres.get(i) + "_" + nomLayers.get(l) + ".xhtml#n1\">"
                        + nomLayers.get(l)
                        + "</a></td>\n";
            }

        }
        this.texte += "      </tr>\n"
                + "    </table>\n"
                + "  </center>\n";

        if (i > 0) {
            this.texte += "<td id=\"td\"><a href=\"../eZoomBook/" + nomChapitres.get(i - 1) + "_" + nomLayers.get(j) + ".xhtml#n1\">&lt;&lt;Chapitre précédent</a></td>";
        }
        this.texte += "\n"
                + "  <h1 id=\"sigil_toc_id_3\">Synthèse</h1>\n"
                + "\n"
                + "  <h2 id=\"sigil_toc_id_4\">TITRE 1</h2>\n"
                + "\n"
                + "  <h3 class=\"sigil_not_in_toc\">SOUS TITRE</h3>\n"
                + "\n"
                + "  <p>ENTRER LE COURS&nbsp;</p>\n";
        if (i < nomChapitres.size() - 1) {
            this.texte += "<td id=\"td\"><a href=\"../eZoomBook/" + nomChapitres.get(i + 1) + "_" + nomLayers.get(j) + ".xhtml#n1\">&gt;&gt;Chapitre suivant</a></td>";
        }
        this.texte += "</body>\n"
                + "</html>";
    }

    public void ecrireStyle() {
        this.texte = "a{\n"
                + "	color:#444;\n"
                + "}\n"
                + "\n"
                + "a:hover{\n"
                + "	font-weight:bold;\n"
                + "}\n"
                + "\n"
                + "body{\n"
                + "	background-color:rgb(255,255,218);\n"
                + "}\n"
                + "\n"
                + ".header {\n"
                + "   position:fixed;\n"
                + "   background:rgb(220,250,225);\n"
                + "   height:50px;\n"
                + "   top:0;\n"
                + "   left:0;\n"
                + "   right:0;\n"
                + "}\n"
                + ".content {\n"
                + "   padding:50px 0 50px 0;\n"
                + "}";
    }
}
