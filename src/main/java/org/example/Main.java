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

        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("FIESTA");


        System.out.println("1.Gastos de comida:");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de alimento fue:"+objetoFiesta.getCostosAlimentos());


    }
}