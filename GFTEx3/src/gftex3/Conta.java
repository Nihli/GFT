/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftex3;

/**
 *
 * @author Lia
 */
public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;
    
    protected abstract double rendimento();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString na classe pai pois não há necessidade de sobrescrever nos filhos já que o conteúdo é o mesmo.
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", rendimento=" + rendimento()+'}';
    }
    
    
}
