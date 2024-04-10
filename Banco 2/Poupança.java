public class Poupança extends ContaCorrente{
    public Poupança(double saldo){
        super(saldo);
    }

    public void gerarTaxa(){
        saldo += saldo * 005;
    }
    
}
