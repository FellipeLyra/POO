package Banco;
import java.util.Random;
import java.util.ArrayList;

public class Cliente {
    String nome;
    String cpf;
    int nconta;
    String tel;


    public Cliente(String nome, String cpf, int nconta, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.nconta = nconta;
        this.tel = tel;
    }



    public Cliente() {
    }


    public Cliente(Object nome2, Object cpf2, Object object, Object tel2) {
        //TODO Auto-generated constructor stub
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getNconta() {
        return nconta;
    }


    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }


    //public void criarBanco() {
        //ArrayList<Cliente> lista = new ArrayList<Cliente>();
        // Cliente c1 = new Cliente("Maria", "921.427.654-58", "453");
        //Cliente c1 = new Cliente(nome, cpf, nconta, tel );
       // lista.add(c1);
   // }


    public void RandomConta(){
        Random random = new Random();
        int randomConta = 10000 + random.nextInt(90000);
        nconta = randomConta;
    }

    
}
