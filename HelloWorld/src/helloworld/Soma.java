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
public class Soma {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        float num1 = s.nextFloat();
        
        System.out.print("Digite o segundo numero: ");
        float num2 = s.nextFloat();
                
        float m = (num1+num2)/2;
        
        System.out.format("a media de %.1f e %.1f é %.1f", num1, num2, m);
    }
}
