import java.io.IOException;
import java.util.Scanner;
/**
*Clase para el cifrado Cesar 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18 
*/

public class CifradoCesar {
	/**
    *Método de la clase principal
    *@param args Paso de argumentos por terminal
    */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        int codigo=3;
        int opcion;

        //Introducir el texto que se cifrará o descifrará posteriormente
            System.out.print("Introduce el texto a cifrar o descifrar: ");
            texto = sc.nextLine();

        //Introducir la operación a realizar: cifrar o descifrar*/
        do {
            System.out.print("1. Cifrar\n 2. Descifrar\n");
                opcion = sc.nextInt();

        //Condición para leer la opción uno o dos
        if (opcion == 1){
            System.out.println("Texto cifrado: " + cifradoC(texto, codigo));
        } else if (opcion == 2) {
            System.out.println("Texto descifrado: " + descifradoC(texto, codigo));
        } else {
            System.out.println("Número incorrecto, prueba otra vez");
        }

        } while (opcion != 1 && opcion != 2);

    }

    

    /**
    *Método para cifrado
    *@param texto Texto a crifrar
    *@param codigo Codigo para cifrar
    *@return Cadena de texto
    */
    public static String cifradoC(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    /**
    *Método para descifrado 
    *@param texto Texto a descifrar
    *@param codigo Codigo para descrifrar
    *@return Cadenad de texto
    */
    public static String descifradoC(String texto, int codigo) 
    {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) 
        {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') 
            {
                if ((texto.charAt(i) - codigo) < 'a')
                {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') 
            {
                if ((texto.charAt(i) - codigo) < 'A') 
                {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
} 
