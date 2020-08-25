/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftex3;

/**
 *
 * @author Lia Alflen
 */
public class GFTEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        
        contaCorrente.setNumero(584652);
        contaCorrente.setTitular("Aryadne");
        contaCorrente.setSaldo(450.0);
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
        contaPoupanca.setNumero(789542);
        contaPoupanca.setTitular("Rafael");
        contaPoupanca.setSaldo(150);
        
        System.out.println(String.format("Conta corrente: %s",contaCorrente));
        System.out.println(String.format("Conta poupança: %s",contaPoupanca));
    }
    
}
