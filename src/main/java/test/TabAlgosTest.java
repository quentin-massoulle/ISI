package test;

import classe.TabAlgos;
import org.junit.Test;

import static org.junit.Assert.*;
public class TabAlgosTest {

    // ===========================
    // Tests pour plusGrand
    // ===========================
    @Test
    public void testPlusGrandPositifs() {
        int[] tab = {1, 2, 3, 4};
        int value =  TabAlgos.plusGrand(tab) ;
        assertEquals(4, TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandNegatifs() {
        int[] tab = {-5, -2, -8};
        int value =  TabAlgos.plusGrand(tab) ;
        assertEquals(-2, TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandMixte() {
        int[] tab = {-3, 0, 7};
        int value = TabAlgos.plusGrand(tab);
        assertEquals(7, value);
    }

    @Test
    public void testPlusGrandUneValeur() {
        int[] tab = {42};
        int value =  TabAlgos.plusGrand(tab) ;
        assertEquals(42, TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandVide() {
        int[] tab = {};
        int value =  TabAlgos.plusGrand(tab) ;
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandNull() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(null), "Tableau null doit lever une exception");
    }


    // ===========================
    // Tests pour moyenne
    // ===========================
    @Test
    public void testMoyennePositifs() {
        int[] tab = {2, 4, 6, 8};
        assertEquals(5.0, TabAlgos.moyenne(tab), "Moyenne d'un tableau positif");
    }

    @Test
    public void testMoyenneNegatifs() {
        int[] tab = {-2, -4, -6};
        assertEquals(String.valueOf(-4.0), TabAlgos.moyenne(tab), "Moyenne d'un tableau négatif");
    }

    @Test
    public void testMoyenneMixte() {
        int[] tab = {-3, 0, 3};
        assertEquals(0.0, TabAlgos.moyenne(tab), "Moyenne d'un tableau mixte");
    }

    @Test
    public void testMoyenneUneValeur() {
        int[] tab = {5};
        assertEquals(5.0, TabAlgos.moyenne(tab), "Moyenne d'un tableau à une seule valeur");
    }

    @Test
    public void testMoyenneVide() {
        int[] tab = {};
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(tab), "Tableau vide doit lever une exception");
    }

    @Test
    public void testMoyenneNull() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(null), "Tableau null doit lever une exception");
    }



    // ===========================
    // Tests pour egaux
    // ===========================
    @Test
    public void testEgauxIdentiques() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertTrue("Tableaux identiques", TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxElementsDifferents() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 2};
        assertFalse("Même longueur mais éléments différents", TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxLongueursDifferentes() {
        int[] a = {1, 2};
        int[] b = {1, 2, 3};
        assertFalse("Longueurs différentes", TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxUnNull() {
        int[] a = null;
        int[] b = {1, 2, 3};
        assertFalse("Un tableau null", TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxDeuxNull() {
        int[] a = null;
        int[] b = null;
        assertTrue("Les deux tableaux null", TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxVides() {
        int[] a = {};
        int[] b = {};
        assertTrue("Tableaux vides", TabAlgos.egaux(a, b));
    }
}