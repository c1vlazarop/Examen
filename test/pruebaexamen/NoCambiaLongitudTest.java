/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class NoCambiaLongitudTest {
    
    public NoCambiaLongitudTest() {
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
     * Test of modificar method, of class NoCambiaLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8;
        int LongitudActual = 4;
        int posicion = 0;
        CambiaLongitud cambiaLongitud = new CambiaLongitud();
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.modificar(v, LongitudActual, posicion, cambiaLongitud);
        int []v2= new int[5];
        v2[0]=0;
        v2[1]=4;
        v2[2]=6;
        v2[3]=8;
        Assert.assertArrayEquals(v, v2);
    }
    
}
