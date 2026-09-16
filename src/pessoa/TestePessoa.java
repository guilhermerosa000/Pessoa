/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author aluno
 */
public class TestePessoa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Guilherme", 24, "123.123.123-98");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ada Lovelace";
        pessoa2.idade = 46;
        pessoa2.cpf = "321.321.321-04";
        
        
        pessoa2.alterarDados("Dennis Ritchie", 82, "111.000.111-01");
        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.cpf);

    }
}
