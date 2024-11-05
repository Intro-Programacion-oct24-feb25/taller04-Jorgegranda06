/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;
// import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaramos variables
        Scanner entrada = new Scanner(System.in);
        String reporte = "";
        double netflix;
        double youtubepremium;
        double dropbox;
        double spotify;
        double descuentoNetflix;
        double descuentoYoutubepremium;
        double descuentoDropbox;
        double costoDescuentoNetflix;
        double costoDescuentoYoutubepremium;
        double costoDescuentoDropbox;
        double totalServicios;
        
        System.out.println("Ingrese el valor de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor de youtubepremium");
        youtubepremium = entrada.nextDouble();
        System.out.println("Ingrese el valor de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor de spotyfy");
        spotify = entrada.nextDouble();
        
        descuentoNetflix = netflix*0.23;
        costoDescuentoNetflix = netflix-descuentoNetflix;
        
        descuentoYoutubepremium = youtubepremium*0.23;
        costoDescuentoYoutubepremium = youtubepremium-descuentoYoutubepremium;
        
        descuentoDropbox = dropbox*0.45;
        costoDescuentoDropbox = dropbox-descuentoDropbox;
        
        totalServicios = costoDescuentoNetflix+costoDescuentoYoutubepremium+
                costoDescuentoDropbox+spotify;
        
        System.out.printf("Reporte: %s\nNetflix: $%.2f\n"
                + "Youtubepremium: $%.2f\nDropbox: $%.2f\nSpotyfy: $%.2f\n"
                + "Total servicios: $%.2f\n",
                reporte,
                netflix,
                youtubepremium,
                dropbox,
                spotify,
                totalServicios);
    }
    
}
