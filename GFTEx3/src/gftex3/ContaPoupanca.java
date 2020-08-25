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
public class ContaPoupanca extends Conta{

    @Override
    protected double rendimento() {
        return getSaldo()*0.05;
    }
}
