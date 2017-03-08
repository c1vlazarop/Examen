/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author alumno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of borrar method, of class CambiaLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        int LongitudActual = 4;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(v, LongitudActual, posicion);
        int []v2= new int[5];
        v2[0]=4;
        v2[1]=6;
        v2[2]=8;
        Assert.assertArrayEquals(v, v2);
    }

    /**
     * Test of insertar method, of class CambiaLongitud.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8;
        int LongitudActual = 4;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(v, LongitudActual, posicion);
        v[posicion] = 2;
        int []v2= new int[5];
        v2[0]=2;
        v2[1]=2;
        v2[2]=4;
        v2[3]=6;
        v2[4]=8;
        Assert.assertArrayEquals(v, v2);
    }
    
}
