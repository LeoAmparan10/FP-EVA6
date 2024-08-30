/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUESTRO ESCANER
        Scanner captu;
        captu = new Scanner(System.in);
        
        //capturar:
        System.out.println("captura tu nombre completo");
        nombre = captu.nextLine();
        
        System.out.println("Capura tu CURP");
        curp = captu.nextLine();
        
        System.out.println("Captura tu edad");
        edad = captu.nextInt();
        
        System.out.println("Captura el promedio");
        promedio = captu.nextDouble();
        
        //IMPRECION:
        System.out.println("SECCIÓN DE IMPRESIÓN DE DATOS");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
        
    }
    
}
