/**
*Clase principal del programa 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
import java.util.*;


public class Hanoi { 
    /**
    *Método principal de la clase
    *@param args Recibe argumentos desde terminal
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aros;
        System.out.println("Numero de aros que pasaras: ");
        aros = entrada.nextInt();
        Hanoi(aros,1,2,3); 
    } 
    /**En esta parte empieza a mostar en salida estandar como se van cambiando los aros de una torre a otra.
    Siendo origen la torre en la que comienza
    Auxiliar la torre media
    y destino la torre final.
    */

    /** 
    *Método que lleva a cabo el cambio de aros a través de recursividad
    *@param aros  Numero de aros
    *@param origen Origen de los aros
    *@param auxiliar Torre media
    *@param destino Destino de los aros final
    */
  public static void Hanoi(int aros, int origen,  int auxiliar, int destino){
    if(aros == 1){
    System.out.println("mover disco de " + origen + " a " + destino);
    }else{
       Hanoi(aros - 1, origen, destino, auxiliar);
      System.out.println("mover disco de "+ origen + " a " + destino);
      Hanoi(aros - 1, auxiliar, origen, destino);
    }
 }

}