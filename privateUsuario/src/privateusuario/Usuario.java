
package privateusuario;


public class Usuario {
    
    private String login = "vitorcamposfaz@gmail.com";
    private String senha = "0123";
    
    public boolean autenticar(String login, String senha){
        if (login == this.login && senha == this.senha) {
            System.out.println("Bem vindo!");
        } else if(login != this.login && senha != this.senha) {
            System.out.println("Login e senha incorretos");
        } else if (login != this.login) {
            System.out.println("Login incorreto");
        } else if (senha != this.senha){
            System.out.println("Senha incorreta");
        }
        return true;
    }
    
}
