public class ChequeEspecial extends ContaCorrente{
    public ChequeEspecial(double saldo2){
        super(saldo2);
    }
    
    public void cheque(){
        this.saldo = saldo * 2;
    }

    public static void main (String[] args){
        System.out.println(saldo);
        get.depositar(500);
    }
}
