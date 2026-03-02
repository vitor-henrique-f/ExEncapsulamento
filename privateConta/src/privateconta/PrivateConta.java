
package privateconta;


public class PrivateConta {

    
    public static void main(String[] args) {

    ContaBancaria conta = new ContaBancaria();
    
    conta.titular = "Vitor";
    conta.setSaldo(90);
    conta.getSaldo();
    conta.depositar(100);
    conta.getSaldo();
    conta.sacar(184);
    conta.getSaldo();
    
    }
    
}
