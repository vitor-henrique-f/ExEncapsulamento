
package privatefuncionario;


public class Funcionario {
    
    private String nome;
    private double salario;
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    public String getNome(){
        System.out.println(nome);
        return nome;
    }
    
    public void setSalario(double salario){
        if (this.salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário invalido");
        }
    }
    
    public double getSalario(){
        System.out.println(salario);
        return salario;
    }
    
}
