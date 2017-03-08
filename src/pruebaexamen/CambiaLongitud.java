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
public class CambiaLongitud extends Vector{

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

//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int[] vector, int LongitudActual, int posicion){
        int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
        final int longitud = vector.length;
        visualizar(longitud, vector);   
         //Borramos el elemento
       	 if(posicion<longitud){ 
             System.out.println("Elemento a borrar=" + vector[posicion]);                                       
            for (i = posicion; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
          }
   //Mostramos los elementos del array  
        visualizar(longitud, vector);         
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int[] vector, int LongitudActual, int posicion){
    int i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
        final int longitud = vector.length;
        visualizar(longitud, vector);
         //Borramos el elemento
       	 if(posicion<longitud){ 
             System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
          }
   //Mostramos los elementos del array  
        visualizar(longitud, vector);         
      }



}
//+++++++++++++++++++++++++++++++++++