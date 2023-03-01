package proyectosjavautn;

import java.util.Scanner;
public class clase1 {
    public static void main (String[] args){
        Scanner consola= new Scanner (System.in);
        
            System.out.println("Ingrese dos numeros");
        
            System.out.println("Inicial: ");
            int numInicio= consola.nextInt();
        
            System.out.println("Final: ");
            int numFinal= consola.nextInt();
        
        
        System.out.println("Impresion normal: ");
        while (numInicio<=numFinal){
            System.out.println(numInicio);
            numInicio++;
        }
        
        System.out.println("- - - - - - - - - - - - - - - -");
        
        System.out.println("Impresion de pares o impares? 1 para par y 2 para impar");
        var decision= consola.nextInt();
        
        System.out.println("Inicial: ");
        numInicio= consola.nextInt();
        System.out.println("Final: ");
        numFinal= consola.nextInt();
        
        if (decision==1){
            while (numInicio<numFinal){
                if (numInicio%2==0){
                    System.out.println(numInicio);
                }
                numInicio++;
            }
        } else {
            while (numInicio<numFinal){
                if (numInicio%2!=0){
                System.out.println(numInicio);
                }
                numInicio++;
            }
        }
        
            System.out.println("- - - - - - - - - - - - - - - - - - - -");
            System.out.println("Ingrese dos numeros para hacer reversa");
        
            System.out.println("Inicial: ");
            numInicio= consola.nextInt();
        
            System.out.println("Final: ");
            numFinal= consola.nextInt();
            
        for (int i=numFinal-1;i>=numInicio;i--){
            System.out.println(i);
        }
    }
}
