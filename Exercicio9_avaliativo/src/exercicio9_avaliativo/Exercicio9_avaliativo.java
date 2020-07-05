/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio9_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        int n, s, i;
        System.out.println("Digite um número: ");
        n = result.nextInt();
        s = 0;
        i = 0;
        
        while (i < n)
        {
            i = i+1;
            s = s+1;
            i++;
        }
         System.out.println("O resultado é: "+s);
         
    }
    
}
