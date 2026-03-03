
package privateporta;


public class Porta {
    
    private boolean aberta;
    
    public void abrir(){
      aberta = true;
        System.out.println("Você abriu a porta");
    }
    
    public void fechar(){
      aberta = false;
        System.out.println("Você fechou a porta");
    }
    
}
