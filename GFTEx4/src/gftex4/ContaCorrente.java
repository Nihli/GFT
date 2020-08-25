/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftex4;

/**
 *
 * @author Lia
 */
public class ContaCorrente extends Conta implements Imposto{
    
    @Override
    protected double rendimento() {
        return getSaldo()*0.03;
    }

    @Override
    public double calcularImposto() {
        return this.rendimento()*0.25;
    }
    
    //adiciona toString às classes filhas para colocar junto o calcularImposto.
    @Override
    public String toString() {
        return "Numero: " + getNumero() + ", titular: " + getTitular() + ", saldo: " + getSaldo() + ", rendimento: " + rendimento() + ", imposto: " + calcularImposto();
    }
    

}
