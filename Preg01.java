
package com.app.semanaa3;

import java.util.Scanner;


public class Preg01 {

    
    public static void main(String[] args) {
        
        int numero=0;
        double resultado=0,a,b;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese número");
        numero=sc.nextInt();
        
        //Desarrollo
        a=numero+3;
        b=numero+4;
        resultado=(a/b)-0.75f;
        System.out.println(resultado);
    }
    
}
