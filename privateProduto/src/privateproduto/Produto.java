
package privateproduto;


public class Produto {
    
    private String nome;
    private double preco;
 
    public String getNome(){
        System.out.println(nome);
        return nome;
    } 
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    public double getPreco(){
        System.out.println(preco);
        return preco;
    }
    
    public void setPreco(double preco){
        if (preco >= 0) {
        this.preco = preco;
        } else {
            System.out.println("Preço inválido");
        }
    }
    
}
