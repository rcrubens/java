/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcrub
 */

import java.util.Scanner;
public class ExemploDoWhile {
    public static void main(String[] args) {
        int min, max;
        Scanner entradas = new Scanner(System.in);
        System.out.print("Digite o valor minimo: ");
        min = entradas.nextInt();
        System.out.print("Digite o valor maximo: ");
        max = entradas.nextInt();
        do {
            System.out.println("" + min + " < " + max);
            min++;
            max--;
        } while (min < max);
        
        System.out.println("" + min + " < " + max + " Condicao invalida.");
                           
    }
}
