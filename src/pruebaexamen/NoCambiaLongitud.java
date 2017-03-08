/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

/**
 *
 * @author alumno
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class NoCambiaLongitud extends Vector {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
    public void modificar(int[] vector, int LongitudActual, int posicion, CambiaLongitud cambiaLongitud) {
        int i;
        //Mostramos los elementos del array
        final int longitud = vector.length;
        cambiaLongitud.visualizar(longitud, vector);
        //Modificamos el array
        if (posicion < longitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        cambiaLongitud.visualizar(longitud, vector);
    }

}
//+++++++++++++++++++++++++++++++++++