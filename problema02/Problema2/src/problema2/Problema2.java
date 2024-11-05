/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
// import java.util.Scanner;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaro variables
        Scanner entrada = new Scanner(System.in);
        double gastosHijo1;
        double gastosHijo2;
        double gastosHijo3;
        double gastoTotal;
        
        System.out.println("Ingrese gastos del primer hijo");
        gastosHijo1 = entrada.nextDouble();
        System.out.println("Ingrese gastos del segundo hijo");
        gastosHijo2 = entrada.nextDouble();
        System.out.println("Ingrese gastos del tercer hijo");
        gastosHijo3 = entrada.nextDouble();
        
        gastoTotal = gastosHijo1 + gastosHijo2 + gastosHijo3;
        
        System.out.printf("Gastos hijo 1:%s%n Gastos hijo 2:%s%n"
                + "Gastos hijo 3:%s%n Gastos Totales:%s",
                
                gastosHijo1,
                gastosHijo2,
                gastosHijo3,
                gastoTotal);
    }
}

