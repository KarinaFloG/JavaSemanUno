import java.io.*; 
import javax.swing.JOptionPane;

/**
*Clase Principal 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Gato {
         /**
        *Método principal de la clase
        *@param args Paso de argumentos por terminal
        */
        public static void main(String[] args)throws IOException { 
        		//Variables de clase
                BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
                String tablero[][];
                tablero = new String[3][3];
                int n=0;
                int fila;
                int columna;
                for (int a=0; a<=2; a=a+1) {
                for (int b=0; b<=2; b=b+1) {
                tablero[a][b]=" ";
                int dato;
                int dato1;
                int datob;
                int datob2;
                }
 
                }


                System.out.println("\t*****GATO PERRON****");
                System.out.println("            0   1   2\n");
                System.out.println("        0   " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
                System.out.println("           -----------");
                System.out.println("        1   " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
                System.out.println("           -----------");
                System.out.println("        2   " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + "\n");
 
                while (n < 10) { 
                    int dato, dato1;
                    JOptionPane.showMessageDialog(null,"Es tu turno chavo *X* ");
 
                do{
                    dato=Integer.parseInt(JOptionPane.showInputDialog(" Introduce la fila: *Horizontal*"));
                }while (dato < 0 || dato > 2);
 
                do{
                    dato1=Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna: *Vertical*"));
                }while (dato1 < 0 || dato1 > 2);
 
 
                while (tablero[dato][dato1]== "X" || tablero[dato][dato1]== "O" ) { 
                    JOptionPane.showMessageDialog(null, "Sorry man, aqui no se puede tirar");
 
                    do{
                        dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame una fila: *Horizontal*"));
                    }while (dato < 0 || dato > 2);
                    
                    do{
                        dato1=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame una columna: *Vertical*"));
                    }while (dato1 < 0 || dato1 > 2);
                }

                tablero[dato][dato1] = "X";
                System.out.println("        \n Tu turno \n");
                System.out.println("            0   1   2\n");
                System.out.println("        0   "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]);
                System.out.println("           -----------");
                System.out.println("        1   "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]);
                System.out.println("           -----------");
                System.out.println("        2   "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2] + "\n");
 
                n = n + 1;
 
 
 
                //Se comprueban las jugadas
                if(tablero[0][0] == "X" && tablero[0][1] == "X" && tablero [0][2] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if(tablero[1][0] == "X" && tablero[1][1] == "X" && tablero [1][2] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }else if(tablero[2][0] == "X" && tablero[2][1] == "X" && tablero [2][2] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if (tablero[0][0] == "X" && tablero[1][0] == "X" && tablero [2][0] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if(tablero[0][1] == "X" && tablero[1][1] == "X" && tablero [2][1] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if(tablero[0][2] == "X" && tablero[1][2] == "X" && tablero [2][2] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if(tablero[0][0] == "X" && tablero[1][1] == "X" && tablero [2][2] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

                if(tablero[0][2] == "X" && tablero[1][1] == "X" && tablero [2][0] == "X"){
                    JOptionPane.showMessageDialog(null, "Win !!! Ya eres becario");
                    break;
                }

 
                if(n == 9){
                    break;
                }
 
                JOptionPane.showMessageDialog(null,"Turno del otro man *Circulo*");
 
                int datob;
                datob = (int)(Math.random() * 3) + 0;
 
                int datob2;
                datob2 = (int)(Math.random()*3)+0;
                JOptionPane.showMessageDialog(null,"Y por suerte toco..." + "\nFila: "+datob+"\nColumna: "+datob2);
                System.out.println("\n Turno del rival \n");

                while(tablero[datob][datob2] == "O" || tablero[datob][datob2] == "X" ){
                        datob = (int)(Math.random() * 3) + 0;
                        datob2 = (int)(Math.random() * 3) + 0;
                }

                tablero[datob][datob2] = "O";

                System.out.println("            0   1   2\n");
                System.out.println("        0   "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]);
                System.out.println("           -----------");
                System.out.println("        1   "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]);
                System.out.println("           -----------");
                System.out.println("        2   "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2] + "\n");
 
                n = n + 1;

            //Mensaje de perdida
            if(tablero[0][0] == "O" && tablero[0][1] == "O" && tablero [0][2]  == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[1][0] == "O" && tablero[1][1] == "O" && tablero [1][2] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[2][0] == "O" && tablero[2][1] == "O" && tablero [2][2] == "O"){
                 JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[0][0] == "O" && tablero[1][0] == "O" && tablero [2][0] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[0][1] == "O" && tablero[1][1] == "O" && tablero [2][1] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[0][2] == "O" && tablero[1][2] == "O" && tablero [2][2] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[0][0] == "O" && tablero[1][1] == "O" && tablero [2][2] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(tablero[0][2] == "O" && tablero[1][1] == "O" && tablero [2][0] == "O"){
                JOptionPane.showMessageDialog(null, "Poli logro ganarte");
                break;
            }

            if(n == 9){ 
                break;
            }
 
        }
 
    }
}