
package protectedpessoa;


public class Aluno extends Pessoa {
    public void setIdade(int idade){
        if (idade > 0) {
            this.idade = idade;
            System.out.println("A idade do aluno é " + idade);
        } else {
            System.out.println("Idade inválida");
        }
    }
}
