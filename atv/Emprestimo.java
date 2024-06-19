import java.util.Date;

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private Date dataEmprestimo;
    private int numeroRenovacoes;

    public Emprestimo(Publicacao publicacao, Usuario usuario, Date dataEmprestimo) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.numeroRenovacoes = 0;
    }

    // Getters e Setters
    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public int getNumeroRenovacoes() {
        return numeroRenovacoes;
    }

    public void renovarEmprestimo() {
        this.numeroRenovacoes++;
    }

    public double calcularMulta() {
        return publicacao.calcularMulta(numeroRenovacoes);
    }
}
