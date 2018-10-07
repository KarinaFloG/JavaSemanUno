/**
*Clase principal del programa 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

import java.util.Scanner;

//Se dibuja un rombo hecho con asteriscos, sinedo j las filas y k las columnas
//valor = el tamaño 
//num = los asteriscos
public class Rombo {
    /**
    *Método principal de la clase
    *@param args Recibe argumentos desde terminal
    */
    public static void main(String[] args)

    {
        //Atributos de clase
        int valor;
        int num;

        int i = 0;
        int j = 0;
        int k = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\t Introduce tamaño de tu rombo: ");

        valor =entrada.nextInt();
        num = (valor+(valor-1));

        
        //Parte superior del rombo
        //en k se la suma 2 asteriscos a la columna anterior/siguiente
        
        for(i=1;i<=num;i=i+2)
        {
            for(k=num+1;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Parte inferior del rombo
         for(i=num;i>=1;i=i-2)
        {
            for(k=i;k<=num+2;k=k+2)
            {
                System.out.print(" ");
            }

             /**Mostramos los asteriscos*/
            for(j=i-2;j>0;j--)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}