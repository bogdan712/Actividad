/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenprogramacion;
import java.util.Scanner;

/**
 *
 * @author bogda
 */
public class MetodoEstatico {
    public static void Ex () {
        double peso1,peso2,peso3,peso4,peso5 ,m,j,s, v,t,pm;
        System.out.println("Hola astronauta, ");
        Scanner teclado = new Scanner (System.in);
        final double GravedadMarte =3.72 ,GravedadVenus =8.87, GravedadTierra =9.8, GravedadJupiter=24.79,GravedadSaturno=10.44;
        char respuesta ='f';
        String Planeta;
        
        while(respuesta!='N'){
                System.out.println("Que planeta quieres elegir: ");
                System.out.println("Tienes como opcción entre Venus, Tierra, Marte, Jupiter y Saturno");
                Planeta=teclado.next();
            
            switch(Planeta){
                case "Venus":
                    System.out.println("Dime tu peso en kg: ");
                    v = teclado.nextInt();
                    peso1=v*GravedadVenus;
                    System.out.println("Tu peso en Venus sera de :" + peso1+ " Newton");
                    break;
                case"Tierra":
                    System.out.println("Dime tu peso en kg: ");
                    t = teclado.nextInt();
                    peso2=t*GravedadTierra;
                    System.out.println("Tu peso en la Tierra sera de :" + peso2+ " Newton");
                    break;
                case"Marte":
                    System.out.println("Dime tu peso en kg: ");
                    m = teclado.nextInt();
                    peso3=m*GravedadMarte;
                    System.out.println("Tu peso en Marte sera de :" + peso3 + " Newton");
                    break;
                case "Jupiter":
                    System.out.println("Dime tu peso en kg: ");
                    j = teclado.nextInt();
                    peso4=j*GravedadJupiter;
                    System.out.println("Tu peso en Jupiter sera de : " +peso4+ " Newton");
                    break;
                case "Saturno":
                    System.out.println("Dime tu peso en kg: ");
                    s = teclado.nextInt();
                    peso5=s*GravedadSaturno;
                    System.out.println("Tu peso en Saturno sera de "+peso5+ " Newton");
                    break;      
            }
            System.out.println("Quieres continuar, introduce N para salir :");
            respuesta = teclado.next().charAt(0);
        }
    }
}        
    
 

