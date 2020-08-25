/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lia Alflen
 */
public class GFTEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("Por favor, entre com o número inicial do intervalo:");
            Scanner sc = new Scanner(System.in);
            int numInicial = sc.nextInt();

            System.out.println("Por favor, entre com o número final intevalo:");
            sc = new Scanner(System.in);
            int numFinal = sc.nextInt();

            if (numInicial<=0 || numInicial>numFinal){
                throw new RuntimeException("Número inicial deve ser maior que zero e menor ou igual ao número final.");
            }

            for(int i=0;i<=numFinal-numInicial;i++) {
                if ((numInicial+i)%2!=0) {
                    System.out.print(numInicial+i + " ");
                }
            }

        }catch(InputMismatchException e){
            System.out.println("Erro ao executar o programa. Erro: Entrada não é numérica.");
        }catch(Exception e){
            System.out.println("Erro ao executar o programa. Erro: " + e.getMessage());
        }
        
    }
    
}
