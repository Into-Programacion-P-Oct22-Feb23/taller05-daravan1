/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valor_kwh;
        double numero_kw;
        double valor_planilla;
        int descuento = 10;
        int edad;

        System.out.println("Ingrese el valor de costo por kilovatio/hora:");
        valor_kwh = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en "
                + "el mes:");
        numero_kw = entrada.nextDouble();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();

        valor_planilla = valor_kwh * numero_kw;

        if (edad > 65) {
            valor_planilla = valor_planilla - (valor_planilla / descuento);
        }

        System.out.println("El valor a cancelar es " + valor_planilla);

    }

}
