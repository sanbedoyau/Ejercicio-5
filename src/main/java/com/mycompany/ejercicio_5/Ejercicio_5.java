package com.mycompany.ejercicio_5;

import java .util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z = 0;
        System.out.println("Ingrese el valor de x: ");
        x = input.nextDouble();
        System.out.println("Ingrese el valor de y: ");
        y = input.nextDouble();
        z = z + x;
        x = x + Math.pow(y, 2);
        z = z + (x/y);
        System.out.println("El valor de la suma es: " + z);
    }
}
