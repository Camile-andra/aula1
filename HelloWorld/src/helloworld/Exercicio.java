/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author 1012412400
 */
public class Exercicio {
    public static void main (String[] arg){
        //    1- calcular a media de 3 numeros
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = s.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = s.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        int num3 = s.nextInt();
        
        int m = (num1 + num2 + num3)/3;
        
        System.out.println("A media dos 3 numeros é " + m);
        
        System.out.println("");
        // 2- Calculasar a media ponderada de 3 numeros com os pesos 3, 5 e 8

        System.out.print("Digite o primeiro numero: ");
        int num11 = s.nextInt();
        int p1 = num11*3;
        
        
        System.out.print("Digite o segundo numero: ");
        int num21 = s.nextInt();
        int p2 = num21*5;
        
        System.out.print("Digite o terceiro numero: ");
        int num31 = s.nextInt();
        int p3 = num31*8;
        
        int mp = (p1 + p2 + p3)/3;
        
        System.out.println("A media ponderada dos 3 numeros é " + mp);
        
        System.out.println("");
        

        //Calculadora de area do quadrado
        System.out.print("Digite o valor da altura: ");
        int l = s.nextInt();
        
        System.out.print("Digite o valor do lado: ");
        int a =s.nextInt();
        
        int area =  l * a;
        
        System.out.print("a area do quadrado é: "+area);
    

        System.out.println("");
        
//        calculadora da area de um circulo

        System.out.println("Digite o raio: ");
        int r = s.nextInt();
        
        int pi = 3;

        int circulo = pi * (r*r);
        
        System.out.println("A area do circulo é: " + circulo);
    }
    
    
    
    
}
