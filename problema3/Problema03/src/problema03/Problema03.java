/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;

        System.out.println("Ingrese la marca del vehiculo:");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del vehiculo:");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del vehiculo:");
        costo = entrada.nextDouble();

        precio_venta = costo;
        impuesto = 0;

        if (origen.equals("Alemania")) {
            impuesto = 20;
            impuesto = (costo * impuesto) / 100;
            precio_venta = costo + impuesto;
        }
        if (origen.equals("Japón")) {
            impuesto = 30;
            impuesto = (costo * impuesto) / 100;
            precio_venta = costo + impuesto;
        }
        if (origen.equals("Italia")) {
            impuesto = 15;
            impuesto = (costo * impuesto) / 100;
            precio_venta = costo + impuesto;
        }
        if (origen.equals("USA")) {
            impuesto = 8;
            impuesto = (costo * impuesto) / 100;
            precio_venta = costo + impuesto;
        }

        System.out.printf("El valor del impuesto es de: %.2f\n"
                + "El precio de venta es: %.2f", impuesto,
                precio_venta);
    }

}
