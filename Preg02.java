
package com.app.semanaa3;

import java.util.Scanner;


public class Preg02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro variables para el número a ingresar
        int numero;
        //Toma el valor ingresado por teclado
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un número:");
        numero = sc.nextInt();
        
        //Pasamos de int a String
        String numeros =String.valueOf(numero);
        
        //Hacemos un arreglo de caracteres
        char[] digitos = numeros.toCharArray();
        //Bucle para leer cada digito(cada elemento del arreglo)
        for (int i = 0; i < digitos.length; i++) {
            System.out.println(digitos[i]);
        }
    }
    
}
