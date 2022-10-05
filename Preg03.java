
package com.mycompany.ejercicio03;


import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        int r, suma = 0, temp, n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n = entrada.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            suma = (suma * 10) + r;
            n = n / 10;
        }
        if (temp == suma) {
            System.out.println("SI es un numero capicua");
        } else {
            System.out.println("NO es capicua");
        }

    }
}
