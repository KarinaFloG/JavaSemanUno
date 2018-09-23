public class CalComplejos{

    private double pReal = 0.0;
    private double pCompleja = 0.0;
    private double magnitud;
    private double angulo;
    
    //Constructor vacio
    public CalComplejos(){

    }

    //Constructor con parametros
    public CalComplejos(double pReal, double pCompleja){
        this.pCompleja = pCompleja;
        this.pReal = pReal;
        this.magnitud = 0;
        this.angulo = 0;        
    }    
   
    //Setter para el numero real
    public void setReal(double pReal){
        this.pReal = pReal;
    }    
    
    //Getter para el numero real
    public double getReal(){
        return pReal;
    }    

    //Setter para el numero complejo
    public void setComplejo(double pCompleja){
        this.pCompleja = pCompleja;
    } 

    //Getter para el numero complejo
    public double getComplejo(){
        return pCompleja;
    }    

    //Suma de numeros complejos
    public void suma(CalComplejos num1, CalComplejos num2){        
        this.pReal = num1.getReal() + num2.getReal();
        this.pCompleja = num1.getComplejo() + num2.getComplejo();
    }    
   

    //Resta de numeros complejos
    public void resta(CalComplejos num1, CalComplejos num2){        
        this.pReal = num1.getReal() - num2.getReal();
        this.pCompleja = num1.getComplejo() - num2.getComplejo();
    }    

   
    //Multiplicacion de numeros complejos
    public void multiplicacion(CalComplejos num1, CalComplejos num2){
        double real;
        double comp;

        real = (num1.getReal() * num2.getReal()) - (num1.getComplejo() * num2.getComplejo());
        comp = (num1.getReal() * num2.getComplejo() ) + (num1.getComplejo() * num2.getReal());
    
        this.pReal = real;
        this.pCompleja = comp;
    }

    //Division de numeros complejos
    public void division(CalComplejos num1, CalComplejos num2){

        double real = 0;
        double comp = 0;

        real = ((num1.getReal()*num2.getReal()) + (num1.getComplejo()*num2.getComplejo()))/((num2.getReal()*num2.getReal())+ (num2.getComplejo()*num2.getComplejo()));
        comp = ((num1.getReal()*num2.getComplejo()) - (num1.getComplejo()*num1.getReal()))/((num2.getReal()*num2.getReal())+(num2.getComplejo()*num2.getComplejo()));
    
        this.pReal = real;
        this.pCompleja = comp;
    }

    //Setter del angulo del numero
    public void setAngulo(CalComplejos num){
        angulo = Math.atan2(num.getComplejo(), num.getReal());  
        if(angulo < 0){   
            angulo = 2 * Math.PI + angulo;
        }else{
            angulo = (angulo * 180) / Math.PI;
        }
    }

    //Getter del angulo del numero
    public double getAngulo(){
        return angulo;
    }

    //Setter de la magnitud del numero  
    public void setMagnitud(CalComplejos num){
        magnitud = Math.sqrt(Math.pow(num.getReal(),2) + Math.pow(num.getComplejo(),2));
    }

    //Getter de la magnitud del numero
    public double getMagnitud(){
        return magnitud;
    }

    //Sobreescritura del método toString
    public String toString(){
        if (this.getComplejo() < 0.0){
            return "\nEl resultado es: " + this.getReal() + " + i " + -this.getComplejo();
        }
        else{
             return "\nEl resultado es: " + this.getReal() + " + i " + this.getComplejo();
        }
    }


}