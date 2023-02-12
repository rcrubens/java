/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcrub
 */
public class ExemploWhile {
    public static void main(String[] args) {
        int j =10;
        while (j > Integer.parseInt(args[0])){
            System.out.println(j);
                j--;
        }
    }
}
