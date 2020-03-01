/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc2;


/* @author eko_c
* @version 1
 * Nombre: minicalcu
 * Descripcion General:
 * Tiene 2 metodos uno para sacar el valor absoluto y otro para sacar la raiz cuadrada
 */

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class minicalcu {
    /**
     * constructor vacio de la clase para poder usar los metodos
     */
    public minicalcu(){
        
    }
    /**
     * Metodo: getvalorabsoluto
     * Metodo que a traves de un Double devuelve su valor absoluto
     * @param x Double
     * @return valor absoluto de x
     */
    public double getvalorabsoluto(double x){
        return abs(x);
    }
    /**
     * Metodo: getraizcuadrada
     * Metodo que a traves de un Double devuelve su raiz cuadrada
     * @param x Double
     * @return raiz cuadrada de x
     */
    public double getraizcuadrada(double x){
        return sqrt(x);
    }
    
    public static void main(String[] args){
        // Llamamos a los metodos con un valor
        double x= 7;
        
        System.out.println(new minicalcu().getvalorabsoluto(x));
        System.out.println(new minicalcu().getraizcuadrada(x));
    }
}
