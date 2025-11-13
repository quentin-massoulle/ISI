package classe;

public final class TabAlgos {

    /** Renvoie la valeur la plus grande d'un tableau.
     * @throws IllegalArgumentException si tab est null ou vide.
     **/
    public static int plusGrand(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être null ou vide.");
        }
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /** Calcul la moyenne des valeurs d'un tableau.
     * @throws IllegalArgumentException si tab est null ou vide.
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être null ou vide.");
        }
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return (double) somme / tab.length;
    }

    /** Teste si 2 tableaux sont identiques (avec les éléments dans le même ordre) **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1 == tab2) return true; // même référence ou tous deux null
        if (tab1 == null || tab2 == null) return false;
        if (tab1.length != tab2.length) return false;
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }
}