/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftex2;

/**
 *
 * @author Lia Alflen
 */
public class GFTEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lia");
        pessoa.setEndereco("Rua X");
        pessoa.setTelefone("34851266");
        
        System.out.println(pessoa.toString());
    }
    
}
