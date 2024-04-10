public class Pessoa extends Cliente {
    private String cpf;
    
    public Pessoa(String nome, String nconta, String telefone, String email, String cpf){
        super(nome, nconta, telefone, email);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }



    public Pessoa(){
        this.setConta(new Conta(0,cpf));
    }
}
