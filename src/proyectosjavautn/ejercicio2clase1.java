package proyectosjavautn;
import java.util.Scanner;

public class ejercicio2clase1 {
    public static void main (String[] args){
        Scanner consola= new Scanner (System.in);
        int puntosIA=0;
        
        System.out.println("Ingrese los ingresos mensuales de su hogar:");
        float ingresosH= Float.parseFloat(consola.nextLine());
        if (ingresosH>=489083){
            puntosIA++;
        } else {
            System.out.println("Cuantos vehiculos posee?");
            int autosP= consola.nextInt();
            System.out.println("La antiguedad es menor a 5 años?");
            String autoAntiguedad= consola.nextLine();
            if (autosP>2 && autoAntiguedad == "Si" || autoAntiguedad == "si"){
                puntosIA++;
            } else {
                System.out.println("Cuantos inmuebles posee?");
                int inmuebles= consola.nextInt();
                if (inmuebles>2){
                    puntosIA++;
                } else {
                    System.out.println("Posee una embarcacion, aeronave o es titular de activos ...?");
                    String embAerAct=consola.nextLine();
                    if (embAerAct == "Si" || embAerAct == "si")
                        puntosIA++;
                }
            }
        }
        if (puntosIA!=0){
            System.out.println("Pertenece a la clase de ingresos altos");
        } else {
            System.out.println("No pertenece a la clase de ingresos altos");
        }
    }
}

//Determinar si una persona pertenece al segmento de ingresos altos
//Si el ingreso mensual total del hogar es igual o mayor a $489.083
//Tener 3 o más vehiculos
    //con antiguedad menor a 5 años
//Tener 3 o más inmuebles
//Poseer una embarcación
    //aeronave de lujo
    // ser titular de activos societarios que demuestren capacidad economica plena

// HACER UNA TABLA DE ENTRADAS Y SALIDAS como la del monotributo
// HACER UN ARBOL DE DECISION PARA RESOLVER EL PROBLEMA