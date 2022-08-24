
package atividade1.pkg23.pkg08;

import java.util.Scanner;


public class Atividade12308 {

    
     
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int perm, mom, norm, mult1, mult2, mult3;
        
        System.out.println("Digite a velocidade permitida na via: ");
        perm = grava.nextInt();
        System.out.println("Digite a velocidade que está no momento: ");
        mom = grava.nextInt();
        
        mult1 = perm + 10;
        mult2 = perm + 39;
               
        if (mom < mult1){
            System.out.println("Velocidade Tolerada!");
        }
        else if (mom == mult1){
            System.out.println("MULTA DE 80,00!");
        }
        else if (mom <= mult2){
            System.out.println("MULTA DE 120,00!");
        }
        else {
            System.out.println("MULTA DE 200,00!");
        }
        
    }
    
}
