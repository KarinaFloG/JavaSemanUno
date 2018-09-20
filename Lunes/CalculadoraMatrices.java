import java.util.List;
import java.util.ArrayList;

public class CalculadoraMatrices{
        int elementos;
        int operacion;
        List<List<Integer>> matrizResultante = new ArrayList<List<Integer>>();


        //Constructor vacio
        public CalculadoraMatrices(){

        }

        //Sobrecarga del constructor
        public CalculadoraMatrices(int elementos){
                this.elementos = elementos;
//      		List<List<Integer>> matrizResultante = new ArrayList<List<Integer>>();
              	for(int i = 0; i < this.elementos; i++){
                       matrizResultante.add(new ArrayList<Integer>());
                 }
		}

        //Setter para elementos
        public void setElementos(int elementos){
                this.elementos = elementos;
        }

        //Gette para elementos
        public int getElementos(){
                return elementos;
        }

 //List<List<Integer>> matriz2 = new ArrayList<List<Integer>>();

        //Método para la suma
        public List<List<Integer>> suma(List<List<Integer>> matriz1, List<List<Integer>> matriz2){
			 for(int j = 0; j <= (matriz1.get(0).size())/2; j++ ){
				for(int k= 0; k<= (matriz2.get(0).size())/2; k++){
                        		operacion = matriz1.get(j).get(k) + matriz2.get(j).get(k);
        		        matrizResultante.get(j).add(operacion);
            		}
        		}
       	return matrizResultante;
        }
}
