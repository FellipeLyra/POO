package Banco;

class Conta{
    double saldo = 0;


    public double getSaldo(){
        return this.saldo;
    }

    void depositar(double quantidade){
        this.saldo = this.saldo + quantidade;
    }


    void sacar(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }


    void transfere(Conta nConta, double valor){
        this.saldo = this.saldo - valor;
        nConta.saldo = nConta.saldo + valor;

        if (this.saldo < valor){
            System.out.println("Valor insuficiente para transferência");
        } else{
            this.saldo = this.saldo - valor;
            System.out.println("Transferido o valor de: "+ this.saldo);
        }
    }

}
