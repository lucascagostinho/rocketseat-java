package conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Deposito de R$ " + valor + ". Saldo atual R$ " + this.saldo);
        } else {
            System.out.println("O valor de depósito é inválido");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + this.saldo);
        }
    }
}
