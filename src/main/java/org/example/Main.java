package org.example;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //CREANDO UN OBJETO DE LA CLASE SCANNER
        Scanner entradaPorTeclado=new Scanner(System.in);

        Invitado objetoInvitado = new Invitado();
        objetoInvitado.mostrarInvitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();
        //Invitado objetoInvitado=new Invitado("Santiago", "Misas", 28, "1152693454", true, 25000, 'A');

        // DEFINIENDO COSTOS
        System.out.println("******    FIESTA     ******");

        System.out.println("1. Costo de alimentos  :");
        double costosAlimentos=entradaPorTeclado.nextDouble();
        if (costosAlimentos>0) {objetoFiesta.costosAlimentos=costosAlimentos;}
        else {System.out.println("Ingrese un valor mayor a 0");}
        System.out.println("El costo de alimentos es: "+objetoFiesta.costosAlimentos);

        System.out.println("2. Costo de Bebidas  :");
        double costosBebidas=entradaPorTeclado.nextDouble();
        if (costosBebidas>0) {objetoFiesta.costosBebidas=costosAlimentos;}
        else {System.out.println("Ingrese un valor mayor a 0");}
        System.out.println("El costo de bebidas es: "+objetoFiesta.costosAlimentos);

        System.out.println("3. Costo de Lugar  :");
        double costosLugar=entradaPorTeclado.nextDouble();
        if (costosLugar>0) {objetoFiesta.costosLugar=costosLugar;}
        else {System.out.println("Ingrese un valor mayor a 0");}
        System.out.println("El costo de Lugar es: "+objetoFiesta.costosLugar);

        System.out.println("4. Costo de Equipos  :");
        double costosEquipos=entradaPorTeclado.nextDouble();
        if (costosLugar>0) {objetoFiesta.costosEquipos=costosEquipos;}
        else {System.out.println("Ingrese un valor mayor a 0");}
        System.out.println("El costo de equipos es: \n"+objetoFiesta.costosEquipos);
    }
}