
package areas;
import java.util.Scanner;

public class Areas {

    
    public static void main(String[] args) {
            
    int opc;
    String x;
	do{
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Menu de Operaciones\n\n" + 
		                    "1. Area cuadrado\n" + 
				            "2. Area rectangulo\n" + 
		                    "3. Area circulo\n" + 
				            "4. Area triangulo\n" + 
		                    "Seleccione una opcion:");
	opc = sc.nextInt();
                             
        CalcularAreas obj = new CalcularAreas();
        obj.calcularAreas(opc); 
        System.out.println("\nQuieres encontrar otra area?");
        Scanner scc = new Scanner(System.in);
        x = scc.nextLine();
        }while(x.equals("S")||x.equals("s"));
                
		
				
	}//fin del main
    }
    

