package test;

import classe.TabAlgos;
import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class TabAlgosTest {

    // ===========================
    // Tests pour plusGrand
    // ===========================
    @Test
    public void testPlusGrandPositifs() {
        int[] tab = {1, 2, 3, 4};

        assertEquals(4, TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandNegatifs() {
        int[] tab = {-5, -2, -8};

        assertEquals(-2, TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandMixte() {
        int[] tab = {-3, 0, 7};
        assertEquals(7,  TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandUneValeur() {
        int[] tab = {42};
        int value =  TabAlgos.plusGrand(tab) ;
        assertEquals(42,  TabAlgos.plusGrand(tab));
    }

    @Test
    public void testPlusGrandVide() {
        int[] tab = {};
        int value =  TabAlgos.plusGrand(tab) ;
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(new int[]{}));

    }

    @Test
    public void testPlusGrandNull() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(new int[]{}));
    }


    // ===========================
    // Tests pour moyenne
    // ===========================
    @Test
    public void testMoyennePositifs() {
        int[] tab = {2, 4, 6, 8};
        assertEquals(5.0, TabAlgos.moyenne(tab));
    }

    @Test
    public void testMoyenneNegatifs() {
        int[] tab = {-2, -4, -6};
        assertEquals(String.valueOf(-4.0), TabAlgos.moyenne(tab));
    }

    @Test
    public void testMoyenneMixte() {
        int[] tab = {-3, 0, 3};
        assertEquals(0.0, TabAlgos.moyenne(tab));
    }

    @Test
    public void testMoyenneUneValeur() {
        int[] tab = {5};
        assertEquals(5.0, TabAlgos.moyenne(tab));
    }

    @Test
    public void testMoyenneVide() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(new int[]{}));

    }

    @Test
    public void testMoyenneNull() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(new int[]{}));
    }



    // ===========================
    // Tests pour egaux
    // ===========================
    @Test
    public void testEgauxIdentiques() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertTrue(TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxElementsDifferents() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 2};
        assertFalse( TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxLongueursDifferentes() {
        int[] a = {1, 2};
        int[] b = {1, 2, 3};
        assertFalse( TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxUnNull() {
        int[] a = null;
        int[] b = {1, 2, 3};
        assertFalse(TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxDeuxNull() {
        int[] a = null;
        int[] b = null;
        assertTrue( TabAlgos.egaux(a, b));
    }

    @Test
    public void testEgauxVides() {
        int[] a = {};
        int[] b = {};
        assertTrue(TabAlgos.egaux(a, b));
    }
}