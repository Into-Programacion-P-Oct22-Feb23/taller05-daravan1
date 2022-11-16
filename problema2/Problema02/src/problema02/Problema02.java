/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidad;
        double precio_unidad;
        int descuento = 15;
        double costo_pedido;

        System.out.println("Ingrese la cantidad que se requiere:");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario:");
        precio_unidad = entrada.nextDouble();

        costo_pedido = cantidad * precio_unidad;

        if (cantidad > 50) {
            costo_pedido = costo_pedido - (costo_pedido / descuento);
        }

        System.out.printf("El valor a cancelar es %.2f", costo_pedido);
    }

}
