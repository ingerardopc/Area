
package areas;
import java.util.Scanner;

public class CalcularAreas {
    
    int opc;
    double n1, n2, res;
    Scanner sc = new Scanner(System.in);
    public CalcularAreas() {
              
    }

    public void calcularAreas(int opc) {
        
        
        switch(opc){
			case 1: System.out.print("Ingrese un lado : ");
			        n1 = sc.nextDouble();
			        res = n1 * n1;
			        System.out.print("Resultado: " + res);
                                
			 break;
			case 2: System.out.print("Ingrese la base: ");
			        n1 = sc.nextDouble();
			        System.out.print("Ingrese la altura: ");
			        n2 = sc.nextDouble();
			        res = n1 * n2;
			        System.out.print("Resultado: " + res);
			  break;
			case 3: System.out.print("Ingrese el radio: ");
			        n1 = sc.nextDouble();
			        res = Math.PI * Math.pow(n1,2);
			        System.out.print("Resultado: " + res);
			  break;
			case 4: System.out.print("Ingrese la base: ");
			        n1 = sc.nextDouble();
			        System.out.print("Ingrese la altura: ");
			        n2 = sc.nextDouble();
			        res = (n1 * n2)/2;
			        System.out.print("Resultado: " + res);
			        
			  break;
			  default: System.out.print("Opcion invalida!!!!");
		}//fin del switch
    }
   
    
}
