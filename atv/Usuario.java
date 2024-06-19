public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private int numeroEmprestimos;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.numeroEmprestimos = 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroEmprestimos() {
        return numeroEmprestimos;
    }

    public void incrementarEmprestimos() {
        this.numeroEmprestimos++;
    }

    public void decrementarEmprestimos() {
        this.numeroEmprestimos--;
    }
}
