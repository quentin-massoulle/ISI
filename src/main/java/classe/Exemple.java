package classe;
/**
 * Package contenant la classe Exemple et d'autres classes utilitaires.
 */
public class Exemple {

    /** Attribut texte de l'objet. */
    private final String t;

    /** Attribut entier de l'objet. */
    private int v;

    /**
     * Constructeur initialisant l'attribut texte.
     *
     * @param texte valeur initiale du champ texte,
     * non modifiable dans le constructeur
     */
    public Exemple(final String texte) {
        this.t = texte; // affectation correcte au champ de l'objet
    }

    /**
     * Retourne la valeur de l'attribut entier.
     *
     * @return valeur de v
     */
    public final int getV() {
        return this.v;
    }

    /**
     * Modifie la valeur de l'attribut entier.
     *
     * @param valeur nouvelle valeur de l'attribut entier
     */
    public final void setV(final int valeur) {
        this.v = valeur; // évite le masquage de champ
    }

    /**
     * Retourne la valeur de l'attribut texte si v est positif,
     * sinon un message par défaut.
     *
     * @return valeur de t ou message "Valeur introuvable"
     */
    public final String getT() {
        if (this.v > 0) {
            return this.t; // accolades ajoutées pour Checkstyle
        } else {
            return "Valeur introuvable";
        }
    }
}
