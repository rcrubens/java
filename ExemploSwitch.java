/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcrub
 */
public class ExemploSwitch {
    public static void main(String[] args) {
        switch(args[0].charAt(0)) {
            case 'a': System.out.println("Vogal a");    
                break;
            case 'e': System.out.println("Vogal e");
                break;
            default: System.out.println("Nao eh vogal");
        }
    }
}
