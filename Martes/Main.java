import java.util.Scanner;

public class Main{

	//Menu para la calculadora
	public static int menu(){
		int opcion;
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t***Calculadora de numeros complejos***");
        System.out.println("\n\t******1) Sumar ******");
        System.out.println("\n\t******2) Restar ******");
        System.out.println("\n\t******3) Multiplicar *");
        System.out.println("\n\t******4) Dividir *****");
        System.out.println("\n\t******5) Angulo ******");
        System.out.println("\n\t******6) Magnitud ****");
        System.out.println("\n\t******7) Salir *******");
        System.out.print("Elige tu opción: ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static void main(String args[]){   
    	//Declaracion de variables
    	int opcion, booleano = 1;
    	double real, complejo;
    	//Declaracion e instancia para los numeros     
        CalComplejos num1 = new CalComplejos(); 
        CalComplejos num2 = new CalComplejos();
        CalComplejos res = new CalComplejos();
        //Declaracion de la entrada de datos por teclado
       	Scanner sc = new Scanner (System.in);

        System.out.println("\nIngresa los numeros...");
        System.out.println("\nNumero 1: ");
        System.out.println("\n\tParte real: ");
        real = sc.nextDouble();
        num1.setReal(real);
		System.out.println("\n\tParte compleja: ");
        complejo = sc.nextDouble();
        num1.setComplejo(complejo);

        System.out.println("\nNumero 2: ");
        System.out.println("\n\tParte real: ");
        real = sc.nextDouble();
        num2.setReal(real);
		System.out.println("\n\tParte compleja: ");
        complejo = sc.nextDouble();
        num2.setComplejo(complejo);



        do{

            opcion = menu();
            
            switch(opcion){
            	//SUMA
                case 1: 

                    res.suma(num1,num2);
                    System.out.println(res.toString());
                    System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //RESTA
                case 2:

   					res.resta(num1, num2);
   					System.out.println(res.toString());
   					System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //MULTIPLICACION
                case 3:

           			res.multiplicacion(num1,num2);
           			System.out.println(res.toString());
           			System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //DIVISION
                case 4:

 					res.division(num1,num2);
 					System.out.println(res.toString());
 					System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //ANGULOS
                case 5:

                 	res.setAngulo(num1);
                 	System.out.println("\nEl angulo del numero complejo #1 es: " + res.getAngulo()) ;
                 	res.setAngulo(num2);
                 	System.out.println("\nEl angulo del numero complejo #2 es: " + res.getAngulo());
                 	System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //MAGNITUDES
                case 6:

                	res.setMagnitud(num1);
                	System.out.println("\nLa magnitud del numero complejo #1 es: " + res.getMagnitud());
                	res.setMagnitud(num2);
                	System.out.println("\nLa magnitud del numero complejo #2 es : " + res.getMagnitud());
                	System.out.println("\n¿Quieres hacer otra operacion? :  1/Si 0/No");
                    booleano = sc.nextInt();

                break;

                //SALIR
                case 7:

                	System.out.println("\nHasta luego...");
               		booleano = 0;

               	break;

                default:

                	System.out.println("\nOpcion no valida, intenta de nuevo");
                	booleano = 1;

                break;
            }

        }while(booleano != 0);
    }
}