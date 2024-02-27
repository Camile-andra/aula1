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
public class HelloWorld {

    public static void main(String[] args) {        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.println("Olá "+nome);
    }
    
}
