
package atividade2.pkg23.pkg08;

import java.util.Scanner;

public class Atividade22308 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double sal, val, tick, ir, desc;
        System.out.println("Digite seu sálario bruto ");
        sal = grava.nextDouble();
        
        val = sal - (sal * 0.02);
        tick = val - (val * 0.06);
        ir = tick - (tick * 0.07);
        desc = ir - (ir * 0.15);
        
        if (ir <= 1200){
            System.out.println("O salário liquido é: " + ir + "\n Não houve descontos!");
        }
        else{
            System.out.println("O salário liquido é: " + desc + "\n Com desconto de mais 15% de IR!");
        }
        
        
        
        
        
        
        
        
    }
    
}
