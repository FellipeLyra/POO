class Juridica extends Cliente{
    private String nomeRepresentante;
    private String cnpj;
    private int qtdEmprestimos;


    public Juridica(String nome, String telefone, String endereco, String nomeRepresentante, String cnpj,
            int qtdEmprestimos) {
        super(nome, telefone, endereco);
        this.nomeRepresentante = nomeRepresentante;
        this.cnpj = cnpj;
        this.qtdEmprestimos = qtdEmprestimos;
    }


    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdEmprestimos() {
        return qtdEmprestimos;
    }

    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }

    public boolean podeAlugar(){
        return true;
    }

    public void registrarEmprestimo(){
        this.qtdEmprestimos++;
    }
    
    public void finalizarEmprestimo(){
        this.qtdEmprestimos--;
    }

}
