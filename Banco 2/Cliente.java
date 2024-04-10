package Banco;

public class Cliente {
    String nome;
    String conta;
    String telefone;
    String email;
    String x, y, z;

    public Cliente(String nome, String conta, String telefone, String email) {
        this.nome = nome;
        this.conta = conta;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getConta() {
        return conta;
    }

    public void setNconta(String conta) {
        this.conta = conta;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }


}
