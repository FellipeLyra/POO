package Banco;

public class ContaCorrente {

    public ContaCorrente(double saldo2, String numero2) {
        this.saldo = 0.00;
    }

    static double saldo;

    String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    double depositar(double quantidade) {
        this.saldo += quantidade;
        return this.saldo;
    }

    double sacar(double quantidade) {
        this.saldo -= quantidade;
        return this.saldo;
    }

    double transfere(Conta nConta, double valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            this.sacar(valor);
            nConta.depositar(valor);
        }
        return this.saldo;
    }

}
