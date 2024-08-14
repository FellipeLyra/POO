class Fisica extends Cliente{
    private String cpf;
    private boolean possuiEmprestimo;
    

    public Fisica(String nome, String telefone, String endereco, String cpf, boolean possuiEmprestimo) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.possuiEmprestimo = possuiEmprestimo;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isPossuiEmprestimo() {
        return possuiEmprestimo;
    }

    public void setPossuiEmprestimo(boolean possuiEmprestimo) {
        this.possuiEmprestimo = possuiEmprestimo;
    }


    public boolean podeAlugar(){
        return !possuiEmprestimo;
    }

    public void registrarEmprestimo(){
        this.possuiEmprestimo = true;
    }
    

    public void finalizarEmprestimo(){
        this.possuiEmprestimo = false;
    }
    
}
