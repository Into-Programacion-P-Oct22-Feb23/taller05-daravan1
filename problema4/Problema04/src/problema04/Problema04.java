/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero_dias;
        double precio_dia;
        double subtotal;
        double descuento = 0;
        double total = 0;

        System.out.println("Ingrese el numero de dias de estadia:");
        numero_dias = entrada.nextInt();
        System.out.println("Ingrese el precio por dia de estadia:");
        precio_dia = entrada.nextDouble();

        subtotal = numero_dias * precio_dia;

        if (numero_dias > 5) {
            descuento = 10;
            descuento = (subtotal * descuento) / 100;
            total = subtotal - descuento;
        }
        if (numero_dias > 10) {
            descuento = 15;
            descuento = (subtotal * descuento) / 100;
            total = subtotal - descuento;
        }
        if (numero_dias > 15) {
            descuento = 20;
            descuento = (subtotal * descuento) / 100;
            total = subtotal - descuento;
        }

        System.out.printf("El subtotal es de: %.2f\nEl valor del descuento"
                + " es de: %.2f\nEl valor total a pagar es de: %.2f",
                subtotal, descuento, total);
    }

}
