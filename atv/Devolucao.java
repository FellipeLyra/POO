import java.util.Date;

public class Devolucao {
    private Date dataDevolucao;
    private boolean devolucaoComAtraso;
    private double multa;
    private Publicacao publicacao;
    private Usuario usuario;

    public Devolucao(Date dataDevolucao, boolean devolucaoComAtraso, double multa, Publicacao publicacao, Usuario usuario) {
        this.dataDevolucao = dataDevolucao;
        this.devolucaoComAtraso = devolucaoComAtraso;
        this.multa = multa;
        this.publicacao = publicacao;
        this.usuario = usuario;
    }

    // Getters e Setters

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolucaoComAtraso() {
        return devolucaoComAtraso;
    }

    public void setDevolucaoComAtraso(boolean devolucaoComAtraso) {
        this.devolucaoComAtraso = devolucaoComAtraso;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método toString para representação textual da devolução
    @Override
    public String toString() {
        return "Devolucao{" +
                "dataDevolucao=" + dataDevolucao +
                ", devolucaoComAtraso=" + devolucaoComAtraso +
                ", multa=" + multa +
                ", publicacao=" + publicacao +
                ", usuario=" + usuario.getNome() +
                '}';
    }
}
