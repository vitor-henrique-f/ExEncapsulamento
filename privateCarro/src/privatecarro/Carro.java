
package privatecarro;


public class Carro {
    
    private String marca;
    private String modelo;
    public int ano;
    
    public void setMarca(String marca){
      this.marca = marca;
    }
    
    public void setModelo(String modelo){
      this.modelo = modelo;
    }
    
    public String getMarca(){
        System.out.println(marca);
        return marca;
    }
    
    public String getModelo(){
        System.out.println(modelo);
        return modelo;
    }
    
    public void setAno(int ano){
        if (ano >= 1886) {
           this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }
    
}
