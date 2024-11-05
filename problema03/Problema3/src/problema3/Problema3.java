/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
// import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaro variables 
        String reporte = "";
        String nombres = "Luis Alberto Carvajal Ludeña";
        String calles = "Calle primera entre segunda y decima";
        double costoMinuto = 1.5;
        double minutosConsumidos = 50;
        double costoPlanilla;
        
        System.out.println(reporte);
        System.out.println(nombres);
        System.out.println(calles);
        System.out.println(costoMinuto);
        System.out.println(minutosConsumidos);

        costoPlanilla = costoMinuto * minutosConsumidos;

        System.out.printf("Reporte: %s%nNombres: %s%n\tCalles: %s%n"
                + "costo Minuto: $ %s%n\tminutos consumidos: %s%n\t"
                + "costo planilla: $ %s%n\t",
                reporte,
                nombres,
                calles,
                costoMinuto,
                minutosConsumidos,
                costoPlanilla);
    }

}
