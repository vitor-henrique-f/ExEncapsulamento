
package privateconta;


public class ContaBancaria {
    
    public String titular;
    private double saldo;
    
    public void setSaldo(double saldo){
        if (saldo > 0) {
          this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido");
        }
    }
    
    public double getSaldo(){
        System.out.println(saldo);
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }
    }
    
    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
}
